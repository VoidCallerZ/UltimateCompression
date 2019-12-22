package com.VoidCallerZ.UltimateCompression.tabs;

import com.VoidCallerZ.UltimateCompression.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltimateCompressionGearTab extends CreativeTabs
{
	public UltimateCompressionGearTab(String label)
	{
		super("ultimatecompressiongeartab");
		this.setBackgroundImageName("ultimatecompressiontab.png");
	}

	public ItemStack createIcon() 
	{
		return new ItemStack(ModItems.COMPRESSED_WOOD_PICKAXE);
	}
}
