package com.VoidCallerZ.UltimateCompression.items.armor;

import java.util.UUID;

import com.VoidCallerZ.UltimateCompression.Main;
import com.VoidCallerZ.UltimateCompression.init.ModItems;
import com.VoidCallerZ.UltimateCompression.util.IHasModel;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements IHasModel
{

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.ULTIMATE_COMPRESSED_GEAR_TAB);
	
		ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
    	Main.m_Proxy.registerItemRenderer(this, 0, "inventory");
    }

    // protected static final UUID EFFECT_NAME_SHORTCOMPNAME_SETPART_UUID =
    // UUID.fromSTring("string generated from main PreInit()")
    // private static final AttributeModifier EFFECT_NAME_SHORTCOMPNAME_SETPART= new
    // AttributeModifier(UUID NAME, "UUID NAME IN STRING", modifierAmount, 0)
    protected static final UUID HEALTH_BOOST_CI_FULL_UUID = UUID.fromString("e2be838c-a98a-43b8-aef6-4dc33dbf8eb3");
    private static final AttributeModifier HEALTH_BOOST_CI_FULL = new AttributeModifier(HEALTH_BOOST_CI_FULL_UUID,"HEALTH_BOOST_CI_FULL_UUID", 8, 0);
    
    protected static final UUID HEALTH_BOOST_CG_FULL_UUID = UUID.fromString("e63163c8-81a5-4dfe-ae1e-f67b50725dda");
    private static final AttributeModifier HEALTH_BOOST_CG_FULL = new AttributeModifier(HEALTH_BOOST_CG_FULL_UUID,"HEALTH_BOOST_CG_FULL_UUID", 16, 0);
    
    protected static final UUID HEALTH_BOOST_CD_FULL_UUID = UUID.fromString("0ee8d979-812a-4689-9e25-9d4bdad31d62");
    private static final AttributeModifier HEALTH_BOOST_CD_FULL = new AttributeModifier(HEALTH_BOOST_CD_FULL_UUID,"HEALTH_BOOST_CD_FULL_UUID", 20, 0);

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(HEALTH_BOOST_CI_FULL);
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.COMPRESSED_IRON_HELMET
				&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.COMPRESSED_IRON_CHESTPLATE
				&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.COMPRESSED_IRON_LEGGINGS
				&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.COMPRESSED_IRON_BOOTS)
		{
		    player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(HEALTH_BOOST_CI_FULL);
		    player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 0, false, false));
		}
		
		player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(HEALTH_BOOST_CG_FULL);
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.COMPRESSED_GOLD_HELMET
				&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.COMPRESSED_GOLD_CHESTPLATE
				&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.COMPRESSED_GOLD_LEGGINGS
				&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.COMPRESSED_GOLD_BOOTS)
		{
		    player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(HEALTH_BOOST_CG_FULL);
		    player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 2, false, false));
		}
		
		player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(HEALTH_BOOST_CD_FULL);
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.COMPRESSED_DIAMOND_HELMET
				&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModItems.COMPRESSED_DIAMOND_CHESTPLATE
				&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.COMPRESSED_DIAMOND_LEGGINGS
				&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.COMPRESSED_DIAMOND_BOOTS)
		{
		    player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(HEALTH_BOOST_CD_FULL);
		    player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10, 0, false, false));
		}
    }
}
