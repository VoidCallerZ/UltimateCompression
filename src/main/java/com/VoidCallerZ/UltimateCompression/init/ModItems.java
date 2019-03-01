package com.VoidCallerZ.UltimateCompression.init;

import java.util.ArrayList;
import java.util.List;

import com.VoidCallerZ.UltimateCompression.items.food.FoodBase;
import com.VoidCallerZ.UltimateCompression.items.food.FoodEffectBase;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Food
	//FoodBase(NAME, AMOUNTOFHALFS, SATURATION, ISANIMALFOOD)
	public static final Item COMPRESSED_APPLE = new FoodBase("compressed_apple", 9, 5f, false);
	public static final Item COMPRESSED_BEETROOT = new FoodBase("compressed_beetroot", 3, 2.5f, false);
	public static final Item COMPRESSED_BEETROOT_SOUP = new FoodBase("compressed_beetroot_soup", 13, 15f, false);
	public static final Item COMPRESSED_BREAD = new FoodBase("compressed_bread", 10, 12f, false);
	public static final Item COMPRESSED_CARROT = new FoodBase("compressed_carrot", 7, 12f, false);
	public static final Item COMPRESSED_COOKIE = new FoodBase("compressed_cookie", 3, 10f, false);
	public static final Item COMPRESSED_GOLDEN_CARROT = new FoodBase("compressed_golden_carrot", 13, 30f, false);
	public static final Item COMPRESSED_MELON_SLICE = new FoodBase("compressed_melon_slice", 3, 2.5f, false);
	public static final Item COMPRESSED_MUSHROOM_STEW = new FoodBase("compressed_mushroom_stew", 13, 26f, false);
	public static final Item COMPRESSED_POISONOUS_POTATO = new FoodBase("compressed_poisonous_potato", 5, 7f, false);
	public static final Item COMPRESSED_PUMPKIN_PIE = new FoodBase("compressed_pumpkin_pie", 17, 10f, false);

	//Fish
	public static final Item COMPRESSED_COOKED_COD = new FoodBase("compressed_cooked_cod", 11, 12f, false);
	public static final Item COMPRESSED_RAW_COD = new FoodBase("compressed_raw_cod", 3, 5f, false);
	public static final Item COMPRESSED_COOKED_SALMON = new FoodBase("compressed_cooked_salmon", 11, 12f, false);
	public static final Item COMPRESSED_RAW_SALMON = new FoodBase("compressed_raw_salmon", 3, 5f, false);
	public static final Item COMPRESSED_PUFFERFISH = new FoodBase("compressed_pufferfish", 3, 1f, false);
	public static final Item COMPRESSED_CLOWNFISH = new FoodBase("compressed_clownfish", 3, 1f, false);
	
	
	//Food_Cooked
	public static final Item COMPRESSED_BAKED_POTATO = new FoodBase("compressed_baked_potato", 12, 12.5f, false);
	public static final Item COMPRESSED_COOKED_CHICKEN = new FoodBase("compressed_cooked_chicken", 12, 15f, false);
	public static final Item COMPRESSED_COOKED_MUTTON = new FoodBase("compressed_cooked_mutton", 12, 21f, false);
	public static final Item COMPRESSED_COOKED_PORKCHOP = new FoodBase("compressed_cooked_porkchop", 16, 28f, false);
	public static final Item COMPRESSED_COOKED_RABBIT = new FoodBase("compressed_cooked_rabbit", 11, 12f, false);
	public static final Item COMPRESSED_STEAK = new FoodBase("compressed_steak", 18, 26.5f, false);
	
	//Food_Raw
	public static final Item COMPRESSED_RAW_BEEF = new FoodBase("compressed_raw_beef", 5, 4f, false);
	public static final Item COMPRESSED_RAW_CHICKEN = new FoodBase("compressed_raw_chicken", 3, 3.5f, false);
	public static final Item COMPRESSED_RAW_MUTTON = new FoodBase("compressed_raw_mutton", 4, 4f, false);
	public static final Item COMPRESSED_RAW_PORKCHOP = new FoodBase("compressed_raw_porkchop", 5, 3.5f, false);
	public static final Item COMPRESSED_RAW_RABBIT = new FoodBase("compressed_raw_rabbit", 5, 3f, false);
	public static final Item COMPRESSED_POTATO = new FoodBase("compressed_potato", 2, 2f, false);
	
	//EffectedFoods
	//FoodEffectBase(NAME, AMOUNTOFHALFS, SATURATION, ISANIMALFOOD, POTIONEFFECT(TYPE, TIME, MULTIPLIER, JUSTDOFALSE, PARTICLES?), ISALWAYSEDIBLE)
	//The time for the effect is "Time in seconds" * 1 tick
	public static final Item COMPRESSED_GOLDEN_APPLE = new FoodEffectBase("compressed_golden_apple", 6, 20f, false, new PotionEffect(MobEffects.ABSORPTION, (300*20), 5, false, true), true);
	public static final Item COMPRESSED_ROTTEN_FLESH = new FoodEffectBase("compressed_rotten_flesh", 8, 1.5f, false, new PotionEffect(MobEffects.HUNGER, (45*20), 2, false, true), true);
	public static final Item COMPRESSED_SPIDER_EYE = new FoodEffectBase("compressed_spider_eye", 4, 7.5f, false, new PotionEffect(MobEffects.POISON, (12*20), 2, false, true), true);
	public static final Item COMPRESSED_RABBIT_STEW = new FoodEffectBase("compressed_rabbit_stew", 20, 5f, false, new PotionEffect(MobEffects.SATURATION, (300*20), 2, false, true), false);
}
