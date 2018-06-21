package com.sanswich.rpgaspects.objects.items;

import com.sanswich.rpgaspects.objects.init.ItemInit;
import com.sanswich.rpgaspects.system.Main;
import com.sanswich.rpgaspects.system.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;


public class ToolShovel extends ItemSpade implements IHasModel{
	
	public ToolShovel(String name, ToolMaterial material) {
		super(material);
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
