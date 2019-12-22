package com.VoidCallerZ.UltimateCompression.blocks;

import com.VoidCallerZ.UltimateCompression.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedCoalBlockBase extends BlockBase
{
	public CompressedCoalBlockBase(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(Main.ULTIMATE_COMPRESSION_TAB);
	}
}
