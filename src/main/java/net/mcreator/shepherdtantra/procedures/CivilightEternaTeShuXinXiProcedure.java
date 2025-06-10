package net.mcreator.shepherdtantra.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.shepherdtantra.init.ShepherdtantraModItems;

public class CivilightEternaTeShuXinXiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack yans = ItemStack.EMPTY;
		yans = new ItemStack(ShepherdtantraModItems.KINGS_EXTENSION.get()).copy();
		if (!(entity instanceof Player _plrCldCheck0 && _plrCldCheck0.getCooldowns().isOnCooldown(yans.getItem()))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.05));
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(yans.getItem(), 60);
			}
		}
	}
}
