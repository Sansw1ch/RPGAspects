package com.sanswich.rpgaspects.system.tabs;

import com.sanswich.rpgaspects.objects.init.BlockInit;
import com.sanswich.rpgaspects.objects.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RPG_items extends CreativeTabs{
	public RPG_items(String label) {super("rpg_items");
	}
	public ItemStack getTabIconItem() {return new ItemStack(ItemInit.DRACONIC);}
}
