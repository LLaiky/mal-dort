
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maldort.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.maldort.enchantment.EncantmintEnchantment;
import net.mcreator.maldort.MalDortMod;

public class MalDortModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MalDortMod.MODID);
	public static final RegistryObject<Enchantment> ENCANTMINT = REGISTRY.register("encantmint", () -> new EncantmintEnchantment());
}
