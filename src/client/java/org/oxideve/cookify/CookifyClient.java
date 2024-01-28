package org.oxideve.cookify;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import org.oxideve.cookify.item.ModItems;
import org.oxideve.cookify.screen.DeseederScreen;
import org.oxideve.cookify.screen.ModScreenHandlers;
import org.slf4j.LoggerFactory;

public class CookifyClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		HandledScreens.register(ModScreenHandlers.DESEEDER_SCREEN_HANDLER, DeseederScreen::new);
	}
}