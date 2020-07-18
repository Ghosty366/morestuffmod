package com.ghosty366.morestuffmod.items;

import com.ghosty366.morestuffmod.MoreStuff;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Cheeze extends Item {
    public Cheeze() {
        super(new Item.Properties()
                .group(MoreStuff.TAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.2F)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
