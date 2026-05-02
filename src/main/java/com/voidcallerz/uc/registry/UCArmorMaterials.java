package com.voidcallerz.uc.registry;

import com.voidcallerz.uc.ModConstants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * In Forge/NeoForge 1.21.1, ArmorMaterial IS registered via DeferredRegister.
 * The constructor order is:
 *   (Map<Type,Integer> defense,
 *    int enchantability,
 *    Holder<SoundEvent> equipSound,
 *    Supplier<Ingredient> repairIngredient,
 *    List<Layer> layers,
 *    float toughness,
 *    float knockbackResistance)
 *
 * Durability is NOT in the constructor — it is set on each ArmorItem via
 * Item.Properties.durability(int) using ArmorMaterial.getDurabilityForType().
 *
 * ArmorItem constructor: (Holder<ArmorMaterial>, ArmorItem.Type, Item.Properties)
 * The Holder is obtained from the RegistryObject via asHolder().
 */
public class UCArmorMaterials {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
        DeferredRegister.create(Registries.ARMOR_MATERIAL, ModConstants.MOD_ID);

    // Durability multipliers (vanilla: iron=15, gold=7, diamond=33, netherite=37)
    // We multiply by 9 for compressed variants
    private static final int IRON_DUR      = 15 * 9;
    private static final int GOLD_DUR      = 7  * 9;
    private static final int DIAMOND_DUR   = 33 * 9;
    private static final int NETHERITE_DUR = 37 * 9;

    public static final RegistryObject<ArmorMaterial> COMPRESSED_IRON =
        ARMOR_MATERIALS.register("compressed_iron", () -> new ArmorMaterial(
            defenseMap(3, 7, 6, 3),
            11,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(UCItemRegistry.ALL_ITEMS.get("compressed_iron_ingot").get()),
            List.of(new ArmorMaterial.Layer(
                ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "compressed_iron"))),
            1.0f, 0.0f
        ));

    public static final RegistryObject<ArmorMaterial> COMPRESSED_GOLD =
        ARMOR_MATERIALS.register("compressed_gold", () -> new ArmorMaterial(
            defenseMap(3, 6, 4, 2),
            27,
            SoundEvents.ARMOR_EQUIP_GOLD,
            () -> Ingredient.of(UCItemRegistry.ALL_ITEMS.get("compressed_gold_ingot").get()),
            List.of(new ArmorMaterial.Layer(
                ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "compressed_gold"))),
            0.0f, 0.0f
        ));

    public static final RegistryObject<ArmorMaterial> COMPRESSED_DIAMOND =
        ARMOR_MATERIALS.register("compressed_diamond", () -> new ArmorMaterial(
            defenseMap(4, 8, 7, 4),
            12,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.of(UCItemRegistry.ALL_ITEMS.get("compressed_diamond").get()),
            List.of(new ArmorMaterial.Layer(
                ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "compressed_diamond"))),
            3.0f, 0.0f
        ));

    public static final RegistryObject<ArmorMaterial> COMPRESSED_NETHERITE =
        ARMOR_MATERIALS.register("compressed_netherite", () -> new ArmorMaterial(
            defenseMap(4, 9, 8, 4),
            18,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(UCItemRegistry.ALL_ITEMS.get("compressed_netherite_ingot").get()),
            List.of(new ArmorMaterial.Layer(
                ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "compressed_netherite"))),
            4.0f, 0.2f
        ));

    // -------------------------------------------------------------------------

    public static int getDurability(RegistryObject<ArmorMaterial> material, ArmorItem.Type type) {
        if (material == COMPRESSED_IRON)      return type.getDurability(IRON_DUR);
        if (material == COMPRESSED_GOLD)      return type.getDurability(GOLD_DUR);
        if (material == COMPRESSED_DIAMOND)   return type.getDurability(DIAMOND_DUR);
        if (material == COMPRESSED_NETHERITE) return type.getDurability(NETHERITE_DUR);
        return 100;
    }

    private static Map<ArmorItem.Type, Integer> defenseMap(
            int helmet, int chestplate, int leggings, int boots) {
        Map<ArmorItem.Type, Integer> map = new EnumMap<>(ArmorItem.Type.class);
        map.put(ArmorItem.Type.HELMET,     helmet);
        map.put(ArmorItem.Type.CHESTPLATE, chestplate);
        map.put(ArmorItem.Type.LEGGINGS,   leggings);
        map.put(ArmorItem.Type.BOOTS,      boots);
        return map;
    }
}