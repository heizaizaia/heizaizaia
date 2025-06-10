package net.mcreator.shepherdtantra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.client.Minecraft;

import net.mcreator.shepherdtantra.init.ShepherdtantraModItems;

public class KingscrownsWanJiaWanChengShiYongWuPinShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack gw = ItemStack.EMPTY;
		ItemStack gw1 = ItemStack.EMPTY;
		InteractionResult gwn = InteractionResult.PASS;
		gw = new ItemStack(ShepherdtantraModItems.KINGSCROWNS.get()).copy();
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(gw);
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = gw;
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
