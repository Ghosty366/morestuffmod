package com.ghosty366.morestuffmod.items;

import com.ghosty366.morestuffmod.MoreStuff;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pepperoni extends Item {
    public Pepperoni() {
        super(new Properties()
                .group(MoreStuff.TAB)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(0.2F)
                        .build())
        );
    }
}
