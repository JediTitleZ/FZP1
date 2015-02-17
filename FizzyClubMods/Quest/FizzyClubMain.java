package FizzyClubMods.Quest;

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

	@SidedProxy(clientSide = "FizzyClubMods.Quest.FizzyClubClientProxy", serverSide = "FizzyClubMods.Quest.FizzyClubServerProxy")
	
	public static FizzyClubServerProxy proxy;
	
	public static final String MODID = "FizzyClubModsQuest";
	public static final String NAME = "FizzyClubModsQuest";
	public static final String VERSION = "1.6.4";
	
	public static Item king;
	public static Item kinghelmet;
	public static Item kingchestplate;
	public static Item kinglegging;
	public static Item kingboot;
	
	public static Item queensword;
	
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

				// Set King Armor
		
				kinghelmet = new KingArmor(5514, FizzyClubEnumBase.kingArmors, 0, 0).setUnlocalizedName("kinghelmet").setTextureName("kinghelmet");
				LanguageRegistry.addName(kinghelmet, "king Helmet");
				GameRegistry.registerItem(kinghelmet, "king Helmet");
				kingchestplate = new KingArmor(5515, FizzyClubEnumBase.kingArmors, 0, 1).setUnlocalizedName("kingchestplate").setTextureName("kingchestplate");
				LanguageRegistry.addName(kingchestplate, "king ChestPlate");
				GameRegistry.registerItem(kingchestplate, "king ChestPlate");
				kinglegging = new KingArmor(5516, FizzyClubEnumBase.kingArmors, 0, 2).setUnlocalizedName("kinglegging").setTextureName("kinglegging");
				LanguageRegistry.addName(kinglegging, "king Legging");
				GameRegistry.registerItem(kinglegging, "king Legging");
				kingboot = new KingArmor(5517, FizzyClubEnumBase.kingArmors, 0, 3).setUnlocalizedName("kingboot").setTextureName("kingboot");
				LanguageRegistry.addName(kingboot, "king Boot");
				GameRegistry.registerItem(kingboot, "king Boot");
				
				// Set Queen Sword 
				
				queensword = (new QueenSword(5518, FizzyClubEnumBase.QueenSwords)).setUnlocalizedName("queensword").setTextureName("queensword");
				LanguageRegistry.addName(queensword, "king Sword");
				GameRegistry.registerItem(queensword, "king Sword");
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}

}
