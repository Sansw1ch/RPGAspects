package com.sanswich.rpgaspects.system.tabs;

import com.sanswich.rpgaspects.objects.init.BlockInit;
import com.sanswich.rpgaspects.objects.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RPG_blocks extends CreativeTabs{
	public RPG_blocks(String label) {super("rpg_blocks");
	}
	public ItemStack getTabIconItem() {return new ItemStack(BlockInit.BLOCK_DRACONIC);}
}
