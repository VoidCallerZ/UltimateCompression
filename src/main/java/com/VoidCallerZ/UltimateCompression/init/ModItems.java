package com.VoidCallerZ.UltimateCompression.init;

import java.util.ArrayList;
import java.util.List;

import com.VoidCallerZ.UltimateCompression.items.ItemBase;
import com.VoidCallerZ.UltimateCompression.items.armor.ArmorBase;
import com.VoidCallerZ.UltimateCompression.items.food.FoodBase;
import com.VoidCallerZ.UltimateCompression.items.food.FoodEffectBase;
import com.VoidCallerZ.UltimateCompression.items.tools.ToolAxe;
import com.VoidCallerZ.UltimateCompression.items.tools.ToolHoe;
import com.VoidCallerZ.UltimateCompression.items.tools.ToolPickaxe;
import com.VoidCallerZ.UltimateCompression.items.tools.ToolSpade;
import com.VoidCallerZ.UltimateCompression.items.tools.ToolSword;
import com.VoidCallerZ.UltimateCompression.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

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
	
	//Tool Materials
	public static final ToolMaterial MATERIAL_COMPRESSED_WOOD = EnumHelper.addToolMaterial("material_compressed_wood", 0, 540, 2.0f, 0, 15);
	public static final ToolMaterial MATERIAL_COMPRESSED_IRON = EnumHelper.addToolMaterial("material_compressed_iron", 2, 2259, 6.0f, 2, 14);
	public static final ToolMaterial MATERIAL_COMPRESSED_GOLD = EnumHelper.addToolMaterial("material_compressed_gold", 0, 297, 6.0f, 2, 14);
	public static final ToolMaterial MATERIAL_COMPRESSED_DIAMOND = EnumHelper.addToolMaterial("material_compressed_diamond", 2, 14058, 12.0f, 0, 22);
		
	//Iron Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_HELMET = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 63, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_CHESTPLATE = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 75, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_LEGGINGS = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 66, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_BOOTS = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 75, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
		
	//Gold Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_HELMET = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 29, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_CHESTPLATE = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 35, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_LEGGINGS = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 31, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_BOOTS = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 35, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
		
	//Diamond Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_HELMET = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 139, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_CHESTPLATE = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 165, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_LEGGINGS = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 145, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_BOOTS = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 165, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
		
	//Tools
	public static final ItemPickaxe COMPRESSED_WOOD_PICKAXE = new ToolPickaxe("compressed_wood_pickaxe", MATERIAL_COMPRESSED_WOOD);
	public static final ItemSpade COMPRESSED_WOOD_SHOVEL = new ToolSpade("compressed_wood_shovel", MATERIAL_COMPRESSED_WOOD);
	public static final ItemSword COMPRESSED_WOOD_SWORD = new ToolSword("compressed_wood_sword", MATERIAL_COMPRESSED_WOOD);
	public static final ItemAxe COMPRESSED_WOOD_AXE = new ToolAxe("compressed_wood_axe", MATERIAL_COMPRESSED_WOOD);
	public static final ItemHoe COMPRESSED_WOOD_HOE = new ToolHoe("compressed_wood_hoe", MATERIAL_COMPRESSED_WOOD);
		
	public static final ItemPickaxe COMPRESSED_IRON_PICKAXE = new ToolPickaxe("compressed_iron_pickaxe", MATERIAL_COMPRESSED_IRON);
	public static final ItemSpade COMPRESSED_IRON_SHOVEL = new ToolSpade("compressed_iron_shovel", MATERIAL_COMPRESSED_IRON);
	public static final ItemSword COMPRESSED_IRON_SWORD = new ToolSword("compressed_iron_sword", MATERIAL_COMPRESSED_IRON);
	public static final ItemAxe COMPRESSED_IRON_AXE = new ToolAxe("compressed_iron_axe", MATERIAL_COMPRESSED_IRON);
	public static final ItemHoe COMPRESSED_IRON_HOE = new ToolHoe("compressed_iron_hoe", MATERIAL_COMPRESSED_IRON);
		
	public static final ItemPickaxe COMPRESSED_GOLD_PICKAXE = new ToolPickaxe("compressed_gold_pickaxe", MATERIAL_COMPRESSED_GOLD);
	public static final ItemSpade COMPRESSED_GOLD_SHOVEL = new ToolSpade("compressed_gold_shovel", MATERIAL_COMPRESSED_GOLD);
	public static final ItemSword COMPRESSED_GOLD_SWORD = new ToolSword("compressed_gold_sword", MATERIAL_COMPRESSED_GOLD);
	public static final ItemAxe COMPRESSED_GOLD_AXE = new ToolAxe("compressed_gold_axe", MATERIAL_COMPRESSED_GOLD);
	public static final ItemHoe COMPRESSED_GOLD_HOE = new ToolHoe("compressed_gold_hoe", MATERIAL_COMPRESSED_GOLD);

	public static final ItemPickaxe COMPRESSED_DIAMOND_PICKAXE = new ToolPickaxe("compressed_diamond_pickaxe", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemSpade COMPRESSED_DIAMOND_SHOVEL = new ToolSpade("compressed_diamond_shovel", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemSword COMPRESSED_DIAMOND_SWORD = new ToolSword("compressed_diamond_sword", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemAxe COMPRESSED_DIAMOND_AXE = new ToolAxe("compressed_diamond_axe", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemHoe COMPRESSED_DIAMOND_HOE = new ToolHoe("compressed_diamond_hoe", MATERIAL_COMPRESSED_DIAMOND);
		
	//Armor
	public static final Item COMPRESSED_IRON_HELMET = new ArmorBase("compressed_iron_helmet", ARMOR_MATERIAL_COMPRESSED_IRON_HELMET, 1, EntityEquipmentSlot.HEAD);
	public static final Item COMPRESSED_IRON_CHESTPLATE = new ArmorBase("compressed_iron_chestplate", ARMOR_MATERIAL_COMPRESSED_IRON_CHESTPLATE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COMPRESSED_IRON_LEGGINGS = new ArmorBase("compressed_iron_leggings", ARMOR_MATERIAL_COMPRESSED_IRON_LEGGINGS, 2, EntityEquipmentSlot.LEGS);
	public static final Item COMPRESSED_IRON_BOOTS = new ArmorBase("compressed_iron_boots", ARMOR_MATERIAL_COMPRESSED_IRON_BOOTS, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COMPRESSED_GOLD_HELMET = new ArmorBase("compressed_gold_helmet", ARMOR_MATERIAL_COMPRESSED_GOLD_HELMET, 1, EntityEquipmentSlot.HEAD);
	public static final Item COMPRESSED_GOLD_CHESTPLATE = new ArmorBase("compressed_gold_chestplate", ARMOR_MATERIAL_COMPRESSED_GOLD_CHESTPLATE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COMPRESSED_GOLD_LEGGINGS = new ArmorBase("compressed_gold_leggings", ARMOR_MATERIAL_COMPRESSED_GOLD_LEGGINGS, 2, EntityEquipmentSlot.LEGS);
	public static final Item COMPRESSED_GOLD_BOOTS = new ArmorBase("compressed_gold_boots", ARMOR_MATERIAL_COMPRESSED_GOLD_BOOTS, 1, EntityEquipmentSlot.FEET);
		
	public static final Item COMPRESSED_DIAMOND_HELMET = new ArmorBase("compressed_diamond_helmet", ARMOR_MATERIAL_COMPRESSED_DIAMOND_HELMET, 1, EntityEquipmentSlot.HEAD);
	public static final Item COMPRESSED_DIAMOND_CHESTPLATE = new ArmorBase("compressed_diamond_chestplate", ARMOR_MATERIAL_COMPRESSED_DIAMOND_CHESTPLATE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COMPRESSED_DIAMOND_LEGGINGS = new ArmorBase("compressed_diamond_leggings", ARMOR_MATERIAL_COMPRESSED_DIAMOND_LEGGINGS, 2, EntityEquipmentSlot.LEGS);
	public static final Item COMPRESSED_DIAMOND_BOOTS = new ArmorBase("compressed_diamond_boots", ARMOR_MATERIAL_COMPRESSED_DIAMOND_BOOTS, 1, EntityEquipmentSlot.FEET);

	public static final Item COMPRESSED_IRON_INGOT = new ItemBase("compressed_iron_ingot");
	public static final Item COMPRESSED_GOLD_INGOT = new ItemBase("compressed_gold_ingot");
	public static final Item COMPRESSED_DIAMOND_GEM = new ItemBase("compressed_diamond_gem");
	
	//Coal
	public static final Item COMPRESSED_COAL = new ItemBase("compressed_coal");
}
