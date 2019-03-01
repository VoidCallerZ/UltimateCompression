package com.VoidCallerZ.UltimateCompression.tabs;

import com.VoidCallerZ.UltimateCompression.init.ModBlocks;
import com.VoidCallerZ.UltimateCompression.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UltimateCompressedFoodTab extends CreativeTabs
{
	public UltimateCompressedFoodTab(String label)
	{
		super("ultimatecompressiontab");
		this.setBackgroundImageName("ultimatecompressiontab.png");
	}

	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.COMPRESSED_APPLE);
	}
}
