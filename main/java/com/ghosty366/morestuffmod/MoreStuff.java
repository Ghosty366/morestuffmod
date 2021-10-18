package com.ghosty366.morestuffmod;

import com.ghosty366.morestuffmod.entities.HuskyEntity;
import com.ghosty366.morestuffmod.init.ModEntityTypes;
import com.ghosty366.morestuffmod.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("morestuffghosty366")
public class MoreStuff {
    //private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "morestuffghosty366";

    public MoreStuff() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.HUSKY.get(), HuskyEntity.setCustomAttributes().build());
        });
    }
    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("morestuffTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.CHEEZE.get());
        }
    };

    };

