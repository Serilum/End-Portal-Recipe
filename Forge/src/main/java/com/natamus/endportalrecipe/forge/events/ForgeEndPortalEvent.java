package com.natamus.endportalrecipe.forge.events;

import com.natamus.endportalrecipe.events.EndPortalEvent;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeEndPortalEvent {
	public static void registerEventsInBus() {
		BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeEndPortalEvent.class);
	}

	@SubscribeEvent
	public static void mobItemDrop(LivingDropsEvent e) {
		Entity entity = e.getEntity();
		EndPortalEvent.mobItemDrop(entity.level(), entity, e.getSource());
	}

	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickBlock e) {
		EndPortalEvent.onLeftClick(e.getLevel(), e.getEntity(), e.getPos(), e.getFace());
	}
}
