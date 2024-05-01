package com.natamus.endportalrecipe.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.endportalrecipe.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean mustHaveSilkTouchToBreakPortal = true;
	@Entry public static boolean addBrokenPortalFramesToInventory = true;
	@Entry public static boolean sendMessageOnExtraDragonEggDrop = true;

	public static void initConfig() {
		configMetaData.put("mustHaveSilkTouchToBreakPortal", Arrays.asList(
			"If enabled, players can only break portal frames if they have silk touch on their pickaxe."
		));
		configMetaData.put("addBrokenPortalFramesToInventory", Arrays.asList(
			"If enabled, add portal frames directly to the player's inventory to lower the chance of them being destroyed. Still drops the item entity if the inventory is full."
		));
		configMetaData.put("sendMessageOnExtraDragonEggDrop", Arrays.asList(
			"Whether a message should be sent to the player where the extra dragon egg will drop."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}