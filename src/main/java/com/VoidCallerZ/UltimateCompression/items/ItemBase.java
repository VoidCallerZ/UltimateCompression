package com.VoidCallerZ.UltimateCompression.items;

import com.VoidCallerZ.UltimateCompression.Main;
import com.VoidCallerZ.UltimateCompression.init.ModItems;
import com.VoidCallerZ.UltimateCompression.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.ULTIMATE_COMPRESSION_TAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.m_Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
