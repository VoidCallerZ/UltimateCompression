package com.voidcallerz.uc.registry;

import com.voidcallerz.uc.ModConstants;
import com.voidcallerz.uc.registry.UCOres;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class UCItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, ModConstants.MOD_ID);

    public static final Map<String, RegistryObject<Item>> ALL_ITEMS = new LinkedHashMap<>();

    // Register a BlockItem for every compressed block
    static {
        for (Map.Entry<String, RegistryObject<net.minecraft.world.level.block.Block>> entry
                : UCBlocks.ALL_BLOCKS.entrySet()) {
            String name = entry.getKey();
            RegistryObject<net.minecraft.world.level.block.Block> block = entry.getValue();
            RegistryObject<Item> item = ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties()));
            ALL_ITEMS.put(name, item);
        }
    }

    // -------------------------------------------------------------------------
    // Creative tab — shows all compressed blocks AND all compressed items
    // -------------------------------------------------------------------------
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModConstants.MOD_ID);

    public static final RegistryObject<CreativeModeTab> UC_TAB =
        CREATIVE_TABS.register("uc_tab", () ->
            CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.uc"))
                .icon(() -> UCBlocks.ALL_BLOCKS.values().stream()
                    .findFirst()
                    .map(b -> new ItemStack(b.get()))
                    .orElse(ItemStack.EMPTY))
                .displayItems((params, output) -> {
                    // Compressed blocks
                    ALL_ITEMS.values().forEach(item -> output.accept(item.get()));
                    // Compressed standalone items
                    UCItemRegistry.ALL_ITEMS.values().forEach(item -> output.accept(item.get()));
                    // Compression Catalyst
                    output.accept(UCItemRegistry.UC_COMPRESSOR.get());
                    // Compressed ore blocks
                    UCOres.ALL_ORE_BLOCKS.values().forEach(b -> output.accept(b.get()));
                })
                .build()
        );
}