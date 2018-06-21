package com.sanswich.rpgaspects.objects.items;

import com.sanswich.rpgaspects.objects.init.ItemInit;
import com.sanswich.rpgaspects.system.Main;
import com.sanswich.rpgaspects.system.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rpgitems);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
