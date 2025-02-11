package com.vortexole;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shulkerfix implements ModInitializer {
	public static final String MOD_ID = "shulkerfix";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("ShulkerFix loaded!");
	}
}