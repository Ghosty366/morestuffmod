package com.ghosty366.morestuffmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
public class SteelBlock extends Block {
    public SteelBlock() {
        super(Properties.of(Material.METAL)
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                );
    }
}
