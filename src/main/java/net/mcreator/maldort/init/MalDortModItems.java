
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maldort.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.maldort.MalDortMod;

public class MalDortModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MalDortMod.MODID);
	public static final RegistryObject<Item> NIJIKA_BLOCK = block(MalDortModBlocks.NIJIKA_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
