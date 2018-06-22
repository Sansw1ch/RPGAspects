package com.sanswich.rpgaspects.objects.init;

import com.sanswich.rpgaspects.entity.entity.EntityHardCreeper;
import com.sanswich.rpgaspects.system.Main;
import com.sanswich.rpgaspects.system.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	public static void registerEntities() {
		registerEntity("hardcreeper", EntityHardCreeper.class, Reference.ENTITY_HARDCREEPER, 100, 5351199 ,16711680);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity,int id, int range, int colour1, int colour2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, colour1, colour2);
	}

}
