package com.sanswich.rpgaspects.objects.init;

import java.util.ArrayList;
import java.util.List;

import com.sanswich.rpgaspects.objects.properties.base.Blockbase;
import com.sanswich.rpgaspects.objects.properties.base.ItemBase;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockBuilding1;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockBuilding4;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockGlassHardGlow;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockMetal2;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockMetal2Easy;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockMetal2Hard;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockOre1;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockOre2;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockOre3;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockOre4;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockOreIce;
import com.sanswich.rpgaspects.objects.properties.blocks.BlockOreIce1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockInit {
	public static final List<Block> BLOCKS= new ArrayList<Block>();
	
	//SKYRIM
	//BUILDING BLOCKS
	public static final Block BLOCK_COPPER = new BlockMetal2("copper_block", Material.IRON);
	public static final Block BLOCK_CORUNDUM = new BlockMetal2("corundum_block", Material.IRON);
	public static final Block BLOCK_EBONY = new BlockMetal2Hard("ebony_block", Material.IRON);
	public static final Block BLOCK_ORICHALCUM = new BlockMetal2("orichalcum_block", Material.IRON);
	public static final Block BLOCK_QUICKSILVER = new BlockMetal2Easy("quicksilver_block", Material.IRON);
	public static final Block BLOCK_STALHRIM = new BlockMetal2Hard("stalhrim_block", Material.IRON);
	public static final Block BLOCK_MALACHITE = new BlockMetal2("malachite_block", Material.IRON);
	public static final Block BLOCK_MOONSTONE = new BlockMetal2Easy("moonstone_block", Material.IRON);
	public static final Block BLOCK_DRACONIC = new BlockMetal2Hard("draconic_block", Material.IRON);
	public static final Block BLOCK_AWAKENED_DWARVEN = new BlockMetal2Hard("awakened_dwarven_block", Material.IRON);
	public static final Block BLOCK_SILVER = new BlockMetal2("silver_block", Material.IRON);
	public static final Block BLOCK_STEEL = new BlockMetal2("steel_block", Material.IRON);
	public static final Block BLOCK_RUBY = new BlockMetal2("ruby_block", Material.IRON);
	public static final Block BLOCK_SAPHIRE = new BlockMetal2("saphire_block", Material.IRON);
	public static final Block BLOCK_AMETHYST = new BlockMetal2("amethyst_block", Material.IRON);
	public static final Block BLOCK_GARNET = new BlockMetal2("garnet_block", Material.IRON);
	public static final Block BLOCK_DRAGON = new BlockMetal2("dragon_block", Material.IRON);
	public static final Block BLOCK_MARBLE = new BlockBuilding1("marble", Material.ROCK);
	public static final Block BLOCK_MARBLE_BRICK = new BlockBuilding1("marble_bricks", Material.ROCK);
	public static final Block BLOCK_MARBLE_CRACKED = new BlockBuilding1("marble_cracked", Material.ROCK);
	public static final Block BLOCK_BASALT = new BlockBuilding1("basalt", Material.ROCK);
	public static final Block BLOCK_BASALT_BRICK = new BlockBuilding1("basalt_bricks", Material.ROCK);
	public static final Block BLOCK_BASALT_CRACKED = new BlockBuilding1("basalt_cracked", Material.ROCK);
	public static final Block BLOCK_SMOOTH_OBSIDIAN = new BlockBuilding4("obsidian_smooth", Material.ROCK);
	public static final Block BLOCK_OBSIDIAN_BRICK = new BlockBuilding4("obsidian_bricks", Material.ROCK);
	public static final Block BLOCK_QUARRIED = new BlockBuilding1("quarried", Material.ROCK);
	public static final Block BLOCK_JADE = new BlockMetal2("jade_block", Material.IRON);
	public static final Block BLOCK_QUARRIED_BRICKS = new BlockBuilding1("quarried_bricks", Material.ROCK);
	public static final Block BLOCK_QUARRIEDSTONE = new BlockBuilding1("quarriedstone", Material.ROCK);
	public static final Block BLOCK_ENERGISED_REDSTONE = new BlockMetal2Hard("energised_redstone_block", Material.IRON);
	public static final Block BLOCK_ENERGISED_GLOWSTONE = new BlockGlassHardGlow("energised_glowstone_block", Material.GLASS);
	public static final Block BLOCK_DWARVEN = new BlockMetal2("dwarven_block", Material.IRON);
	public static final Block BLOCK_ELVEN = new BlockMetal2("elven_block", Material.IRON);
	public static final Block BLOCK_GLASS = new BlockMetal2Hard("glass_block", Material.IRON);

	//ORES
	public static final Block ORE_JADE = new BlockOre2("jade_ore", Material.ROCK);
	public static final Block ORE_COPPER = new BlockOre1("copper_ore", Material.ROCK);
	public static final Block ORE_CORUNDUM = new BlockOre1("corundum_ore", Material.ROCK);
	public static final Block ORE_EBONY = new BlockOre4("ebony_ore", Material.ROCK);
	public static final Block ORE_ORICHALCUM = new BlockOre3("orichalcum_ore", Material.ROCK);
	public static final Block ORE_QUICKSILVER = new BlockOre1("quicksilver_ore", Material.ROCK);
	public static final Block ORE_STALHRIM = new BlockOreIce1("stalhrim_ore", Material.ROCK);
	public static final Block ORE_STALHRIM_ICE = new BlockOreIce("stalhrim_ore_ice", Material.GLASS);
	public static final Block ORE_MALACHITE = new BlockOre3("malachite_ore", Material.ROCK);
	public static final Block ORE_MOONSTONE = new BlockOre3("moonstone_ore", Material.ROCK);
	public static final Block ORE_SILVER = new BlockOre2("silver_ore", Material.ROCK);
	public static final Block ORE_RUBY = new BlockOre2("ruby_ore", Material.ROCK);
	public static final Block ORE_SAPHIRE = new BlockOre2("saphire_ore", Material.ROCK);
	public static final Block ORE_AMETHYST = new BlockOre2("amethyst_ore", Material.ROCK);
	
	
	
	// _1_ #Implement all Blocks and Functions
	// _2_ #Create Block and Textures for new dimension
	//public static final Block BLOCK_DAEDRIC = new Blockbase("block_daedric", Material.IRON);	
	//MARBLE, QUARRIEDSTONE, BASALT needs slabs, stairs
	//ORE NEED TO BE MADE
	
	//DECOR BLOCKS
	/*
	public static final Block BLOCK_OBLIVION = new Blockbase("block_oblivion", Material.IRON);
	public static final Block BLOCK_OBLIVION_PORTAL = new Blockbase("block_oblivion_portal", Material.IRON);
	public static final Block BLOCK_FORGE = new Blockbase("block_forge", Material.IRON);
	public static final Block BLOCK_WORKBENCH = new Blockbase("block_workbench", Material.IRON);
	public static final Block BLOCK_ENCHANTER = new Blockbase("block_enchanter", Material.IRON);
	public static final Block BLOCK_ARCANE = new Blockbase("block_arcane", Material.IRON);
	public static final Block BLOCK_TROLLSKULL= new Blockbase("block_trollskull",Material.ROCK);
	*/
	//RESTONE
	//LOCKED CHEST, DOOR, IRON DOOR

}
