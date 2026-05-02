package com.voidcallerz.uc.registry;

import com.voidcallerz.uc.ModConstants;
import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public class UCEquipment {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, ModConstants.MOD_ID);

    public static final Map<String, RegistryObject<Item>> ALL_EQUIPMENT = new LinkedHashMap<>();

    // =========================================================================
    // TOOL SETS — all take (Tier, Item.Properties) in 1.21.1
    // =========================================================================

    private static final Object[][] TOOL_TIERS = {
        { "wood",      UCToolTiers.COMPRESSED_WOOD      },
        { "stone",     UCToolTiers.COMPRESSED_STONE     },
        { "iron",      UCToolTiers.COMPRESSED_IRON      },
        { "gold",      UCToolTiers.COMPRESSED_GOLD      },
        { "diamond",   UCToolTiers.COMPRESSED_DIAMOND   },
        { "netherite", UCToolTiers.COMPRESSED_NETHERITE },
    };

    static {
        for (Object[] entry : TOOL_TIERS) {
            String      mat  = (String)      entry[0];
            UCToolTiers tier = (UCToolTiers) entry[1];
            String      pre  = "compressed_" + mat;

            reg(pre + "_sword",   () -> new SwordItem(tier,   new Item.Properties()));
            reg(pre + "_pickaxe", () -> new PickaxeItem(tier, new Item.Properties()));
            reg(pre + "_axe",     () -> new AxeItem(tier,     new Item.Properties()));
            reg(pre + "_shovel",  () -> new ShovelItem(tier,  new Item.Properties()));
            reg(pre + "_hoe",     () -> new HoeItem(tier,     new Item.Properties()));
        }
    }

    // =========================================================================
    // ARMOR SETS
    // ArmorItem(Holder<ArmorMaterial>, ArmorItem.Type, Item.Properties)
    // Durability is set per-piece via Item.Properties.durability()
    // =========================================================================

    static {
        armorSet("iron",      UCArmorMaterials.COMPRESSED_IRON);
        armorSet("gold",      UCArmorMaterials.COMPRESSED_GOLD);
        armorSet("diamond",   UCArmorMaterials.COMPRESSED_DIAMOND);
        armorSet("netherite", UCArmorMaterials.COMPRESSED_NETHERITE);
    }

    private static void armorSet(String mat, RegistryObject<ArmorMaterial> materialObj) {
        String pre = "compressed_" + mat;
        for (ArmorItem.Type type : new ArmorItem.Type[]{
                ArmorItem.Type.HELMET, ArmorItem.Type.CHESTPLATE,
                ArmorItem.Type.LEGGINGS, ArmorItem.Type.BOOTS}) {

            String name = pre + "_" + type.getName();
            // In Forge 52 / 1.21.1, use getHolder().orElseThrow() inside the
            // supplier lambda — it resolves lazily after registration is complete
            final ArmorItem.Type finalType = type;
            reg(name, () -> new ArmorItem(
                materialObj.getHolder().orElseThrow(),
                finalType,
                new Item.Properties()
                    .durability(UCArmorMaterials.getDurability(materialObj, finalType))
            ));
        }
    }

    // =========================================================================

    private static void reg(String name, Supplier<Item> supplier) {
        ALL_EQUIPMENT.put(name, ITEMS.register(name, supplier));
    }
}