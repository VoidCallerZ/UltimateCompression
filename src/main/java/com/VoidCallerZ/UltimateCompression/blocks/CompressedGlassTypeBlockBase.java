package com.VoidCallerZ.UltimateCompression.blocks;

import com.VoidCallerZ.UltimateCompression.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;

public class CompressedGlassTypeBlockBase extends BlockBase
{
	public CompressedGlassTypeBlockBase(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(10.0f);
		setResistance(30.0f);
		//setHarvestLevel("shovel", 0);
		setCreativeTab(Main.ULTIMATE_COMPRESSION_TAB);
		//setLightLevel(Sets amount of light coming from the block 1 - 15);
		setLightOpacity(1);
		//setBlockUnbreakable(Makes block unbreakable);
	}
	
}