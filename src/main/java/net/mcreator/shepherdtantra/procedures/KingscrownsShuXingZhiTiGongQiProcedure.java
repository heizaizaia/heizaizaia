package net.mcreator.shepherdtantra.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.shepherdtantra.init.ShepherdtantraModItems;

public class KingscrownsShuXingZhiTiGongQiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack guow = ItemStack.EMPTY;
		ItemStack guow2 = ItemStack.EMPTY;
		double jiac = 0;
		guow2 = new ItemStack(ShepherdtantraModItems.KINGSARMOR.get()).copy();
		guow2 = new ItemStack(ShepherdtantraModItems.KINGNEWGUN.get()).copy();
		guow2 = new ItemStack(ShepherdtantraModItems.KINGS_EXTENSION.get()).copy();
		guow = new ItemStack(ShepherdtantraModItems.KINGSCROWNS.get()).copy();
		jiac = entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity0.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(guow2) : false) == true) {
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(((jiac + jiac) * 1.5));
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(guow) : false) {
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity4.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(((jiac + jiac) * 0.5));
		}
	}
}
