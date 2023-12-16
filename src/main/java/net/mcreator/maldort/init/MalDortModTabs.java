
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maldort.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.maldort.MalDortMod;

public class MalDortModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MalDortMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAL_DORT_INVENTORY_TAB = REGISTRY.register("mal_dort_inventory_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mal_dort.mal_dort_inventory_tab")).icon(() -> new ItemStack(MalDortModItems.DOWRITO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MalDortModItems.DOWRITO.get());
				tabData.accept(MalDortModBlocks.NIJIKA_BLOCK.get().asItem());
				tabData.accept(MalDortModItems.DOWRITO_PICKAXE.get());
				tabData.accept(MalDortModItems.TURSU_SUYU.get());
				tabData.accept(MalDortModItems.KAVANOZ.get());
				tabData.accept(MalDortModItems.SU_KAVANOZ.get());
				tabData.accept(MalDortModBlocks.TROPHY_NJ.get().asItem());
			})

					.build());
}
