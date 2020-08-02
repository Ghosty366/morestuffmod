package com.ghosty366.morestuffmod.init;

import com.ghosty366.morestuffmod.MoreStuff;
import com.ghosty366.morestuffmod.entities.HuskyEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MoreStuff.MOD_ID);

    // Entity Types
    public static final RegistryObject<EntityType<HuskyEntity>> HUSKY = ENTITY_TYPES.register("husky",
            () -> EntityType.Builder.create(HuskyEntity::new, EntityClassification.CREATURE)
                    .size(1.0F, 1.F)
                    .build(new ResourceLocation(MoreStuff.MOD_ID, "husky").toString()));
}
