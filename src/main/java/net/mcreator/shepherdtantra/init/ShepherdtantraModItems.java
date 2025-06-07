
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shepherdtantra.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.shepherdtantra.item.CucaoshuijItem;
import net.mcreator.shepherdtantra.item.Bblack1Item;
import net.mcreator.shepherdtantra.ShepherdtantraMod;

public class ShepherdtantraModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ShepherdtantraMod.MODID);
	public static final DeferredItem<Item> BBLACK_1 = REGISTRY.register("bblack_1", Bblack1Item::new);
	public static final DeferredItem<Item> CUCAOSHUIJ = REGISTRY.register("cucaoshuij", CucaoshuijItem::new);
	public static final DeferredItem<Item> CUCUCAOSHUIJINKUANG = block(ShepherdtantraModBlocks.CUCUCAOSHUIJINKUANG);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
