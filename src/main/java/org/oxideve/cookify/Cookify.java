package org.oxideve.cookify;

import net.fabricmc.api.ModInitializer;

import org.oxideve.cookify.block.ModBlocks;
import org.oxideve.cookify.block.entity.ModBlockEntities;
import org.oxideve.cookify.item.ModItems;
import org.oxideve.cookify.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cookify implements ModInitializer {
	public static final String MOD_ID = "cookify";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBEs();

		ModScreenHandlers.registerScreenHandlers();
	}
}