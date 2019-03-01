package com.VoidCallerZ.UltimateCompression.items.food;

import com.VoidCallerZ.UltimateCompression.Main;
import com.VoidCallerZ.UltimateCompression.init.ModItems;
import com.VoidCallerZ.UltimateCompression.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ULTIMATE_COMPRESSED_FOOD_TAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.m_Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
