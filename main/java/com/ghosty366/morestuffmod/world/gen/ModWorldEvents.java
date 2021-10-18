package com.ghosty366.morestuffmod.world.gen;
import com.ghosty366.morestuffmod.MoreStuff;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = MoreStuff.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        //ModTreeGeneration.generateTrees(event);
    }
}