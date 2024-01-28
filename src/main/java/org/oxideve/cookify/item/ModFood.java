package org.oxideve.cookify.item;

import net.minecraft.item.FoodComponent;

public class ModFood {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(.25f)
            .build();
}
