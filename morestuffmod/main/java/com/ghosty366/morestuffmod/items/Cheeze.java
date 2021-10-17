package com.ghosty366.morestuffmod.items;

import com.ghosty366.morestuffmod.MoreStuff;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Cheeze extends Item {
    public Cheeze() {
        super(new Item.Properties()
                .tab(MoreStuff.TAB)
                .food(new Food.Builder()
                        .nutrition(3)
                        .saturationMod(0.2F)
                        .build())
        );
    }
}
