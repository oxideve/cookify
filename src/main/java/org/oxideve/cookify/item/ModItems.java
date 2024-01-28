package org.oxideve.cookify.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.oxideve.cookify.Cookify;

public class ModItems {

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFood.TOMATO)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFood.ORANGE)));
    public static final Item MUSH_POPLAR = registerItem("mush_poplar", new Item(new FabricItemSettings().food(ModFood.MUSH_POPLAR)));

    public static final Item MUSH_PORCINI = registerItem("mush_porcini", new Item(new FabricItemSettings().food(ModFood.MUSH_PORCINI)));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Cookify.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Cookify.LOGGER.warn("[" + Cookify.MOD_ID + "] Registering ModItems...");
    }
}
