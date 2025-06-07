
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shepherdtantra.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.shepherdtantra.ShepherdtantraMod;

public class ShepherdtantraModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShepherdtantraMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SHSHEPHERD = REGISTRY.register("shshepherd",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shepherdtantra.shshepherd")).icon(() -> new ItemStack(ShepherdtantraModItems.BBLACK_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShepherdtantraModItems.BBLACK_1.get());
				tabData.accept(ShepherdtantraModItems.CUCAOSHUIJ.get());
				tabData.accept(ShepherdtantraModBlocks.CUCUCAOSHUIJINKUANG.get().asItem());
				tabData.accept(ShepherdtantraModItems.CCUZHIDUANZAO.get());
			}).build());
}
