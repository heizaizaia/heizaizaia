
package net.mcreator.shepherdtantra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CucaoshuijItem extends Item {
	public CucaoshuijItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(1f).alwaysEdible().build()));
	}
}
