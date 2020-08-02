package com.ghosty366.morestuffmod.client.render;

import com.ghosty366.morestuffmod.MoreStuff;
import com.ghosty366.morestuffmod.client.model.HuskyModel;
import com.ghosty366.morestuffmod.entities.HuskyEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HuskyRenderer extends MobRenderer<HuskyEntity, HuskyModel<HuskyEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MoreStuff.MOD_ID, "textures/entity/husky.png");

    public HuskyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HuskyModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(HuskyEntity entity) {
        return TEXTURE;
    }
}
