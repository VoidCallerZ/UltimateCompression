package com.VoidCallerZ.UltimateCompression.init;

import java.util.ArrayList;
import java.util.List;

import com.VoidCallerZ.UltimateCompression.blocks.BlockBase;
import com.VoidCallerZ.UltimateCompression.blocks.CompressedStoneTypeBlockBase;
import com.VoidCallerZ.UltimateCompression.blocks.CompressedWoodTypeBlockBase;
import com.VoidCallerZ.UltimateCompression.blocks.CompressedMetalBlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Diamond Blocks
	public static final Block COMPRESSED_DIAMOND_BLOCK = new CompressedMetalBlockBase("compressed_diamond_block", Material.IRON);
	public static final Block DOUBLE_COMPRESSED_DIAMOND_BLOCK = new CompressedMetalBlockBase("double_compressed_diamond_block", Material.IRON);
	
	//Iron Blocks
	public static final Block COMPRESSED_IRON_BLOCK = new CompressedMetalBlockBase("compressed_iron_block", Material.IRON);
	public static final Block DOUBLE_COMPRESSED_IRON_BLOCK = new CompressedMetalBlockBase("double_compressed_iron_block", Material.IRON);
	
	//Gold Blocks
	public static final Block COMPRESSED_GOLD_BLOCK = new CompressedMetalBlockBase("compressed_gold_block", Material.IRON);
	public static final Block DOUBLE_COMPRESSED_GOLD_BLOCK = new CompressedMetalBlockBase("double_compressed_gold_block", Material.IRON);
	
	//Redstone Blocks
	public static final Block COMPRESSED_REDSTONE_BLOCK = new CompressedStoneTypeBlockBase("compressed_redstone_block", Material.ROCK);
	public static final Block DOUBLE_COMPRESSED_REDSTONE_BLOCK = new CompressedStoneTypeBlockBase("double_compressed_redstone_block", Material.ROCK);
	
	//Emerald Blocks
	public static final Block COMPRESSED_EMERALD_BLOCK = new CompressedMetalBlockBase("compressed_emerald_block", Material.IRON);
	public static final Block DOUBLE_COMPRESSED_EMERALD_BLOCK = new CompressedMetalBlockBase("double_compressed_emerald_block", Material.IRON);
	
	//WoodLog Blocks
	public static final Block COMPRESSED_OAK_LOG = new CompressedWoodTypeBlockBase("compressed_oak_log", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_OAK_LOG = new CompressedWoodTypeBlockBase("double_compressed_oak_log", Material.WOOD);
	public static final Block COMPRESSED_BIRCH_LOG = new CompressedWoodTypeBlockBase("compressed_birch_log", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_BIRCH_LOG = new CompressedWoodTypeBlockBase("double_compressed_birch_log", Material.WOOD);
	public static final Block COMPRESSED_SPRUCE_LOG = new CompressedWoodTypeBlockBase("compressed_spruce_log", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_SPRUCE_LOG = new CompressedWoodTypeBlockBase("double_compressed_spruce_log", Material.WOOD);
	public static final Block COMPRESSED_JUNGLE_LOG = new CompressedWoodTypeBlockBase("compressed_jungle_log", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_JUNGLE_LOG = new CompressedWoodTypeBlockBase("double_compressed_jungle_log", Material.WOOD);
	public static final Block COMPRESSED_ACACIA_LOG = new CompressedWoodTypeBlockBase("compressed_acacia_log", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_ACACIA_LOG = new CompressedWoodTypeBlockBase("double_compressed_acacia_log", Material.WOOD);
	public static final Block COMPRESSED_DARKOAK_LOG = new CompressedWoodTypeBlockBase("compressed_darkoak_log", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_DARKOAK_LOG = new CompressedWoodTypeBlockBase("double_compressed_darkoak_log", Material.WOOD);
	
	//WoodPlank Blocks
	public static final Block COMPRESSED_OAK_PLANKS = new CompressedWoodTypeBlockBase("compressed_oak_planks", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_OAK_PLANKS = new CompressedWoodTypeBlockBase("double_compressed_oak_planks", Material.WOOD);
	public static final Block COMPRESSED_BIRCH_PLANKS = new CompressedWoodTypeBlockBase("compressed_birch_planks", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_BIRCH_PLANKS = new CompressedWoodTypeBlockBase("double_compressed_birch_planks", Material.WOOD);
	public static final Block COMPRESSED_SPRUCE_PLANKS = new CompressedWoodTypeBlockBase("compressed_spruce_planks", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_SPRUCE_PLANKS = new CompressedWoodTypeBlockBase("double_compressed_spruce_planks", Material.WOOD);
	public static final Block COMPRESSED_JUNGLE_PLANKS = new CompressedWoodTypeBlockBase("compressed_jungle_planks", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_JUNGLE_PLANKS = new CompressedWoodTypeBlockBase("double_compressed_jungle_planks", Material.WOOD);
	public static final Block COMPRESSED_ACACIA_PLANKS = new CompressedWoodTypeBlockBase("compressed_acacia_planks", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_ACACIA_PLANKS = new CompressedWoodTypeBlockBase("double_compressed_acacia_planks", Material.WOOD);
	public static final Block COMPRESSED_DARKOAK_PLANKS = new CompressedWoodTypeBlockBase("compressed_darkoak_planks", Material.WOOD);
	public static final Block DOUBLE_COMPRESSED_DARKOAK_PLANKS = new CompressedWoodTypeBlockBase("double_compressed_darkoak_planks", Material.WOOD);
	
	
	//Coal Blocks
	//public static final Block COMPRESSED_COAL_BLOCK = new CompressedCoalBlockBase("compressed_coal_block", Material.ROCK);
	
}
