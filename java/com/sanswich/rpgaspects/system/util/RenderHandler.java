package com.sanswich.rpgaspects.system.util;

import com.sanswich.rpgaspects.entity.entity.EntityHardCreeper;
import com.sanswich.rpgaspects.entity.render.RenderHardCreeper;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityHardCreeper.class, new IRenderFactory<EntityHardCreeper>(){
			@Override
			public Render<? super EntityHardCreeper> createRenderFor(RenderManager manager){
				return new RenderHardCreeper(manager);
			}
		});
	}

}
