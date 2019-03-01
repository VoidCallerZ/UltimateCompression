package com.VoidCallerZ.UltimateCompression;

import com.VoidCallerZ.UltimateCompression.proxy.CommonProxy;
import com.VoidCallerZ.UltimateCompression.tabs.UltimateCompressedFoodTab;
import com.VoidCallerZ.UltimateCompression.tabs.UltimateCompressionTab;
import com.VoidCallerZ.UltimateCompression.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{	
	public static final CreativeTabs ULTIMATE_COMPRESSION_TAB = new UltimateCompressionTab("ultimate_compression_tab");
	public static final CreativeTabs ULTIMATE_COMPRESSED_FOOD_TAB = new UltimateCompressedFoodTab("ultimate_compressed_food_tab");
	
	@Instance
	public static Main m_Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy m_Proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
