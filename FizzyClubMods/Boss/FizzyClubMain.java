package FizzyClubMods.Boss;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = FizzyClubMain.MODID, name = FizzyClubMain.NAME, version = FizzyClubMain.VERSION)

@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class FizzyClubMain {
	
	@Metadata
	public static ModMetadata meta;
	
	@Instance (FizzyClubMain.MODID)

	public static FizzyClubMain instance;

	@SidedProxy(clientSide = "FizzyClubMods.Boss.FizzyClubClientProxy", serverSide = "FizzyClubMods.Boss.FizzyClubServerProxy")
	
	public static FizzyClubServerProxy proxy;
	
	public static final String MODID = "FizzyClubModsBoss";
	public static final String NAME = "FizzyClubModsBoss";
	public static final String VERSION = "1.6.4";
	
	public static Item mushrooms;
	public static Item mushroomshelmet;
	public static Item mushroomschestplate;
	public static Item mushroomslegging;
	public static Item mushroomsboot;
	public static Item mushroomssword;
	
	public static Item frankenstein;
	public static Item frankensteinhelmet;
	public static Item frankensteinchestplate;
	public static Item frankensteinlegging;
	public static Item frankensteinboot;
	public static Item frankensteinsword;
	
	public static Item devil;
	public static Item devilhelmet;
	public static Item devilchestplate;
	public static Item devillegging;
	public static Item devilboot;
	public static Item devilsword;
	
	@EventHandler
	public void init(FMLInitializationEvent Event)
	{
		
	}

	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent Event)
	{
		proxy.init();
		
		// Set Mushrooms Boss
		mushrooms = new FizzyClubItem(4000).setUnlocalizedName("mushrooms").setTextureName("mushrooms");
		LanguageRegistry.addName(mushrooms, "Mushrooms");
		GameRegistry.registerItem(mushrooms, "Mushrooms");
		mushroomshelmet = new MushroomsArmor(4001, FizzyClubEnumBase.MushroomsArmors, 0, 0).setUnlocalizedName("mushroomshelmet").setTextureName("mushroomshelmet");
		LanguageRegistry.addName(mushroomshelmet, "Mushrooms Helmet");
		GameRegistry.registerItem(mushroomshelmet, "Mushrooms Helmet");
		GameRegistry.addRecipe(new ItemStack(mushroomshelmet, 1), new Object[]{
			"   ",
			"XXX",
			"X X",
			'X', mushrooms});
		mushroomschestplate = new MushroomsArmor(4002, FizzyClubEnumBase.MushroomsArmors, 0, 1).setUnlocalizedName("mushroomschestplate").setTextureName("mushroomschestplate");
		LanguageRegistry.addName(mushroomschestplate, "Mushrooms ChestPlate");
		GameRegistry.registerItem(mushroomschestplate, "Mushrooms ChestPlate");
		GameRegistry.addRecipe(new ItemStack(mushroomschestplate, 1), new Object[]{
			"X X",
			"XXX",
			"XXX",
			'X', mushrooms});
		mushroomslegging = new MushroomsArmor(4003, FizzyClubEnumBase.MushroomsArmors, 0, 2).setUnlocalizedName("mushroomslegging").setTextureName("mushroomslegging");
		LanguageRegistry.addName(mushroomslegging, "Mushrooms Legging");
		GameRegistry.registerItem(mushroomslegging, "Mushrooms Legging");
		GameRegistry.addRecipe(new ItemStack(mushroomslegging, 1), new Object[]{
			"XXX",
			"X X",
			"X X",
			'X', mushrooms});
		mushroomsboot = new MushroomsArmor(4004, FizzyClubEnumBase.MushroomsArmors, 0, 3).setUnlocalizedName("mushroomsboot").setTextureName("mushroomsboot");
		LanguageRegistry.addName(mushroomsboot, "Mushrooms Boot");
		GameRegistry.registerItem(mushroomsboot, "Mushrooms Boot");
		GameRegistry.addRecipe(new ItemStack(mushroomsboot, 1), new Object[]{
			"   ",
			"X X",
			"X X",
			'X', mushrooms});
		mushroomssword = (new MushroomsSword(4005, FizzyClubEnumBase.MushroomsTools)).setUnlocalizedName("mushroomssword").setTextureName("mushroomssword");
		LanguageRegistry.addName(mushroomssword, "Mushrooms Sword");
		GameRegistry.registerItem(mushroomssword, "Mushrooms Sword");
		GameRegistry.addRecipe(new ItemStack(mushroomssword, 1), new Object[]{
			" Z ",
			"ZZZ",
			" X ",
			'X', Item.stick,'Z', mushrooms});
		
		// Set Frankenstein Boss

				frankenstein = new FizzyClubItem(4006).setUnlocalizedName("frankenstein").setTextureName("frankenstein");
				LanguageRegistry.addName(frankenstein, "Frankenstein");
				GameRegistry.registerItem(frankenstein, "Frankenstein");
				frankensteinhelmet = new FrankensteinArmor(4007, FizzyClubEnumBase.FrankensteinArmors, 0, 0).setUnlocalizedName("frankensteinhelmet").setTextureName("frankensteinhelmet");
				LanguageRegistry.addName(frankensteinhelmet, "Frankenstein Helmet");
				GameRegistry.registerItem(frankensteinhelmet, "Frankenstein Helmet");
				GameRegistry.addRecipe(new ItemStack(frankensteinhelmet, 1), new Object[]{
					"   ",
					"XXX",
					"X X",
					'X', frankenstein});
				frankensteinchestplate = new FrankensteinArmor(4008, FizzyClubEnumBase.FrankensteinArmors, 0, 1).setUnlocalizedName("frankensteinchestplate").setTextureName("frankensteinchestplate");
				LanguageRegistry.addName(frankensteinchestplate, "Frankenstein ChestPlate");
				GameRegistry.registerItem(frankensteinchestplate, "Frankenstein ChestPlate");
				GameRegistry.addRecipe(new ItemStack(frankensteinchestplate, 1), new Object[]{
					"X X",
					"XXX",
					"XXX",
					'X', frankenstein});
				frankensteinlegging = new FrankensteinArmor(4009, FizzyClubEnumBase.FrankensteinArmors, 0, 2).setUnlocalizedName("frankensteinlegging").setTextureName("frankensteinlegging");
				LanguageRegistry.addName(frankensteinlegging, "Frankenstein Legging");
				GameRegistry.registerItem(frankensteinlegging, "Frankenstein Legging");
				GameRegistry.addRecipe(new ItemStack(frankensteinlegging, 1), new Object[]{
					"XXX",
					"X X",
					"X X",
					'X', frankenstein});
				frankensteinboot = new FrankensteinArmor(4010, FizzyClubEnumBase.FrankensteinArmors, 0, 3).setUnlocalizedName("frankensteinboot").setTextureName("frankensteinboot");
				LanguageRegistry.addName(frankensteinboot, "Frankenstein Boot");
				GameRegistry.registerItem(frankensteinboot, "Frankenstein Boot");
				GameRegistry.addRecipe(new ItemStack(frankensteinboot, 1), new Object[]{
					"   ",
					"X X",
					"X X",
					'X', frankenstein});
				frankensteinsword = (new FrankensteinSword(4012, FizzyClubEnumBase.FrankensteinTools)).setUnlocalizedName("frankensteinsword").setTextureName("frankensteinsword");
				LanguageRegistry.addName(frankensteinsword, "Frankenstein Sword");
				GameRegistry.registerItem(frankensteinsword, "Frankenstein Sword");
				GameRegistry.addRecipe(new ItemStack(frankensteinsword, 1), new Object[]{
					" Z ",
					"ZZZ",
					" X ",
					'X', Item.stick,'Z', frankenstein});
				
				// Set Devil Boss
				
				devil = new FizzyClubItem(4013).setUnlocalizedName("devil").setTextureName("devil");
				LanguageRegistry.addName(devil, "Devil");
				GameRegistry.registerItem(devil, "Devil");
				devilhelmet = new DevilArmor(4014, FizzyClubEnumBase.DevilArmors, 0, 0).setUnlocalizedName("devilhelmet").setTextureName("devilhelmet");
				LanguageRegistry.addName(devilhelmet, "Devil Helmet");
				GameRegistry.registerItem(devilhelmet, "Devil Helmet");
				GameRegistry.addRecipe(new ItemStack(devilhelmet, 1), new Object[]{
					"   ",
					"XXX",
					"X X",
					'X', devil});
				devilchestplate = new DevilArmor(4015, FizzyClubEnumBase.DevilArmors, 0, 1).setUnlocalizedName("devilchestplate").setTextureName("devilchestplate");
				LanguageRegistry.addName(devilchestplate, "Devil ChestPlate");
				GameRegistry.registerItem(devilchestplate, "Devil ChestPlate");
				GameRegistry.addRecipe(new ItemStack(devilchestplate, 1), new Object[]{
					"X X",
					"XXX",
					"XXX",
					'X', devil});
				devillegging = new DevilArmor(4016, FizzyClubEnumBase.DevilArmors, 0, 2).setUnlocalizedName("devillegging").setTextureName("devillegging");
				LanguageRegistry.addName(devillegging, "Devil Legging");
				GameRegistry.registerItem(devillegging, "Devil Legging");
				GameRegistry.addRecipe(new ItemStack(devillegging, 1), new Object[]{
					"XXX",
					"X X",
					"X X",
					'X', devil});
				devilboot = new DevilArmor(4017, FizzyClubEnumBase.DevilArmors, 0, 3).setUnlocalizedName("devilboot").setTextureName("devilboot");
				LanguageRegistry.addName(devilboot, "Devil Boot");
				GameRegistry.registerItem(devilboot, "Devil Boot");
				GameRegistry.addRecipe(new ItemStack(devilboot, 1), new Object[]{
					"   ",
					"X X",
					"X X",
					'X', devil});
				devilsword = (new DevilSword(4018, FizzyClubEnumBase.DevilTools)).setUnlocalizedName("devilsword").setTextureName("devilsword");
				LanguageRegistry.addName(devilsword, "Devil Sword");
				GameRegistry.registerItem(devilsword, "Devil Sword");
				GameRegistry.addRecipe(new ItemStack(devilsword, 1), new Object[]{
					" Z ",
					"ZZZ",
					" X ",
					'X', Item.stick,'Z', devil});
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}

}
