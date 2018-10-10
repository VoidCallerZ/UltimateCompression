package com.VoidCallerZ.UltimateCompression.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedMetalBlockBase extends BlockBase
{
	public CompressedMetalBlockBase(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		//setLightLevel(Sets amount of light coming from the block 1 - 15);
		//setLightOpacity(Sets the amount of light coming through, like glass 0 - 1);
		//setBlockUnbreakable(Makes block unbreakable);
	}
}
