package com.sanswich.rpgaspects.objects.properties.base;

import java.util.UUID;

import com.sanswich.rpgaspects.objects.init.ItemInit;
import com.sanswich.rpgaspects.system.Main;
import com.sanswich.rpgaspects.system.util.IHasModel;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.TickEvent;


public class ArmourBase extends ItemArmor implements IHasModel{

	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rpgtools);
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
