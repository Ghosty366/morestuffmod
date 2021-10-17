package com.ghosty366.morestuffmod.items;

import com.ghosty366.morestuffmod.MoreStuff;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pizza extends Item {
    public Pizza() {
        super(new Properties()
                .tab(MoreStuff.TAB)
                .food(new Food.Builder()
                        .nutrition(6)
                        .saturationMod(1.3F)
                        .build())
        );
    }
}
