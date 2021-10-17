package com.ghosty366.morestuffmod.client.model;

import com.ghosty366.morestuffmod.entities.HuskyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class HuskyModel<T extends HuskyEntity> extends EntityModel<T> {

    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer upperBody;
    private final ModelRenderer leg0;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3;
    private final ModelRenderer tail;

	public HuskyModel() {

        head = new ModelRenderer(this);
        head.setPos(1.0F, 13.5F, -7.0F);
        head.texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
        head.texOffs(16, 14).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        head.texOffs(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        head.texOffs(0, 10).addBox(-1.5F, -0.02F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 14.0F, 2.0F);
        setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
        body.texOffs(18, 14).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, true);

        upperBody = new ModelRenderer(this);
        upperBody.setPos(1.0F, 14.0F, -2.0F);
        setRotationAngle(upperBody, 1.5708F, 0.0F, 0.0F);
        upperBody.texOffs(21, 0).addBox(-4.0F, -4.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F, true);

        leg0 = new ModelRenderer(this);
        leg0.setPos(2.5F, 16.0F, 7.0F);
        leg0.texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

        leg1 = new ModelRenderer(this);
        leg1.setPos(-0.5F, 16.0F, 7.0F);
        leg1.texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

        leg2 = new ModelRenderer(this);
        leg2.setPos(2.5F, 16.0F, -4.0F);
        leg2.texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

        leg3 = new ModelRenderer(this);
        leg3.setPos(-0.5F, 16.0F, -4.0F);
        leg3.texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

        tail = new ModelRenderer(this);
        tail.setPos(1.0F, 13.0F, 8.25F);
        setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
        tail.texOffs(9, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);
    }

    

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float test, float netHeadYaw, float headPitch) {
        // TODO Auto-generated method stub
        this.head.xRot = headPitch * ((float)Math.PI / 180F);
        this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);
        this.body.xRot = ((float)Math.PI / 2F);
        this.leg0.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leg1.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg2.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg3.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
            float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        // TODO Auto-generated method stub
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        upperBody.render(matrixStack, buffer, packedLight, packedOverlay);
        leg0.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        leg3.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
