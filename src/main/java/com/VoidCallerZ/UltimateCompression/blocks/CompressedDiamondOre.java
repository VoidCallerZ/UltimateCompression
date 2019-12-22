package com.VoidCallerZ.UltimateCompression.blocks;

import java.util.Random;

import com.VoidCallerZ.UltimateCompression.Main;
import com.VoidCallerZ.UltimateCompression.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class CompressedDiamondOre extends BlockBase
{
	public CompressedDiamondOre(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 4);
		setCreativeTab(Main.ULTIMATE_COMPRESSION_TAB);
	}
}
