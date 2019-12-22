package com.VoidCallerZ.UltimateCompression.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.COMPRESSED_POTATO, new ItemStack(ModItems.COMPRESSED_BAKED_POTATO, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.COMPRESSED_RAW_CHICKEN, new ItemStack(ModItems.COMPRESSED_COOKED_CHICKEN, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.COMPRESSED_RAW_COD, new ItemStack(ModItems.COMPRESSED_COOKED_COD, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.COMPRESSED_RAW_MUTTON, new ItemStack(ModItems.COMPRESSED_COOKED_MUTTON, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.COMPRESSED_RAW_PORKCHOP, new ItemStack(ModItems.COMPRESSED_COOKED_PORKCHOP, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.COMPRESSED_RAW_RABBIT, new ItemStack(ModItems.COMPRESSED_COOKED_RABBIT, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.COMPRESSED_RAW_SALMON, new ItemStack(ModItems.COMPRESSED_COOKED_SALMON, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.COMPRESSED_RAW_BEEF, new ItemStack(ModItems.COMPRESSED_STEAK, 1), 1.5f);
		
		GameRegistry.addSmelting(ModBlocks.COMPRESSED_IRON_ORE, new ItemStack(ModItems.COMPRESSED_IRON_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.COMPRESSED_GOLD_ORE, new ItemStack(ModItems.COMPRESSED_GOLD_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.COMPRESSED_DIAMOND_ORE, new ItemStack(ModItems.COMPRESSED_DIAMOND_GEM, 1), 1.5f);
	}
}
