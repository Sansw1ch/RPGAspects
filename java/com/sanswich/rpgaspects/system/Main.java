package com.sanswich.rpgaspects.system;

import com.sanswich.rpgaspects.system.proxy.CommonProxy;
import com.sanswich.rpgaspects.system.tabs.RPG_blocks;
import com.sanswich.rpgaspects.system.tabs.RPG_items;
import com.sanswich.rpgaspects.system.tabs.RPG_tools;
import com.sanswich.rpgaspects.system.util.Reference;
import com.sanswich.rpgaspects.system.util.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	public static final CreativeTabs rpgblocks = new RPG_blocks("rpgblocks");
	public static final CreativeTabs rpgitems = new RPG_items("rpgitems");
	public static final CreativeTabs rpgtools = new RPG_tools("rpgtools");
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){RegistryHandler.otherRegistries();}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event){}}
