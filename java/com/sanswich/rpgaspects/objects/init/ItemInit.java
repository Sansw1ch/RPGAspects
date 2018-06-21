package com.sanswich.rpgaspects.objects.init;
import java.util.ArrayList;
import java.util.List;
import com.sanswich.rpgaspects.objects.items.ArmourBase;
import com.sanswich.rpgaspects.objects.items.ItemBase;
import com.sanswich.rpgaspects.objects.items.ToolAxe;
import com.sanswich.rpgaspects.objects.items.ToolHoe;
import com.sanswich.rpgaspects.objects.items.ToolPickaxe;
import com.sanswich.rpgaspects.objects.items.ToolShovel;
import com.sanswich.rpgaspects.objects.items.ToolSword;
import com.sanswich.rpgaspects.objects.items.armor.ArmourLightBoots;
import com.sanswich.rpgaspects.system.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Skyrim
	
	//Material
	//Tool
	public static final ToolMaterial T_STEEL = EnumHelper.addToolMaterial("steel", 3, 300, 6.5F, 2.5F, 18);
	public static final ToolMaterial T_AMETHYST = EnumHelper.addToolMaterial("amethyst", 3, 250, 5.5F, 3.0F, 14);
	public static final ToolMaterial T_RUBY = EnumHelper.addToolMaterial("ruby", 3, 350, 6.0F, 2.0F, 16);
	public static final ToolMaterial T_SAPHIRE = EnumHelper.addToolMaterial("saphire", 3, 310, 6.5F, 2.75F, 15);
	public static final ToolMaterial T_JADE = EnumHelper.addToolMaterial("jade", 4, 200, 10.0F, 2.0F, 22);
	public static final ToolMaterial T_ELVEN = EnumHelper.addToolMaterial("elven", 3, 600, 8.5F, 3.0F, 14);
	public static final ToolMaterial T_DWARVEN = EnumHelper.addToolMaterial("dwarven", 3, 800, 7.5F, 4.0F, 14);
	public static final ToolMaterial T_ORCISH = EnumHelper.addToolMaterial("orcish", 4, 800, 9.5F, 4.0F, 16);
	public static final ToolMaterial T_GLASS = EnumHelper.addToolMaterial("glass", 4, 1000, 8.5F, 4.5F, 16);
	public static final ToolMaterial T_EBONY = EnumHelper.addToolMaterial("ebony", 5, 2000, 10.0F, 6.0F, 18);
	public static final ToolMaterial T_DAEDRIC= EnumHelper.addToolMaterial("daedric", 5, 3000, 11.0F, 7.0F, 18);
	public static final ToolMaterial T_STALHRIM= EnumHelper.addToolMaterial("stalhrim", 5, 3000, 13.0F, 8.0F, 20);
	public static final ToolMaterial T_AWAKENED_DWARVEN = EnumHelper.addToolMaterial("awakened_dwarven", 6, -1, 12.0F, 9.0F, 20);
	public static final ToolMaterial T_DRAGON = EnumHelper.addToolMaterial("dragon", 6, -1, 12.0F, 12.0F, 20);
	public static final ToolMaterial T_SOUL = EnumHelper.addToolMaterial("soul", 7, -1, 12.0F, 50000000.0F, 30);
	public static final ToolMaterial T_DRACONIC = EnumHelper.addToolMaterial("draconic", 7, -1, 15.0F, 15.0F, 30);

	//Armour
	//Heavy _9_ #Implement differences between light and dark
	public static final ArmorMaterial A_STEEL = EnumHelper.addArmorMaterial("steel", Reference.MOD_ID+":steel", 20, new int[] {2,5,7,2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial A_DWARVEN = EnumHelper.addArmorMaterial("dwarven", Reference.MOD_ID+":dwarven", 24, new int[] {3,6,7,3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial A_ORCISH = EnumHelper.addArmorMaterial("orcish", Reference.MOD_ID+":orcish", 29, new int[] {3,8,8,3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial A_EBONY = EnumHelper.addArmorMaterial("ebony", Reference.MOD_ID+":ebony", 40, new int[] {8,10,16,8}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F);
	public static final ArmorMaterial A_DAEDRIC = EnumHelper.addArmorMaterial("daedric", Reference.MOD_ID+":daedric", 50, new int[] {10,12,20,10}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static final ArmorMaterial A_AWAKENED_DWARVEN = EnumHelper.addArmorMaterial("awakened_dwarven", Reference.MOD_ID+":awakened_dwarven", -1, new int[] {20,24,40,20}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 50.0F);
	public static final ArmorMaterial A_DRAGONBONE = EnumHelper.addArmorMaterial("dragonbone", Reference.MOD_ID+":dragonbone", -1, new int[] {40,48,80,40}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 100.0F);
	public static final ArmorMaterial A_STALHRIM = EnumHelper.addArmorMaterial("stalhrim", Reference.MOD_ID+":stalhrim", 40, new int[] {8,10,16,8}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F);
	//Light
	public static final ArmorMaterial A_ELVEN = EnumHelper.addArmorMaterial("elven", Reference.MOD_ID+":elven", 24, new int[] {3,6,7,3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial A_GLASS = EnumHelper.addArmorMaterial("glass", Reference.MOD_ID+":glass", 29, new int[] {3,8,8,3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial A_STALHRIMLIGHT = EnumHelper.addArmorMaterial("stalhrimlight", Reference.MOD_ID+":stalhrimlight", 40, new int[] {8,10,16,8}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F);
	public static final ArmorMaterial A_DRAGONSCALE = EnumHelper.addArmorMaterial("dragonscale", Reference.MOD_ID+":dragonscale", 50, new int[] {10,12,20,10}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	
	//Ores
	public static final Item COPPER= new ItemBase("copper");
	public static final Item CORUNDUM= new ItemBase("corundum");
	public static final Item DWARVEN= new ItemBase("dwarven");
	public static final Item EBONY= new ItemBase("ebony");
	public static final Item ORICHALCUM= new ItemBase("orcish");
	public static final Item QUICKSILVER= new ItemBase("quicksilver");
	public static final Item MALACHITE= new ItemBase("malachite");
	public static final Item MOONSTONE= new ItemBase("moonstone");
	public static final Item SILVER= new ItemBase("silver");
	public static final Item STEEL= new ItemBase("steel");
	public static final Item STALHRIM= new ItemBase("stalhrim");
	public static final Item RUBY_GEM= new ItemBase("ruby");
	public static final Item AMETHYST_GEM= new ItemBase("amethyst");
	public static final Item SAPHIRE_GEM= new ItemBase("saphire");
	public static final Item GARNET_GEM= new ItemBase("garnet");
	public static final Item SOUL_STONE= new ItemBase("soulstone");
	public static final Item GREAT_SOUL_STONE= new ItemBase("soulstone_great");
	public static final Item GRAND_SOUL_STONE= new ItemBase("soulstone_grand");
	public static final Item BLACK_SOUL_STONE= new ItemBase("soulstone_black");
	public static final Item DRACONIC= new ItemBase("draconic");
	public static final Item JADE_GEM= new ItemBase("jade");
	public static final Item AWAKENED_DWARVEN= new ItemBase("awakened_dwarven");
	public static final Item ENERGISED_REDSTONE= new ItemBase("energised_redstone");
	public static final Item ENERGISED_GLOWSTONE= new ItemBase("energised_glowstone");
	public static final Item ELVEN = new ItemBase("elven");
	public static final Item GLASS_ALLOY = new ItemBase("glass");
	
	//Crafting Items _1_ #Textures needed for below
	public static final Item DAEDRIC_HEART= new ItemBase("daedric_heart");
	public static final Item BEAR_PELT= new ItemBase("bear_pelt");
	public static final Item DWEMER_SCRAP= new ItemBase("dwemer_scrap");
	public static final Item LARGE_DWEMER_SCRAP= new ItemBase("large_dwemer_scrap");
	public static final Item DRAGONBONE= new ItemBase("dragonbone");
	public static final Item DRAGONSCALES= new ItemBase("dragonscales");
	public static final Item WOLF_HIDE= new ItemBase("wolf_hide");
	public static final Item FOX_HIDE= new ItemBase("fox_hide");
	public static final Item SABRE_CAT_HIDE= new ItemBase("sabre_cat_hide");
	public static final Item TOTEM= new ItemBase("totem");
	public static final Item ORB_KNOWLEDGE= new ItemBase("orb_knowledge");
	public static final Item SPIDER_SILK= new ItemBase("spider_silk");
	public static final Item REINFORCED_SILK= new ItemBase("reinforced_silk");
	public static final Item DRACONIC_INFUSED_SILK= new ItemBase("draconic_infused_silk");
//	public static final Item DRAGON_SOUL= new ItemBase("dragon_soul");
//	public static final Item WYVERN_SOUL= new ItemBase("wyvern_soul");
	public static final Item CENTURION_CORE= new ItemBase("centurion_core");
	public static final Item DWEMER_CHUNK= new ItemBase("dwemer_chunk");
	public static final Item AWAKENED_CENTURION_CORE= new ItemBase("awakened_centurion_core");
	public static final Item HAMMER= new ItemBase("hammer");
	
	/*
	public static final Item STAFF_SHAFT= new ItemBase("staff_shaft");
	public static final Item STAFF_HEAD= new ItemBase("staff_head");
	public static final Item STAFF_HILT= new ItemBase("staff_hilt");
	public static final Item ELEMENTAL_GEM= new ItemBase("elemental_gem");
	public static final Item ANCIENT_GEM= new ItemBase("ancient_gem");
	public static final Item ANCIENT_STAFF_SHAFT= new ItemBase("ancient_shaft");
	public static final Item ANCIENT_STAFF_HEAD= new ItemBase("ancient_head");
	public static final Item ANCIENT_STAFF_HILT= new ItemBase("ancient_hilt");
	*/
	/*
	//Tool Item
	public static final Item LOCK= new ItemBase("lock");
	public static final Item KEY= new ItemBase("key");
	public static final Item SKELETON_KEY= new ItemBase("skeleton_key");
	public static final Item ORB_SEEING= new ItemBase("orb_seeing");

	//Food _5_ #Implement food and textures
	public static final Item APPLE_PIE= new ItemBase("");
	public static final Item ASH_HOPPER_MEAT= new ItemBase("");
	public static final Item ASHYAM= new ItemBase("");
	public static final Item BEEF_STEW= new ItemBase("");
	public static final Item BOAR_MEAT= new ItemBase("");
	public static final Item CREAM_TART= new ItemBase("");
	public static final Item BUTTER= new ItemBase("");
	public static final Item CABBAGE= new ItemBase("");
	public static final Item CABBAGE_SOUP= new ItemBase("");
	public static final Item CHARRED_SKEEVER= new ItemBase("");
	public static final Item CLAM= new ItemBase("");
	public static final Item COOKED_BOAR= new ItemBase("");
	public static final Item CHEESE= new ItemBase("");
	public static final Item GOURD= new ItemBase("");
	public static final Item GRILLED_LEAKS= new ItemBase("");
	public static final Item HONEY= new ItemBase("");
	public static final Item HORKER_ASHYAM_STEW= new ItemBase("");
	public static final Item HORKER_MEAT= new ItemBase("");
	public static final Item HORKER_STEW= new ItemBase("");
	public static final Item COOKED_HORKER= new ItemBase("");
	public static final Item COOKED_HORSE= new ItemBase("");
	public static final Item JAZBAY_CROSTATA= new ItemBase("");
	public static final Item LEEK= new ItemBase("");
	public static final Item GOAT= new ItemBase("");
	public static final Item COOKED_GOAT= new ItemBase("");
	public static final Item MAMMOTH_CHEESE= new ItemBase("");
	public static final Item MAMMOTH_MEAT= new ItemBase("");
	public static final Item COOKED_MAMMOTH= new ItemBase("");
	public static final Item MUDCRAB= new ItemBase("");
	public static final Item RAW_PHEASANT= new ItemBase("");
	public static final Item COOKED_PHEASANT= new ItemBase("");
	public static final Item POTATO_SOUP= new ItemBase("");
	public static final Item FLOUR= new ItemBase("");
	public static final Item RAW_SLAUGHTERFISH= new ItemBase("");
	public static final Item COOKED_SLAUGHTERFISH= new ItemBase("");
	public static final Item SWEET_ROLL= new ItemBase("");
	public static final Item TOMATO= new ItemBase("");
	public static final Item VEGETABLE_SOUP= new ItemBase("");
	public static final Item VENISON= new ItemBase("");
	public static final Item COOKED_VENISON= new ItemBase("");
	public static final Item VENISON_STEW= new ItemBase("");
	public static final Item DIAMOND_APPLE= new ItemBase("");
	public static final Item DRAGON_MEAT= new ItemBase("");
	public static final Item COOKED_DRAGON_MEAT= new ItemBase("");
	public static final Item DRAGON_SOUP= new ItemBase("");
	
	//TOME _6_ #Implement magic and textures
	public static final Item TOME_ALTERATION= new ItemBase("");
	public static final Item TOME_DESTRUCTION= new ItemBase("");
	public static final Item TOME_ILLUSION= new ItemBase("");
	public static final Item TOME_CONJURATION= new ItemBase("");
	public static final Item TOME_RESTORATION= new ItemBase("");
	public static final Item TOME_FIRE= new ItemBase("");
	public static final Item TOME_ICE= new ItemBase("");
	public static final Item TOME_SHOCK= new ItemBase("");
	public static final Item TOME_LIGHT= new ItemBase("");
	public static final Item TOME_DARK= new ItemBase("");
	public static final Item TOME_VOID= new ItemBase("");
	public static final Item TOME_WATER= new ItemBase("");
	public static final Item TOME_EARTH= new ItemBase("");
	public static final Item TOME_AIR= new ItemBase("");
	
	//Ingrediants _7_ #Implement items and textures _8_ #Implement potion ingrediants and effects
	public static final Item 
	public static final Item 
	public static final Item 
	*/
	
	//TS _2_ #Textures
	//SWORDS
	public static final Item SWORD_SOULSTONE = new ToolSword("soulstone_sword", T_SOUL);
	public static final Item SWORD_STEEL = new ToolSword("steel_sword", T_STEEL);
	public static final Item SWORD_DWARVEN = new ToolSword("dwarven_sword", T_DWARVEN);
	public static final Item SWORD_EBONY = new ToolSword("ebony_sword", T_EBONY);
	public static final Item SWORD_ORCISH = new ToolSword("orcish_sword", T_ORCISH);
	public static final Item SWORD_GLASS = new ToolSword("glass_sword", T_GLASS);
	public static final Item SWORD_ELVEN = new ToolSword("elven_sword", T_ELVEN);
	public static final Item SWORD_RUBY = new ToolSword("ruby_sword", T_RUBY);
	public static final Item SWORD_AMETHYST = new ToolSword("amethyst_sword", T_AMETHYST);
	public static final Item SWORD_SAPHIRE = new ToolSword("saphire_sword",T_SAPHIRE);
	public static final Item SWORD_JADE = new ToolSword("jade_sword",T_JADE);
	public static final Item SWORD_AWAKENED_DWARVEN = new ToolSword("awakened_dwarven_sword",T_AWAKENED_DWARVEN);
	public static final Item SWORD_DRACONIC = new ToolSword("draconic_sword",T_DRACONIC);
	public static final Item SWORD_DRAGONBONE = new ToolSword("dragonbone_sword",T_DRAGON);
	
	//DAGGERS _5_ #Implement Rest of Weapons
	
	//MACES
	
	//BATTLE AXE
	
	//GREAT SWORD
	
	//WAR HAMMER
	
	//BOW
	
	//CROSSBOW
	
	//ARROW,BOLTS
	
	//Staff
	
	//PICKAXE
	public static final Item PICKAXE_SOULSTONE = new ToolSword("soulstone_pickaxe", T_SOUL);
	public static final Item PICKAXE_STEEL = new ToolPickaxe("steel_pickaxe", T_STEEL);
	public static final Item PICKAXE_DWARVEN = new ToolPickaxe("dwarven_pickaxe", T_DWARVEN);
	public static final Item PICKAXE_EBONY = new ToolPickaxe("ebony_pickaxe", T_EBONY);
	public static final Item PICKAXE_ORCISH = new ToolPickaxe("orcish_pickaxe", T_ORCISH);
	public static final Item PICKAXE_GLASS = new ToolPickaxe("glass_pickaxe", T_GLASS);
	public static final Item PICKAXE_ELVEN = new ToolPickaxe("elven_pickaxe", T_ELVEN);
	public static final Item PICKAXE_RUBY = new ToolPickaxe("ruby_pickaxe", T_RUBY);
	public static final Item PICKAXE_AMETHYST = new ToolPickaxe("amethyst_pickaxe", T_AMETHYST);
	public static final Item PICKAXE_SAPHIRE = new ToolPickaxe("saphire_pickaxe",T_SAPHIRE);
	public static final Item PICKAXE_JADE = new ToolPickaxe("jade_pickaxe",T_JADE);
	public static final Item PICKAXE_AWAKENED_DWARVEN = new ToolPickaxe("awakened_dwarven_pickaxe",T_AWAKENED_DWARVEN);
	public static final Item PICKAXE_DRACONIC= new ToolPickaxe("draconic_pickaxe",T_DRACONIC);
	public static final Item PICKAXE_DRAGONBONE = new ToolPickaxe("dragonbone_pickaxe",T_DRAGON);
	
	//AXE
	public static final Item AXE_SOULSTONE = new ToolSword("soulstone_axe", T_SOUL);
	public static final Item AXE_STEEL = new ToolAxe("steel_axe", T_STEEL);
	public static final Item AXE_DWARVEN = new ToolAxe("dwarven_axe", T_DWARVEN);
	public static final Item AXE_EBONY = new ToolAxe("ebony_axe", T_EBONY);
	public static final Item AXE_ORCISH = new ToolAxe("orcish_axe", T_ORCISH);
	public static final Item AXE_GLASS = new ToolAxe("glass_axe", T_GLASS);
	public static final Item AXE_ELVEN = new ToolAxe("elven_axe", T_ELVEN);
	public static final Item AXE_RUBY = new ToolAxe("ruby_axe", T_RUBY);
	public static final Item AXE_AMETHYST = new ToolAxe("amethyst_axe", T_AMETHYST);
	public static final Item AXE_SAPHIRE = new ToolAxe("saphire_axe",T_SAPHIRE);
	public static final Item AXE_JADE = new ToolAxe("jade_axe",T_JADE);
	public static final Item AXE_AWAKENED_DWARVEN = new ToolAxe("awakened_dwarven_axe",T_AWAKENED_DWARVEN);
	public static final Item AXE_DRACONIC= new ToolAxe("draconic_axe",T_DRACONIC);
	public static final Item AXE_DRAGONBONE = new ToolAxe("dragonbone_axe",T_DRAGON);
	
	//SHOVEL
	public static final Item SHOVEL_SOULSTONE = new ToolSword("soulstone_shovel", T_SOUL);
	public static final Item SHOVEL_STEEL = new ToolShovel("steel_shovel", T_STEEL);
	public static final Item SHOVEL_DWARVEN = new ToolShovel("dwarven_shovel", T_DWARVEN);
	public static final Item SHOVEL_EBONY = new ToolShovel("ebony_shovel", T_EBONY);
	public static final Item SHOVEL_ORCISH = new ToolShovel("orcish_shovel", T_ORCISH);
	public static final Item SHOVEL_GLASS = new ToolShovel("glass_shovel", T_GLASS);
	public static final Item SHOVEL_ELVEN = new ToolShovel("elven_shovel", T_ELVEN);
	public static final Item SHOVEL_RUBY = new ToolShovel("ruby_shovel", T_RUBY);
	public static final Item SHOVEL_AMETHYST = new ToolShovel("amethyst_shovel", T_AMETHYST);
	public static final Item SHOVEL_SAPHIRE = new ToolShovel("saphire_shovel",T_SAPHIRE);
	public static final Item SHOVEL_JADE = new ToolShovel("jade_shovel",T_JADE);
	public static final Item SHOVEL_AWAKENED_DWARVEN = new ToolShovel("awakened_dwarven_shovel",T_AWAKENED_DWARVEN);
	public static final Item SHOVEL_DRACONIC= new ToolShovel("draconic_shovel",T_DRACONIC);
	public static final Item SHOVEL_DRAGONBONE = new ToolShovel("dragonbone_shovel",T_DRAGON);
	
	//HOE
	public static final Item HOE_SOULSTONE = new ToolSword("soulstone_hoe", T_SOUL);
	public static final Item HOE_STEEL = new ToolHoe("steel_hoe", T_STEEL);
	public static final Item HOE_DWARVEN = new ToolHoe("dwarven_hoe", T_DWARVEN);
	public static final Item HOE_EBONY = new ToolHoe("ebony_hoe", T_EBONY);
	public static final Item HOE_ORCISH = new ToolHoe("orcish_hoe", T_ORCISH);
	public static final Item HOE_GLASS = new ToolHoe("glass_hoe", T_GLASS);
	public static final Item HOE_ELVEN = new ToolHoe("elven_hoe", T_ELVEN);
	public static final Item HOE_RUBY = new ToolHoe("ruby_hoe", T_RUBY);
	public static final Item HOE_AMETHYST = new ToolHoe("amethyst_hoe", T_AMETHYST);
	public static final Item HOE_SAPHIRE = new ToolHoe("saphire_hoe",T_SAPHIRE);
	public static final Item HOE_JADE = new ToolHoe("jade_hoe",T_JADE);
	public static final Item HOE_AWAKENED_DWARVEN = new ToolHoe("awakened_dwarven_hoe",T_AWAKENED_DWARVEN);
	public static final Item HOE_DRACONIC= new ToolHoe("draconic_hoe",T_DRACONIC);
	public static final Item HOE_DRAGONBONE = new ToolHoe("dragonbone_hoe",T_DRAGON);
	
	//HEAVY ARMOUR
	//HELMET _3_ #Implement Textures
	public static final Item HELMET_STEEL = new ArmourLightBoots("steel_helmet", A_STEEL, 1 , EntityEquipmentSlot.HEAD);
	public static final Item HELMET_DWARVEN = new ArmourBase("dwarven_helmet", A_DWARVEN, 1 , EntityEquipmentSlot.HEAD);
	public static final Item HELMET_EBONY = new ArmourBase("ebony_helmet",A_EBONY, 1 , EntityEquipmentSlot.HEAD);
	public static final Item HELMET_ORCISH = new ArmourBase("orcish_helmet",A_ORCISH, 1 , EntityEquipmentSlot.HEAD);
	public static final Item HELMET_AWAKENED_DWARVEN = new ArmourBase("awakened_dwarven_helmet",A_AWAKENED_DWARVEN, 1 , EntityEquipmentSlot.HEAD);
	public static final Item HELMET_DAEDRIC = new ArmourBase("daedric_helmet",A_DAEDRIC, 1 , EntityEquipmentSlot.HEAD);
	public static final Item HELMET_DRAGONBONE = new ArmourBase("dragonbone_helmet",A_DRAGONBONE, 1 , EntityEquipmentSlot.HEAD);
	
	//CHESTPLATE
	public static final Item CHESTPLATE_STEEL = new ArmourBase("steel_chestplate", A_STEEL, 1 , EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_DWARVEN = new ArmourBase("dwarven_chestplate", A_DWARVEN, 1 , EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_EBONY = new ArmourBase("ebony_chestplate",A_EBONY, 1 , EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_ORCISH = new ArmourBase("orcish_chestplate",A_ORCISH, 1 , EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_AWAKENED_DWARVEN = new ArmourBase("awakened_dwarven_chestplate",A_AWAKENED_DWARVEN, 1 , EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_DAEDRIC = new ArmourBase("daedric_chestplate",A_DAEDRIC, 1 , EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_DRAGONBONE = new ArmourBase("dragonbone_chestplate",A_DRAGONBONE, 1 , EntityEquipmentSlot.CHEST);	
	
	//LEGGINGS
	public static final Item LEGGINGS_STEEL = new ArmourBase("steel_leggings", A_STEEL, 2 , EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_DWARVEN = new ArmourBase("dwarven_leggings", A_DWARVEN, 2 , EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_EBONY = new ArmourBase("ebony_leggings",A_EBONY, 2 , EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_ORCISH = new ArmourBase("orcish_leggings",A_ORCISH, 2 , EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_AWAKENED_DWARVEN = new ArmourBase("awakened_dwarven_leggings",A_AWAKENED_DWARVEN, 2 , EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_DAEDRIC = new ArmourBase("daedric_leggings",A_DAEDRIC, 2 , EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_DRAGONBONE = new ArmourBase("dragonbone_leggings",A_DRAGONBONE, 2 , EntityEquipmentSlot.LEGS);	
	
	//BOOTS
	public static final Item BOOTS_STEEL = new ArmourBase("steel_boots", A_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_DWARVEN = new ArmourBase("dwarven_boots", A_DWARVEN, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_EBONY = new ArmourBase("ebony_boots",A_EBONY, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_ORCISH = new ArmourBase("orcish_boots",A_ORCISH, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_AWAKENED_DWARVEN = new ArmourBase("awakened_dwarven_boots",A_AWAKENED_DWARVEN, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_DAEDRIC = new ArmourBase("daedric_boots",A_DAEDRIC, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_DRAGONBONE = new ArmourBase("dragonbone_boots",A_DRAGONBONE, 1, EntityEquipmentSlot.FEET);
	
	//LIGHT A _4_ #Implement Items and Textures
	//HELMET
	
	//CHESTPLATE
	
	//LEGGINGS
	
	//BOOTS
	
	//Undertale
    /*WOOD    (0, 59, 2.0F, 0.0F, 15),
    STONE     (1, 131, 4.0F, 1.0F, 5),
    IRON      (2, 250, 6.0F, 2.0F, 14),
    DIAMOND   (3, 1561, 8.0F, 3.0F, 10),
    GOLD      (0, 32, 12.0F, 0.0F, 22);
	(harvestLevel, maxUses, efficiency, damage, enchantability)
    */
	/*
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F); 																					durability, reductionAmounts, enchantability, soundOnEquip, toughness
    */
	}
