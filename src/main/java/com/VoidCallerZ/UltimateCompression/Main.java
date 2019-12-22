package com.VoidCallerZ.UltimateCompression;

import java.util.UUID;

import com.VoidCallerZ.UltimateCompression.init.ModRecipes;
import com.VoidCallerZ.UltimateCompression.proxy.CommonProxy;
import com.VoidCallerZ.UltimateCompression.tabs.UltimateCompressionFoodTab;
import com.VoidCallerZ.UltimateCompression.tabs.UltimateCompressionGearTab;
import com.VoidCallerZ.UltimateCompression.tabs.UltimateCompressionTab;
import com.VoidCallerZ.UltimateCompression.util.Reference;
import com.VoidCallerZ.UltimateCompression.util.handlers.FuelHandler;
import com.VoidCallerZ.UltimateCompression.world.ModWorldGeneration;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{	
	public static final CreativeTabs ULTIMATE_COMPRESSION_TAB = new UltimateCompressionTab("ultimate_compression_tab");
	public static final CreativeTabs ULTIMATE_COMPRESSED_FOOD_TAB = new UltimateCompressionFoodTab("ultimate_compressed_food_tab");
	public static final CreativeTabs ULTIMATE_COMPRESSED_GEAR_TAB = new UltimateCompressionGearTab("ultiamte_compressed_gear_tab");
	
	@Instance
	public static Main m_Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy m_Proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
		//System.out.println("Generated UUID: " + UUID.randomUUID());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
