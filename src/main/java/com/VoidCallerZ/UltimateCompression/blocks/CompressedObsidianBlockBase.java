package com.VoidCallerZ.UltimateCompression.blocks;

import com.VoidCallerZ.UltimateCompression.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CompressedObsidianBlockBase extends BlockBase
{
	public CompressedObsidianBlockBase(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(50.0f);
		setResistance(6000.0f);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(Main.ULTIMATE_COMPRESSION_TAB);
		//setLightLevel(Sets amount of light coming from the block 1 - 15);
		//setLightOpacity(Sets the amount of light coming through, like glass 0 - 1);
		//setBlockUnbreakable(Makes block unbreakable);
	}
}
