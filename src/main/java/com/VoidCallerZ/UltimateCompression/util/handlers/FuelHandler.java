package com.VoidCallerZ.UltimateCompression.util.handlers;

import com.VoidCallerZ.UltimateCompression.init.ModBlocks;
import com.VoidCallerZ.UltimateCompression.init.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class FuelHandler
{
	@SubscribeEvent
	public static void furnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event)
	{
		Item item = event.getItemStack().getItem();
		if(item == ModItems.COMPRESSED_COAL)
		{
			event.setBurnTime(15000);
		}
		if(item == Item.getItemFromBlock(ModBlocks.COMPRESSED_COAL_BLOCK))
		{
			event.setBurnTime(135000);
		}
	}
}
