
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

import net.mcreator.maldort.item.TursuSuyuItem;
import net.mcreator.maldort.item.SuKavanozItem;
import net.mcreator.maldort.item.KavanozItem;
import net.mcreator.maldort.item.DowritoPickaxeItem;
import net.mcreator.maldort.item.DowritoItem;
import net.mcreator.maldort.MalDortMod;

public class MalDortModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MalDortMod.MODID);
	public static final RegistryObject<Item> DOWRITO = REGISTRY.register("dowrito", () -> new DowritoItem());
	public static final RegistryObject<Item> NIJIKA_BLOCK = block(MalDortModBlocks.NIJIKA_BLOCK);
	public static final RegistryObject<Item> DOWRITO_PICKAXE = REGISTRY.register("dowrito_pickaxe", () -> new DowritoPickaxeItem());
	public static final RegistryObject<Item> TURSU_SUYU = REGISTRY.register("tursu_suyu", () -> new TursuSuyuItem());
	public static final RegistryObject<Item> KAVANOZ = REGISTRY.register("kavanoz", () -> new KavanozItem());
	public static final RegistryObject<Item> SU_KAVANOZ = REGISTRY.register("su_kavanoz", () -> new SuKavanozItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
