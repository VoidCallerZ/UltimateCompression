package com.VoidCallerZ.UltimateCompression.blocks;

import com.VoidCallerZ.UltimateCompression.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedSandTypeBlockBase extends BlockBase
{
	public CompressedSandTypeBlockBase(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.SAND);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("shovel", 0);
		setCreativeTab(Main.ULTIMATE_COMPRESSION_TAB);
		//setLightLevel(Sets amount of light coming from the block 1 - 15);
		//setLightOpacity(Sets the amount of light coming through, like glass 0 - 1);
		//setBlockUnbreakable(Makes block unbreakable);
	}
}
