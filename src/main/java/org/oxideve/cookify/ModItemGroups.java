package org.oxideve.cookify;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.oxideve.cookify.block.ModBlocks;
import org.oxideve.cookify.item.ModItems;

public class ModItemGroups {
    public static final ItemGroup COOKIFYFOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Cookify.MOD_ID, "cookify"),
            FabricItemGroup.builder().displayName(Text.literal("Cookify. Food"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {

                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.MUSH_POPLAR);
                        entries.add(ModItems.MUSH_PORCINI);


                    }).build());

//    public static final ItemGroup COOKIFYMAC_GROUP = Registry.register(Registries.ITEM_GROUP,
//            new Identifier(Cookify.MOD_ID, "cookifymachines"),
//            FabricItemGroup.builder().displayName(Text.literal("Cookify. Machines"))
//                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {
//
//
//
//
//                    }).build());

    public static final ItemGroup COOKIFYMAC_SEEDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Cookify.MOD_ID, "cookifyseeds"),
            FabricItemGroup.builder().displayName(Text.literal("Cookify. Seeds"))
                    .icon(() -> new ItemStack(ModItems.TOMATO_SEEDS)).entries((displayContext, entries) -> {

                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.ORANGE_SEEDS);

                    }).build());


    public static void registerItemGroups() {
        Cookify.LOGGER.warn("[" + Cookify.MOD_ID + "] Registering ModItemGroups...");
    }
}
