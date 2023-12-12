package com.natamus.endportalrecipe.neoforge.events;

import com.natamus.endportalrecipe.events.EndPortalEvent;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeEndPortalEvent {
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
