package com.sanswich.rpgaspects.system.tabs;

import com.sanswich.rpgaspects.objects.init.BlockInit;
import com.sanswich.rpgaspects.objects.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RPG_tools extends CreativeTabs{
	public RPG_tools(String label) {super("rpg_tools");
	}
	public ItemStack getTabIconItem() {return new ItemStack(ItemInit.SWORD_SOULSTONE);}
}
