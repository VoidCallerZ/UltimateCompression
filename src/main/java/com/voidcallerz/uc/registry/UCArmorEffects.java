package com.voidcallerz.uc.registry;

import com.voidcallerz.uc.ModConstants;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

/**
 * Grants potion effects when the player wears a full compressed armor set.
 * Effects are re-applied every 20 ticks with a 40-tick duration
 * so they never expire as long as the full set is worn.
 *
 * Set effects:
 *   Compressed Iron     : Strength I
 *   Compressed Gold     : Speed I
 *   Compressed Diamond  : Strength II
 *   Compressed Netherite: Strength II + Regeneration I + Resistance II
 *
 * MobEffectInstance args:
 *   (effect, duration, amplifier, ambient, visible, showIcon)
 *   amplifier 0 = level I, amplifier 1 = level II
 *   ambient=false, visible=false, showIcon=true — clean HUD icon, no particles
 */
@Mod.EventBusSubscriber(modid = ModConstants.MOD_ID)
public class UCArmorEffects {

    private static final int CHECK_INTERVAL = 20;  // ticks between checks
    private static final int DURATION       = 40;  // effect duration in ticks

    // -------------------------------------------------------------------------
    // Armor set definitions
    // -------------------------------------------------------------------------
    private record ArmorSet(
            String prefix,
            List<MobEffectInstance> effects) {}

    private static final List<ArmorSet> ARMOR_SETS = List.of(

        new ArmorSet("compressed_iron", List.of(
            effect(MobEffects.DAMAGE_BOOST, 0)          // Strength I
        )),

        new ArmorSet("compressed_gold", List.of(
            effect(MobEffects.MOVEMENT_SPEED, 1)        // Speed II
        )),

        new ArmorSet("compressed_diamond", List.of(
            effect(MobEffects.DAMAGE_BOOST, 1),         // Strength II
            effect(MobEffects.DAMAGE_RESISTANCE, 0)     // Resistance I
        )),

        new ArmorSet("compressed_netherite", List.of(
            effect(MobEffects.DAMAGE_BOOST,      1),    // Strength II
            effect(MobEffects.REGENERATION,      0),    // Regeneration I
            effect(MobEffects.DAMAGE_RESISTANCE, 1)     // Resistance II
        ))
    );

    private static MobEffectInstance effect(
            net.minecraft.core.Holder<net.minecraft.world.effect.MobEffect> effect,
            int amplifier) {
        return new MobEffectInstance(effect, DURATION, amplifier, false, false, true);
    }

    // -------------------------------------------------------------------------
    // Tick handler
    // -------------------------------------------------------------------------
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        if (event.player.level().isClientSide()) return;

        Player player = event.player;
        if (player.tickCount % CHECK_INTERVAL != 0) return;

        for (ArmorSet set : ARMOR_SETS) {
            if (isWearingFullSet(player, set.prefix())) {
                for (MobEffectInstance template : set.effects()) {
                    MobEffectInstance current = player.getEffect(template.getEffect());
                    // Re-apply if missing, lower level, or about to expire
                    if (current == null
                            || current.getAmplifier() < template.getAmplifier()
                            || current.getDuration() < CHECK_INTERVAL) {
                        player.addEffect(new MobEffectInstance(
                            template.getEffect(),
                            DURATION,
                            template.getAmplifier(),
                            false, false, true
                        ));
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------
    // Full set detection
    // -------------------------------------------------------------------------
    private static boolean isWearingFullSet(Player player, String prefix) {
        return isPiece(player.getInventory().getArmor(3), prefix + "_helmet")
            && isPiece(player.getInventory().getArmor(2), prefix + "_chestplate")
            && isPiece(player.getInventory().getArmor(1), prefix + "_leggings")
            && isPiece(player.getInventory().getArmor(0), prefix + "_boots");
    }

    private static boolean isPiece(ItemStack stack, String registryName) {
        if (stack.isEmpty()) return false;
        RegistryObject<Item> ro = UCEquipment.ALL_EQUIPMENT.get(registryName);
        if (ro == null || !ro.isPresent()) return false;
        return stack.getItem() == ro.get();
    }
}