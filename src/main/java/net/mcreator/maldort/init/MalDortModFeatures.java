
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maldort.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.maldort.world.features.ores.NijikaBlockFeature;
import net.mcreator.maldort.MalDortMod;

@Mod.EventBusSubscriber
public class MalDortModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MalDortMod.MODID);
	public static final RegistryObject<Feature<?>> NIJIKA_BLOCK = REGISTRY.register("nijika_block", NijikaBlockFeature::new);
}
