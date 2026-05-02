package com.voidcallerz.uc;

import com.voidcallerz.uc.registry.UCBlocks;
import com.voidcallerz.uc.registry.UCItemRegistry;
import com.voidcallerz.uc.registry.UCItems;
import com.voidcallerz.uc.registry.UCOres;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModConstants.MOD_ID)
public class UltimateCompression {
    private static final Logger LOGGER = LogUtils.getLogger();

    public UltimateCompression() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        UCBlocks.BLOCKS.register(modEventBus);
        UCItems.ITEMS.register(modEventBus);

        UCItemRegistry.ITEMS.register(modEventBus);

        UCOres.BLOCKS.register(modEventBus);
        UCOres.ITEMS.register(modEventBus);

        UCItems.CREATIVE_TABS.register(modEventBus);

        LOGGER.info("{} is loading - {} tiers, auto-registration active.", ModConstants.MOD_NAME, ModConstants.TIER_COUNT);
    }
}
