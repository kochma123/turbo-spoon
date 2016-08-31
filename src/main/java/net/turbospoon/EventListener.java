package net.turbospoon;

import net.minecraft.init.Items;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import net.turbospoon.achievements.ModAchievements;

public class EventListener {

	@SubscribeEvent
	public void crafting(ItemCraftedEvent event) {

	}

	@SubscribeEvent
	public void smelting(ItemSmeltedEvent event) {

	}

	@SubscribeEvent
	public void pickup(ItemPickupEvent event) {
		if (event.pickedUp.getEntityItem().getItem() == Items.GOLD_INGOT) {
			event.player.addStat(ModAchievements.achievementStarting, 1);
		}
	}
}
