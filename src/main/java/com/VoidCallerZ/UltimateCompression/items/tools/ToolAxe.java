package com.VoidCallerZ.UltimateCompression.items.tools;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import com.VoidCallerZ.UltimateCompression.Main;
import com.VoidCallerZ.UltimateCompression.init.ModItems;
import com.VoidCallerZ.UltimateCompression.util.IHasModel;
import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 6.0F, -3.2F);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.ULTIMATE_COMPRESSED_GEAR_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.m_Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
