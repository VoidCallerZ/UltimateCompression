package com.VoidCallerZ.UltimateCompression.tabs;

import com.VoidCallerZ.UltimateCompression.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UltimateCompressionTab extends CreativeTabs
{
	public UltimateCompressionTab(String label)
	{
		super("ultimatecompressiontab");
		this.setBackgroundImageName("ultimatecompressiontab.png");
	}

	public ItemStack createIcon() 
	{
		return new ItemStack(Item.getItemFromBlock(ModBlocks.DOUBLE_COMPRESSED_DIAMOND_BLOCK));
	}
}
