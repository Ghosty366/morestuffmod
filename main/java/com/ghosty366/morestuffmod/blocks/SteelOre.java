package com.ghosty366.morestuffmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SteelOre extends OreBlock {
    public SteelOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f, 5.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
