package com.sanswich.rpgaspects.entity.render;

import com.sanswich.rpgaspects.entity.entity.EntityHardCreeper;
import com.sanswich.rpgaspects.entity.model.ModelHardCreeper;
import com.sanswich.rpgaspects.system.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHardCreeper extends RenderLiving<EntityHardCreeper>{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/hardcreeper.png");
	
	
	public RenderHardCreeper(RenderManager manager) {
		super(manager, new ModelHardCreeper(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityHardCreeper entity) {
		return TEXTURES;
	}
	@Override
	protected void applyRotations(EntityHardCreeper entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
