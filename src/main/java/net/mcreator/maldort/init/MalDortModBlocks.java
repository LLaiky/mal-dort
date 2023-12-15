
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maldort.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.maldort.block.NijikaBlockBlock;
import net.mcreator.maldort.MalDortMod;

public class MalDortModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MalDortMod.MODID);
	public static final RegistryObject<Block> NIJIKA_BLOCK = REGISTRY.register("nijika_block", () -> new NijikaBlockBlock());
}
