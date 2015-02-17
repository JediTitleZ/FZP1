package FizzyClubMods.Donate.Armor;

import net.minecraft.item.Item;
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

@NetworkMod(clientSideRequired = true, serverSideRequired = true, channels={"FizzyClubModsClient"})

public class FizzyClubMain {
	
	@Metadata
	public static ModMetadata meta;
	
	@Instance (FizzyClubMain.MODID)

	public static FizzyClubMain instance;

	@SidedProxy(clientSide = "FizzyClubMods.Donate.Armor.FizzyClubClientProxy", serverSide = "FizzyClubMods.Donate.Armor.FizzyClubServerProxy")
	
	public static FizzyClubServerProxy proxy;
	
	public static final String MODID = "FizzyClubModsDonateArmor";
	public static final String NAME = "FizzyClubModsDonateArmor";
	public static final String VERSION = "1.6.4";
	
	public static Item thekinghelmet;
	public static Item thekingchestplate;
	public static Item thekinglegging;
	public static Item thekingboot;
	
	public static Item thekingplushelmet;
	public static Item thekingpluschestplate;
	public static Item thekingpluslegging;
	public static Item thekingplusboot;
	
	public static Item lavahelmet;
	public static Item lavachestplate;
	public static Item lavalegging;
	public static Item lavaboot;
	
	public static Item lavaplushelmet;
	public static Item lavapluschestplate;
	public static Item lavapluslegging;
	public static Item lavaplusboot;
	
	public static Item pilothelmet;
	public static Item pilotchestplate;
	public static Item pilotlegging;
	public static Item pilotboot;
	
	public static Item pilotplushelmet;
	public static Item pilotpluschestplate;
	public static Item pilotpluslegging;
	public static Item pilotplusboot;
	
	public static Item robothelmet;
	public static Item robotchestplate;
	public static Item robotlegging;
	public static Item robotboot;
	
	public static Item robotplushelmet;
	public static Item robotpluschestplate;
	public static Item robotpluslegging;
	public static Item robotplusboot;
	
	public static Item sherlockholmeshelmet;
	public static Item sherlockholmeschestplate;
	public static Item sherlockholmeslegging;
	public static Item sherlockholmesboot;
	
	public static Item sherlockholmesplushelmet;
	public static Item sherlockholmespluschestplate;
	public static Item sherlockholmespluslegging;
	public static Item sherlockholmesplusboot;
	
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
		
		// Set TheKing Armor
		
		thekinghelmet = new TheKingArmor(5000, FizzyClubEnumBase.TheKingArmors, 0, 0).setUnlocalizedName("thekinghelmet").setTextureName("thekinghelmet");
		LanguageRegistry.addName(thekinghelmet, "TheKing Helmet");
		GameRegistry.registerItem(thekinghelmet, "TheKing Helmet");
		thekingchestplate = new TheKingArmor(5001, FizzyClubEnumBase.TheKingArmors, 0, 1).setUnlocalizedName("thekingchestplate").setTextureName("thekingchestplate");
		LanguageRegistry.addName(thekingchestplate, "TheKing Chestplate");
		GameRegistry.registerItem(thekingchestplate, "TheKing Chestplate");
		thekinglegging = new TheKingArmor(5002, FizzyClubEnumBase.TheKingArmors, 0, 2).setUnlocalizedName("thekinglegging").setTextureName("thekinglegging");
		LanguageRegistry.addName(thekinglegging, "TheKing Legging");
		GameRegistry.registerItem(thekinglegging, "TheKing Legging");
		thekingboot = new TheKingArmor(5003, FizzyClubEnumBase.TheKingArmors, 0, 3).setUnlocalizedName("thekingboot").setTextureName("thekingboot");
		LanguageRegistry.addName(thekingboot, "TheKing Boot");
		GameRegistry.registerItem(thekingboot, "TheKing Boot");
		
		// Set TheKingPlus Armor
		
		thekingplushelmet = new TheKingPlusArmor(5004, FizzyClubEnumBase.TheKingPlusArmors, 0, 0).setUnlocalizedName("thekingplushelmet").setTextureName("thekinghelmet");
		LanguageRegistry.addName(thekingplushelmet, "TheKingPlus Helmet");
		GameRegistry.registerItem(thekingplushelmet, "TheKingPlus Helmet");
		thekingpluschestplate = new TheKingPlusArmor(5005, FizzyClubEnumBase.TheKingPlusArmors, 0, 1).setUnlocalizedName("thekingpluschestplate").setTextureName("thekingchestplate");
		LanguageRegistry.addName(thekingpluschestplate, "TheKingPlus Chestplate");
		GameRegistry.registerItem(thekingpluschestplate, "TheKingPlus Chestplate");
		thekingpluslegging = new TheKingPlusArmor(5006, FizzyClubEnumBase.TheKingPlusArmors, 0, 2).setUnlocalizedName("thekingpluslegging").setTextureName("thekinglegging");
		LanguageRegistry.addName(thekingpluslegging, "TheKingPlus Legging");
		GameRegistry.registerItem(thekingpluslegging, "TheKingPlus Legging");
		thekingplusboot = new TheKingPlusArmor(5007, FizzyClubEnumBase.TheKingPlusArmors, 0, 3).setUnlocalizedName("thekingplusboot").setTextureName("thekingboot");
		LanguageRegistry.addName(thekingplusboot, "TheKingPlus Boot");
		GameRegistry.registerItem(thekingplusboot, "TheKingPlus Boot");

		// Set lava Armor
		
		lavahelmet = new LavaArmor(5008, FizzyClubEnumBase.LavaArmors, 0, 0).setUnlocalizedName("lavahelmet").setTextureName("lavahelmet");
		LanguageRegistry.addName(lavahelmet, "Lava Helmet");
		GameRegistry.registerItem(lavahelmet, "Lava Helmet");
		lavachestplate = new LavaArmor(5009, FizzyClubEnumBase.LavaArmors, 0, 1).setUnlocalizedName("lavachestplate").setTextureName("lavachestplate");
		LanguageRegistry.addName(lavachestplate, "Lava Chestplate");
		GameRegistry.registerItem(lavachestplate, "Lava Chestplate");
		lavalegging = new LavaArmor(5010, FizzyClubEnumBase.LavaArmors, 0, 2).setUnlocalizedName("lavalegging").setTextureName("lavalegging");
		LanguageRegistry.addName(lavalegging, "Lava Legging");
		GameRegistry.registerItem(lavalegging, "Lava Legging");
		lavaboot = new LavaArmor(5011, FizzyClubEnumBase.LavaArmors, 0, 3).setUnlocalizedName("lavaboot").setTextureName("lavaboot");
		LanguageRegistry.addName(lavaboot, "Lava Boot");
		GameRegistry.registerItem(lavaboot, "Lava Boot");

		// Set lavaplus Armor
		
		lavaplushelmet = new LavaPlusArmor(5012, FizzyClubEnumBase.LavaPlusArmors, 0, 0).setUnlocalizedName("lavaplushelmet").setTextureName("lavahelmet");
		LanguageRegistry.addName(lavaplushelmet, "LavaPlus Helmet");
		GameRegistry.registerItem(lavaplushelmet, "LavaPlus Helmet");
		lavapluschestplate = new LavaPlusArmor(5013, FizzyClubEnumBase.LavaPlusArmors, 0, 1).setUnlocalizedName("lavapluschestplate").setTextureName("lavachestplate");
		LanguageRegistry.addName(lavapluschestplate, "LavaPlus Chestplate");
		GameRegistry.registerItem(lavapluschestplate, "LavaPlus Chestplate");
		lavapluslegging = new LavaPlusArmor(5014, FizzyClubEnumBase.LavaPlusArmors, 0, 2).setUnlocalizedName("lavapluslegging").setTextureName("lavalegging");
		LanguageRegistry.addName(lavapluslegging, "LavaPlus Legging");
		GameRegistry.registerItem(lavapluslegging, "LavaPlus Legging");
		lavaplusboot = new LavaPlusArmor(5015, FizzyClubEnumBase.LavaPlusArmors, 0, 3).setUnlocalizedName("lavaplusboot").setTextureName("lavaboot");
		LanguageRegistry.addName(lavaplusboot, "LavaPlus Boot");
		GameRegistry.registerItem(lavaplusboot, "LavaPlus Boot");

		// Set Pilot Armor
		
		pilothelmet = new PilotArmor(5016, FizzyClubEnumBase.PilotArmors, 0, 0).setUnlocalizedName("pilothelmet").setTextureName("pilothelmet");
		LanguageRegistry.addName(pilothelmet, "Pilot Helmet");
		GameRegistry.registerItem(pilothelmet, "Pilot Helmet");
		pilotchestplate = new PilotArmor(5017, FizzyClubEnumBase.PilotArmors, 0, 1).setUnlocalizedName("pilotchestplate").setTextureName("pilotchestplate");
		LanguageRegistry.addName(pilotchestplate, "Pilot Chestplate");
		GameRegistry.registerItem(pilotchestplate, "Pilot Chestplate");
		pilotlegging = new PilotArmor(5018, FizzyClubEnumBase.PilotArmors, 0, 2).setUnlocalizedName("pilotlegging").setTextureName("pilotlegging");
		LanguageRegistry.addName(pilotlegging, "Pilot Legging");
		GameRegistry.registerItem(pilotlegging, "Pilot Legging");
		pilotboot = new PilotArmor(5019, FizzyClubEnumBase.PilotArmors, 0, 3).setUnlocalizedName("pilotboot").setTextureName("pilotboot");
		LanguageRegistry.addName(pilotboot, "Pilot Boot");
		GameRegistry.registerItem(pilotboot, "Pilot Boot");

		// Set PilotPlus Armor
		
		pilotplushelmet = new PilotPlusArmor(5020, FizzyClubEnumBase.PilotPlusArmors, 0, 0).setUnlocalizedName("pilotplushelmet").setTextureName("pilothelmet");
		LanguageRegistry.addName(pilotplushelmet, "PilotPlus Helmet");
		GameRegistry.registerItem(pilotplushelmet, "PilotPlus Helmet");
		pilotpluschestplate = new PilotPlusArmor(5021, FizzyClubEnumBase.PilotPlusArmors, 0, 1).setUnlocalizedName("pilotpluschestplate").setTextureName("pilotchestplate");
		LanguageRegistry.addName(pilotpluschestplate, "PilotPlus Chestplate");
		GameRegistry.registerItem(pilotpluschestplate, "PilotPlus Chestplate");
		pilotpluslegging = new PilotPlusArmor(5022, FizzyClubEnumBase.PilotPlusArmors, 0, 2).setUnlocalizedName("pilotpluslegging").setTextureName("pilotlegging");
		LanguageRegistry.addName(pilotpluslegging, "PilotPlus Legging");
		GameRegistry.registerItem(pilotpluslegging, "PilotPlus Legging");
		pilotplusboot = new PilotPlusArmor(5023, FizzyClubEnumBase.PilotPlusArmors, 0, 3).setUnlocalizedName("pilotplusboot").setTextureName("pilotboot");
		LanguageRegistry.addName(pilotplusboot, "PilotPlus Boot");
		GameRegistry.registerItem(pilotplusboot, "PilotPlus Boot");
		
		// Set Robot Armor
		
		robothelmet = new RobotArmor(5024, FizzyClubEnumBase.RobotArmors, 0, 0).setUnlocalizedName("robothelmet").setTextureName("robothelmet");
		LanguageRegistry.addName(robothelmet, "Robot Helmet");
		GameRegistry.registerItem(robothelmet, "Robot Helmet");
		robotchestplate = new RobotArmor(5025, FizzyClubEnumBase.RobotArmors, 0, 1).setUnlocalizedName("robotchestplate").setTextureName("robotchestplate");
		LanguageRegistry.addName(robotchestplate, "Robot Chestplate");
		GameRegistry.registerItem(robotchestplate, "Robot Chestplate");
		robotlegging = new RobotArmor(5026, FizzyClubEnumBase.RobotArmors, 0, 2).setUnlocalizedName("robotlegging").setTextureName("robotlegging");
		LanguageRegistry.addName(robotlegging, "Robot Legging");
		GameRegistry.registerItem(robotlegging, "Robot Legging");
		robotboot = new RobotArmor(5027, FizzyClubEnumBase.RobotArmors, 0, 3).setUnlocalizedName("robotboot").setTextureName("robotboot");
		LanguageRegistry.addName(robotboot, "Robot Boot");
		GameRegistry.registerItem(robotboot, "Robot Boot");
		
		// Set RobotPlus Armor
		
		robotplushelmet = new RobotPlusArmor(5028, FizzyClubEnumBase.RobotPlusArmors, 0, 0).setUnlocalizedName("robotplushelmet").setTextureName("robothelmet");
		LanguageRegistry.addName(robotplushelmet, "RobotPlus Helmet");
		GameRegistry.registerItem(robotplushelmet, "RobotPlus Helmet");
		robotpluschestplate = new RobotPlusArmor(5029, FizzyClubEnumBase.RobotPlusArmors, 0, 1).setUnlocalizedName("robotpluschestplate").setTextureName("robotchestplate");
		LanguageRegistry.addName(robotpluschestplate, "RobotPlus Chestplate");
		GameRegistry.registerItem(robotpluschestplate, "RobotPlus Chestplate");
		robotpluslegging = new RobotPlusArmor(5030, FizzyClubEnumBase.RobotPlusArmors, 0, 2).setUnlocalizedName("robotpluslegging").setTextureName("robotlegging");
		LanguageRegistry.addName(robotpluslegging, "RobotPlus Legging");
		GameRegistry.registerItem(robotpluslegging, "RobotPlus Legging");
		robotplusboot = new RobotPlusArmor(5031, FizzyClubEnumBase.RobotPlusArmors, 0, 3).setUnlocalizedName("robotplusboot").setTextureName("robotboot");
		LanguageRegistry.addName(robotplusboot, "RobotPlus Boot");
		GameRegistry.registerItem(robotplusboot, "RobotPlus Boot");

		// Set SherlockHolmes Armor
		
		sherlockholmeshelmet = new SherlockHolmesArmor(5032, FizzyClubEnumBase.SherlockHolmesArmors, 0, 0).setUnlocalizedName("sherlockholmeshelmet").setTextureName("sherlockholmeshelmet");
		LanguageRegistry.addName(sherlockholmeshelmet, "SherlockHolmes Helmet");
		GameRegistry.registerItem(sherlockholmeshelmet, "SherlockHolmes Helmet");
		sherlockholmeschestplate = new SherlockHolmesArmor(5033, FizzyClubEnumBase.SherlockHolmesArmors, 0, 1).setUnlocalizedName("sherlockholmeschestplate").setTextureName("sherlockholmeschestplate");
		LanguageRegistry.addName(sherlockholmeschestplate, "SherlockHolmes Chestplate");
		GameRegistry.registerItem(sherlockholmeschestplate, "SherlockHolmes Chestplate");
		sherlockholmeslegging = new SherlockHolmesArmor(5034, FizzyClubEnumBase.SherlockHolmesArmors, 0, 2).setUnlocalizedName("sherlockholmeslegging").setTextureName("sherlockholmeslegging");
		LanguageRegistry.addName(sherlockholmeslegging, "SherlockHolmes Legging");
		GameRegistry.registerItem(sherlockholmeslegging, "SherlockHolmes Legging");
		sherlockholmesboot = new SherlockHolmesArmor(5035, FizzyClubEnumBase.SherlockHolmesArmors, 0, 3).setUnlocalizedName("sherlockholmesboot").setTextureName("sherlockholmesboot");
		LanguageRegistry.addName(sherlockholmesboot, "SherlockHolmes Boot");
		GameRegistry.registerItem(sherlockholmesboot, "SherlockHolmes Boot");
		
		// Set SherlockHolmesPlus Armor
		
		sherlockholmesplushelmet = new SherlockHolmesPlusArmor(5036, FizzyClubEnumBase.SherlockHolmesPlusArmors, 0, 0).setUnlocalizedName("sherlockholmesplushelmet").setTextureName("sherlockholmeshelmet");
		LanguageRegistry.addName(sherlockholmesplushelmet, "SherlockHolmesPlus Helmet");
		GameRegistry.registerItem(sherlockholmesplushelmet, "SherlockHolmesPlus Helmet");
		sherlockholmespluschestplate = new SherlockHolmesPlusArmor(5037, FizzyClubEnumBase.SherlockHolmesPlusArmors, 0, 1).setUnlocalizedName("sherlockholmespluschestplate").setTextureName("sherlockholmeschestplate");
		LanguageRegistry.addName(sherlockholmespluschestplate, "SherlockHolmesPlus Chestplate");
		GameRegistry.registerItem(sherlockholmespluschestplate, "SherlockHolmesPlus Chestplate");
		sherlockholmespluslegging = new SherlockHolmesPlusArmor(5038, FizzyClubEnumBase.SherlockHolmesPlusArmors, 0, 2).setUnlocalizedName("sherlockholmespluslegging").setTextureName("sherlockholmeslegging");
		LanguageRegistry.addName(sherlockholmespluslegging, "SherlockHolmesPlus Legging");
		GameRegistry.registerItem(sherlockholmespluslegging, "SherlockHolmesPlus Legging");
		sherlockholmesplusboot = new SherlockHolmesPlusArmor(5039, FizzyClubEnumBase.SherlockHolmesPlusArmors, 0, 3).setUnlocalizedName("sherlockholmesplusboot").setTextureName("sherlockholmesboot");
		LanguageRegistry.addName(sherlockholmesplusboot, "SherlockHolmesPlus Boot");
		GameRegistry.registerItem(sherlockholmesplusboot, "SherlockHolmesPlus Boot");
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}

}
