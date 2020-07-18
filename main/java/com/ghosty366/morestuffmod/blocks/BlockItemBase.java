package com.ghosty366.morestuffmod.blocks;

import com.ghosty366.morestuffmod.MoreStuff;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(MoreStuff.TAB));
    }
}
