package FizzyClubMods.Donate.Sword;

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

	@SidedProxy(clientSide = "FizzyClubMods.Donate.Sword.FizzyClubClientProxy", serverSide = "FizzyClubMods.Donate.Sword.FizzyClubServerProxy")
	
	public static FizzyClubServerProxy proxy;
	
	public static final String MODID = "FizzyClubModsDonateSword";
	public static final String NAME = "FizzyClubModsDonateSword";
	public static final String VERSION = "1.6.4";
	
	public static Item dragonaxe;
	public static Item dragonaxe1;
	public static Item dragonaxe2;
	public static Item dragonaxe3;
	public static Item dragonaxe4;
	public static Item dragonaxe5;
	public static Item dragonaxe6;
	public static Item dragonaxe7;
	public static Item dragonaxe8;
	public static Item dragonaxe9;
	public static Item dragonaxe10;
	
	public static Item killerscythe;
	public static Item killerscythe1;
	public static Item killerscythe2;
	public static Item killerscythe3;
	public static Item killerscythe4;
	public static Item killerscythe5;
	public static Item killerscythe6;
	public static Item killerscythe7;
	public static Item killerscythe8;
	public static Item killerscythe9;
	public static Item killerscythe10;
	
	public static Item immortalslance;
	public static Item immortalslance1;
	public static Item immortalslance2;
	public static Item immortalslance3;
	public static Item immortalslance4;
	public static Item immortalslance5;
	public static Item immortalslance6;
	public static Item immortalslance7;
	public static Item immortalslance8;
	public static Item immortalslance9;
	public static Item immortalslance10;
	
	public static Item darknesssword;
	public static Item darknesssword1;
	public static Item darknesssword2;
	public static Item darknesssword3;
	public static Item darknesssword4;
	public static Item darknesssword5;
	public static Item darknesssword6;
	public static Item darknesssword7;
	public static Item darknesssword8;
	public static Item darknesssword9;
	public static Item darknesssword10;
	
	public static Item withersword;
	public static Item withersword1;
	public static Item withersword2;
	public static Item withersword3;
	public static Item withersword4;
	public static Item withersword5;
	public static Item withersword6;
	public static Item withersword7;
	public static Item withersword8;
	public static Item withersword9;
	public static Item withersword10;
	
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
		
		// Set Dragon Sword
		
		dragonaxe = (new DragonAxe(4500, FizzyClubEnumBase.DragonAxes)).setUnlocalizedName("dragonaxe").setTextureName("dragonaxe");
		LanguageRegistry.addName(dragonaxe, "Dragon Axe");
		GameRegistry.registerItem(dragonaxe, "Dragon Axe");
		dragonaxe1 = (new DragonAxe(4501, FizzyClubEnumBase.DragonAxes1)).setUnlocalizedName("dragonaxe1").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe1, "Dragon Axe +1");
		GameRegistry.registerItem(dragonaxe1, "Dragon Axe +1");
		dragonaxe2 = (new DragonAxe(4502, FizzyClubEnumBase.DragonAxes2)).setUnlocalizedName("dragonaxe2").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe2, "Dragon Axe +2");
		GameRegistry.registerItem(dragonaxe2, "Dragon Axe +2");
		dragonaxe3 = (new DragonAxe(4503, FizzyClubEnumBase.DragonAxes3)).setUnlocalizedName("dragonaxe3").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe3, "Dragon Axe +3");
		GameRegistry.registerItem(dragonaxe3, "Dragon Axe +3");
		dragonaxe4 = (new DragonAxe(4504, FizzyClubEnumBase.DragonAxes4)).setUnlocalizedName("dragonaxe4").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe4, "Dragon Axe +4");
		GameRegistry.registerItem(dragonaxe4, "Dragon Axe +4");
		dragonaxe5 = (new DragonAxe(4505, FizzyClubEnumBase.DragonAxes5)).setUnlocalizedName("dragonaxe5").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe5, "Dragon Axe +5");
		GameRegistry.registerItem(dragonaxe5, "Dragon Axe +5");
		dragonaxe6 = (new DragonAxe(4506, FizzyClubEnumBase.DragonAxes6)).setUnlocalizedName("dragonaxe6").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe6, "Dragon Axe +6");
		GameRegistry.registerItem(dragonaxe6, "Dragon Axe +6");
		dragonaxe7 = (new DragonAxe(4507, FizzyClubEnumBase.DragonAxes7)).setUnlocalizedName("dragonaxe7").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe7, "Dragon Axe +7");
		GameRegistry.registerItem(dragonaxe7, "Dragon Axe +7");
		dragonaxe8 = (new DragonAxe(4508, FizzyClubEnumBase.DragonAxes8)).setUnlocalizedName("dragonaxe8").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe8, "Dragon Axe +8");
		GameRegistry.registerItem(dragonaxe8, "Dragon Axe +8");
		dragonaxe9 = (new DragonAxe(4509, FizzyClubEnumBase.DragonAxes9)).setUnlocalizedName("dragonaxe9").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe9, "Dragon Axe +9");
		GameRegistry.registerItem(dragonaxe9, "Dragon Axe +9");
		dragonaxe10 = (new DragonAxe(4510, FizzyClubEnumBase.DragonAxes10)).setUnlocalizedName("dragonaxe10").setTextureName("dragonaxeplus");
		LanguageRegistry.addName(dragonaxe10, "Dragon Axe +10");
		GameRegistry.registerItem(dragonaxe10, "Dragon Axe +10");
		
		// Set Killer Sword
		
		killerscythe = (new KillerScythe(4511, FizzyClubEnumBase.KillerScythes)).setUnlocalizedName("killerscythe").setTextureName("killerscythe");
		LanguageRegistry.addName(killerscythe, "Killer Scythe");
		GameRegistry.registerItem(killerscythe, "Killer Scythe");
		killerscythe1 = (new KillerScythe(4512, FizzyClubEnumBase.KillerScythes1)).setUnlocalizedName("killerscythe1").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe1, "Killer Scythe +1");
		GameRegistry.registerItem(killerscythe1, "Killer Scythe +1");
		killerscythe2 = (new KillerScythe(4513, FizzyClubEnumBase.KillerScythes2)).setUnlocalizedName("killerscythe2").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe2, "Killer Scythe +2");
		GameRegistry.registerItem(killerscythe2, "Killer Scythe +2");
		killerscythe3 = (new KillerScythe(4514, FizzyClubEnumBase.KillerScythes3)).setUnlocalizedName("killerscythe3").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe3, "Killer Scythe +3");
		GameRegistry.registerItem(killerscythe3, "Killer Scythe +3");
		killerscythe4 = (new KillerScythe(4515, FizzyClubEnumBase.KillerScythes4)).setUnlocalizedName("killerscythe4").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe4, "Killer Scythe +4");
		GameRegistry.registerItem(killerscythe4, "Killer Scythe +4");
		killerscythe5 = (new KillerScythe(4516, FizzyClubEnumBase.KillerScythes5)).setUnlocalizedName("killerscythe5").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe5, "Killer Scythe +5");
		GameRegistry.registerItem(killerscythe5, "Killer Scythe +5");
		killerscythe6 = (new KillerScythe(4517, FizzyClubEnumBase.KillerScythes6)).setUnlocalizedName("killerscythe6").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe6, "Killer Scythe +6");
		GameRegistry.registerItem(killerscythe6, "Killer Scythe +6");
		killerscythe7 = (new KillerScythe(4518, FizzyClubEnumBase.KillerScythes7)).setUnlocalizedName("killerscythe7").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe7, "Killer Scythe +7");
		GameRegistry.registerItem(killerscythe7, "Killer Scythe +7");
		killerscythe8 = (new KillerScythe(4519, FizzyClubEnumBase.KillerScythes8)).setUnlocalizedName("killerscythe8").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe8, "Killer Scythe +8");
		GameRegistry.registerItem(killerscythe8, "Killer Scythe +8");
		killerscythe9 = (new KillerScythe(4520, FizzyClubEnumBase.KillerScythes9)).setUnlocalizedName("killerscythe9").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe9, "Killer Scythe +9");
		GameRegistry.registerItem(killerscythe9, "Killer Scythe +9");
		killerscythe10 = (new KillerScythe(4521, FizzyClubEnumBase.KillerScythes10)).setUnlocalizedName("killerscythe10").setTextureName("killerscytheplus");
		LanguageRegistry.addName(killerscythe10, "Killer Scythe +10");
		GameRegistry.registerItem(killerscythe10, "Killer Scythe +10");
		
		// Set Immortals Sword
		
		immortalslance = (new ImmortalsSword(4522, FizzyClubEnumBase.ImmortalsSwords)).setUnlocalizedName("immortalslance").setTextureName("immortalslance");
		LanguageRegistry.addName(immortalslance, "Immortals Lance");
		GameRegistry.registerItem(immortalslance, "Immortals Lance");
		immortalslance1 = (new ImmortalsSword(4523, FizzyClubEnumBase.ImmortalsSwords1)).setUnlocalizedName("immortalslance1").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance1, "Immortals Lance +1");
		GameRegistry.registerItem(immortalslance1, "Immortals Lance +1");
		immortalslance2 = (new ImmortalsSword(4524, FizzyClubEnumBase.ImmortalsSwords2)).setUnlocalizedName("immortalslance2").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance2, "Immortals Lance +2");
		GameRegistry.registerItem(immortalslance2, "Immortals Lance +2");
		immortalslance3 = (new ImmortalsSword(4525, FizzyClubEnumBase.ImmortalsSwords3)).setUnlocalizedName("immortalslance3").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance3, "Immortals Lance +3");
		GameRegistry.registerItem(immortalslance3, "Immortals Lance +3");
		immortalslance4 = (new ImmortalsSword(4526, FizzyClubEnumBase.ImmortalsSwords4)).setUnlocalizedName("immortalslance4").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance4, "Immortals Lance +4");
		GameRegistry.registerItem(immortalslance4, "Immortals Lance +4");
		immortalslance5 = (new ImmortalsSword(4527, FizzyClubEnumBase.ImmortalsSwords5)).setUnlocalizedName("immortalslance5").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance5, "Immortals Lance +5");
		GameRegistry.registerItem(immortalslance5, "Immortals Lance +5");
		immortalslance6 = (new ImmortalsSword(4528, FizzyClubEnumBase.ImmortalsSwords6)).setUnlocalizedName("immortalslance6").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance6, "Immortals Lance +6");
		GameRegistry.registerItem(immortalslance6, "Immortals Lance +6");
		immortalslance7 = (new ImmortalsSword(4529, FizzyClubEnumBase.ImmortalsSwords7)).setUnlocalizedName("immortalslance7").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance7, "Immortals Lance +7");
		GameRegistry.registerItem(immortalslance7, "Immortals Lance +7");
		immortalslance8 = (new ImmortalsSword(4530, FizzyClubEnumBase.ImmortalsSwords8)).setUnlocalizedName("immortalslance8").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance8, "Immortals Lance +8");
		GameRegistry.registerItem(immortalslance8, "Immortals Lance +8");
		immortalslance9 = (new ImmortalsSword(4531, FizzyClubEnumBase.ImmortalsSwords9)).setUnlocalizedName("immortalslance9").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance9, "Immortals Lance +9");
		GameRegistry.registerItem(immortalslance9, "Immortals Lance +9");
		immortalslance10 = (new ImmortalsSword(4532, FizzyClubEnumBase.ImmortalsSwords10)).setUnlocalizedName("immortalslance10").setTextureName("immortalslanceplus");
		LanguageRegistry.addName(immortalslance10, "Immortals Lance +10");
		GameRegistry.registerItem(immortalslance10, "Immortals Lance +10");
		
		// Set Darkness Sword
		
		darknesssword = (new DarknessSword(4533, FizzyClubEnumBase.DarknessSwords)).setUnlocalizedName("darknesssword").setTextureName("darknesssword");
		LanguageRegistry.addName(darknesssword, "Darkness Sword");
		GameRegistry.registerItem(darknesssword, "Darkness Sword");
		darknesssword1 = (new DarknessSword(4534, FizzyClubEnumBase.DarknessSwords1)).setUnlocalizedName("darknesssword1").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword1, "Darkness Sword +1");
		GameRegistry.registerItem(darknesssword1, "Darkness Sword +1");
		darknesssword2 = (new DarknessSword(4535, FizzyClubEnumBase.DarknessSwords2)).setUnlocalizedName("darknesssword2").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword2, "Darkness Sword +2");
		GameRegistry.registerItem(darknesssword2, "Darkness Sword +2");
		darknesssword3 = (new DarknessSword(4536, FizzyClubEnumBase.DarknessSwords3)).setUnlocalizedName("darknesssword3").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword3, "Darkness Sword +3");
		GameRegistry.registerItem(darknesssword3, "Darkness Sword +3");
		darknesssword4 = (new DarknessSword(4537, FizzyClubEnumBase.DarknessSwords4)).setUnlocalizedName("darknesssword4").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword4, "Darkness Sword +4");
		GameRegistry.registerItem(darknesssword4, "Darkness Sword +4");
		darknesssword5 = (new DarknessSword(4538, FizzyClubEnumBase.DarknessSwords5)).setUnlocalizedName("darknesssword5").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword5, "Darkness Sword +5");
		GameRegistry.registerItem(darknesssword5, "Darkness Sword +5");
		darknesssword6 = (new DarknessSword(4539, FizzyClubEnumBase.DarknessSwords6)).setUnlocalizedName("darknesssword6").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword6, "Darkness Sword +6");
		GameRegistry.registerItem(darknesssword6, "Darkness Sword +6");
		darknesssword7 = (new DarknessSword(4540, FizzyClubEnumBase.DarknessSwords7)).setUnlocalizedName("darknesssword7").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword7, "Darkness Sword +7");
		GameRegistry.registerItem(darknesssword7, "Darkness Sword +7");
		darknesssword8 = (new DarknessSword(4541, FizzyClubEnumBase.DarknessSwords8)).setUnlocalizedName("darknesssword8").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword8, "Darkness Sword +8");
		GameRegistry.registerItem(darknesssword8, "Darkness Sword +8");
		darknesssword9 = (new DarknessSword(4542, FizzyClubEnumBase.DarknessSwords9)).setUnlocalizedName("darknesssword9").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword9, "Darkness Sword +9");
		GameRegistry.registerItem(darknesssword9, "Darkness Sword +9");
		darknesssword10 = (new DarknessSword(4543, FizzyClubEnumBase.DarknessSwords10)).setUnlocalizedName("darknesssword10").setTextureName("darknessswordplus");
		LanguageRegistry.addName(darknesssword10, "Darkness Sword +10");
		GameRegistry.registerItem(darknesssword10, "Darkness Sword +10");
		
		// Set Wither Sword
		
		withersword = (new WitherSword(4544, FizzyClubEnumBase.WitherSwords)).setUnlocalizedName("withersword").setTextureName("withersword");
		LanguageRegistry.addName(withersword, "Wither Sword");
		GameRegistry.registerItem(withersword, "Wither Sword");
		withersword1 = (new WitherSword(4545, FizzyClubEnumBase.WitherSwords1)).setUnlocalizedName("withersword1").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword1, "Wither Sword +1");
		GameRegistry.registerItem(withersword1, "Wither Sword +1");
		withersword2 = (new WitherSword(4546, FizzyClubEnumBase.WitherSwords2)).setUnlocalizedName("withersword2").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword2, "Wither Sword +2");
		GameRegistry.registerItem(withersword2, "Wither Sword +2");
		withersword3 = (new WitherSword(4547, FizzyClubEnumBase.WitherSwords3)).setUnlocalizedName("withersword3").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword3, "Wither Sword +3");
		GameRegistry.registerItem(withersword3, "Wither Sword +3");
		withersword4 = (new WitherSword(4548, FizzyClubEnumBase.WitherSwords4)).setUnlocalizedName("withersword4").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword4, "Wither Sword +4");
		GameRegistry.registerItem(withersword4, "Wither Sword +4");
		withersword5 = (new WitherSword(4549, FizzyClubEnumBase.WitherSwords5)).setUnlocalizedName("withersword5").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword5, "Wither Sword +5");
		GameRegistry.registerItem(withersword5, "Wither Sword +5");
		withersword6 = (new WitherSword(4550, FizzyClubEnumBase.WitherSwords6)).setUnlocalizedName("withersword6").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword6, "Wither Sword +6");
		GameRegistry.registerItem(withersword6, "Wither Sword +6");
		withersword7 = (new WitherSword(4551, FizzyClubEnumBase.WitherSwords7)).setUnlocalizedName("withersword7").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword7, "Wither Sword +7");
		GameRegistry.registerItem(withersword7, "Wither Sword +7");
		withersword8 = (new WitherSword(4552, FizzyClubEnumBase.WitherSwords8)).setUnlocalizedName("withersword8").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword8, "Wither Sword +8");
		GameRegistry.registerItem(withersword8, "Wither Sword +8");
		withersword9 = (new WitherSword(4553, FizzyClubEnumBase.WitherSwords9)).setUnlocalizedName("withersword9").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword9, "Wither Sword +9");
		GameRegistry.registerItem(withersword9, "Wither Sword +9");
		withersword10 = (new WitherSword(4554, FizzyClubEnumBase.WitherSwords10)).setUnlocalizedName("withersword10").setTextureName("witherswordplus");
		LanguageRegistry.addName(withersword10, "Wither Sword +10");
		GameRegistry.registerItem(withersword10, "Wither Sword +10");
		
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}

}
