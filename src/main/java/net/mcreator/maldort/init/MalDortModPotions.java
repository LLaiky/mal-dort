
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maldort.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maldort.MalDortMod;

public class MalDortModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MalDortMod.MODID);
	public static final RegistryObject<Potion> TURSU_SUYU_IKSIRI = REGISTRY.register("tursu_suyu_iksiri", () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 25, 2, false, true), new MobEffectInstance(MobEffects.HUNGER, 26, 2, false, true),
			new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, true)));
}
