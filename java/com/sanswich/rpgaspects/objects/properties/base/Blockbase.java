package com.sanswich.rpgaspects.objects.properties.base;

import com.sanswich.rpgaspects.objects.init.BlockInit;
import com.sanswich.rpgaspects.objects.init.ItemInit;
import com.sanswich.rpgaspects.system.Main;
import com.sanswich.rpgaspects.system.util.IHasModel;
import com.sanswich.rpgaspects.system.tabs.RPG_blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Blockbase extends Block implements IHasModel{

	public Blockbase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.rpgblocks);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
