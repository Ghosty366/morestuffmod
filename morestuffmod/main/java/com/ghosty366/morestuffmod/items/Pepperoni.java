package com.ghosty366.morestuffmod.items;

import com.ghosty366.morestuffmod.MoreStuff;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pepperoni extends Item {
    public Pepperoni() {
        super(new Properties()
                .tab(MoreStuff.TAB)
                .food(new Food.Builder()
                        .nutrition(3)
                        .saturationMod(0.2F)
                        .build())
        );
    }
}
