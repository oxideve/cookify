package org.oxideve.cookify.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.oxideve.cookify.Cookify;
import org.oxideve.cookify.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<DeseederBlockEntity> DESEEDER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Cookify.MOD_ID, "deseeder_be"),
                    FabricBlockEntityTypeBuilder.create(DeseederBlockEntity::new,
                            ModBlocks.DESEEDER).build());

    public static void registerBEs() {
        Cookify.LOGGER.warn("[" + Cookify.MOD_ID + "] Registering BEs...");
    }
}
