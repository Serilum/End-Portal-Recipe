package com.natamus.endportalrecipe;

import com.natamus.collective.check.RegisterMod;
import com.natamus.endportalrecipe.neoforge.config.IntegrateNeoForgeConfig;
import com.natamus.endportalrecipe.neoforge.events.NeoForgeEndPortalEvent;
import com.natamus.endportalrecipe.util.Reference;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod(Reference.MOD_ID)
public class ModNeoForge {
	
	public ModNeoForge(IEventBus modEventBus) {
		modEventBus.addListener(this::loadComplete);

		setGlobalConstants();
		ModCommon.init();

		IntegrateNeoForgeConfig.registerScreen(ModLoadingContext.get());

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadComplete(final FMLLoadCompleteEvent event) {
		NeoForge.EVENT_BUS.register(NeoForgeEndPortalEvent.class);
	}

	private static void setGlobalConstants() {

	}
}