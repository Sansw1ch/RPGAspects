package com.sanswich.rpgaspects.objects.items.armor;

import com.sanswich.rpgaspects.objects.items.ArmourBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmourLightLeggings extends ArmourBase{

	public ArmourLightLeggings(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(8), 20, 2,true,false));
    }

}
