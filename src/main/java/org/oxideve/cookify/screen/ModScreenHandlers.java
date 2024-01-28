package org.oxideve.cookify.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.oxideve.cookify.Cookify;

public class ModScreenHandlers {
    public static final ScreenHandlerType<DeseederScreenHandler> DESEEDER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Cookify.MOD_ID, "gem_polishing"),
                    new ExtendedScreenHandlerType<>(DeseederScreenHandler::new));

    public static void registerScreenHandlers() {
        Cookify.LOGGER.info("Registering Screen Handlers for " + Cookify.MOD_ID);
    }
}
