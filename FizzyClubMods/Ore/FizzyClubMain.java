package FizzyClubMods.Ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import FizzyClubMods.WorldGen.FizzyClubModWorld;
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

	@SidedProxy(clientSide = "FizzyClubMods.Ore.FizzyClubClientProxy", serverSide = "FizzyClubMods.Ore.FizzyClubServerProxy")
	
	public static FizzyClubServerProxy proxy;
	
	public static final String MODID = "FizzyClubModsOre";
	public static final String NAME = "FizzyClubModsOre";
	public static final String VERSION = "1.6.4";
	
	public static Block crystalore;
	public static Block crystalblock;
	public static Item crystal;
	public static Item crystalhelmet;
	public static Item crystalchestplate;
	public static Item crystallegging;
	public static Item crystalboot;
	public static Item crystalpickaxe;
	public static Item crystalaxe;
	public static Item crystalsword;
	public static Item crystalhoe;
	public static Item crystalshovel;
	
	public static Block magmaore;
	public static Block magmablock;
	public static Item magma;
	public static Item magmahelmet;
	public static Item magmachestplate;
	public static Item magmalegging;
	public static Item magmaboot;
	public static Item magmapickaxe;
	public static Item magmaaxe;
	public static Item magmasword;
	public static Item magmahoe;
	public static Item magmashovel;
	
	@EventHandler
	public void init(FMLInitializationEvent Event)
	{
		
	}

	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		FizzyClubModWorld.FizzyClubMain();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent Event)
	{
		proxy.init();
		
		// Set Crystal
		
		crystalore = new CrystalOre(3500, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(10.0F).setResistance(20.0F).setUnlocalizedName("crystalore").setTextureName("crystalore");
		LanguageRegistry.addName(crystalore, "Crystal Ore");
		GameRegistry.registerBlock(crystalore, "Crystal Ore");
		crystalblock = new FizzyClubBlock(3501, Material.rock).setStepSound(Block.soundGlassFootstep).setHardness(10.0F).setResistance(20.0F).setLightValue(1.0F).setUnlocalizedName("crystalblock").setTextureName("crystalblock");
		LanguageRegistry.addName(crystalblock, "Crystal Block");
		GameRegistry.registerBlock(crystalblock, "Crystal Block");
		crystal = new FizzyClubItem(3502).setUnlocalizedName("crystal").setTextureName("crystal");
		LanguageRegistry.addName(crystal, "Crystal");
		GameRegistry.registerItem(crystal, "Crystal");
		GameRegistry.addRecipe(new ItemStack(crystal, 9), new Object[]{
			"   ",
			" X ",
			"   ",
			'X', crystalblock});
		GameRegistry.addRecipe(new ItemStack(crystalblock, 1), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', crystal});
		crystalhelmet = new CrystalArmor(3504, FizzyClubEnumBase.CrystalArmors, 0, 0).setUnlocalizedName("crystalhelmet").setTextureName("crystalhelmet");
		LanguageRegistry.addName(crystalhelmet, "Crystal Helmet");
		GameRegistry.registerItem(crystalhelmet, "Crystal Helmet");
		GameRegistry.addRecipe(new ItemStack(crystalhelmet, 1), new Object[]{
			"   ",
			"XXX",
			"X X",
			'X', crystal});
		crystalchestplate = new CrystalArmor(3505, FizzyClubEnumBase.CrystalArmors, 0, 1).setUnlocalizedName("crystalchestplate").setTextureName("crystalchestplate");
		LanguageRegistry.addName(crystalchestplate, "Crystal ChestPlate");
		GameRegistry.registerItem(crystalchestplate, "Crystal ChestPlate");
		GameRegistry.addRecipe(new ItemStack(crystalchestplate, 1), new Object[]{
			"X X",
			"XXX",
			"XXX",
			'X', crystal});
		crystallegging = new CrystalArmor(3506, FizzyClubEnumBase.CrystalArmors, 0, 2).setUnlocalizedName("crystallegging").setTextureName("crystallegging");
		LanguageRegistry.addName(crystallegging, "Crystal Legging");
		GameRegistry.registerItem(crystallegging, "Crystal Legging");
		GameRegistry.addRecipe(new ItemStack(crystallegging, 1), new Object[]{
			"XXX",
			"X X",
			"X X",
			'X', crystal});
		crystalboot = new CrystalArmor(3507, FizzyClubEnumBase.CrystalArmors, 0, 3).setUnlocalizedName("crystalboot").setTextureName("crystalboot");
		LanguageRegistry.addName(crystalboot, "Crystal Boot");
		GameRegistry.registerItem(crystalboot, "Crystal Boot");
		GameRegistry.addRecipe(new ItemStack(crystalboot, 1), new Object[]{
			"   ",
			"X X",
			"X X",
			'X', crystal});
		crystalsword = (new CrystalSword(3508, FizzyClubEnumBase.CrystalTools)).setUnlocalizedName("crystalsword").setTextureName("crystalsword");
		LanguageRegistry.addName(crystalsword, "Crystal Sword");
		GameRegistry.registerItem(crystalsword, "Crystal Sword");
		GameRegistry.addRecipe(new ItemStack(crystalsword, 1), new Object[]{
			" Z ",
			"ZZZ",
			" X ",
			'X', Item.stick,'Z', crystal});
		crystalpickaxe = (new CrystalPickaxe(3509, FizzyClubEnumBase.CrystalTools)).setUnlocalizedName("crystalpickaxe").setTextureName("crystalpickaxe");
		LanguageRegistry.addName(crystalpickaxe, "Crystal PickAxe");
		GameRegistry.registerItem(crystalpickaxe, "Crystal PickAxe");
		GameRegistry.addRecipe(new ItemStack(crystalpickaxe, 1), new Object[]{
			"ZZZ",
			" X ",
			" X ",'X', Item.stick,'Z', crystal});
		crystalaxe = (new CrystalAxe(3510, FizzyClubEnumBase.CrystalTools)).setUnlocalizedName("crystalaxe").setTextureName("crystalaxe");
		LanguageRegistry.addName(crystalaxe, "Crystal Axe");
		GameRegistry.registerItem(crystalaxe, "Crystal Axe");
		GameRegistry.addRecipe(new ItemStack(crystalaxe, 1), new Object[]{
			"ZZ ",
			"ZX ",
			" X ",'X', Item.stick,'Z', crystal});
		crystalshovel = (new CrystalShovel(3511, FizzyClubEnumBase.CrystalTools)).setUnlocalizedName("crystalshovel").setTextureName("crystalshovel");
		LanguageRegistry.addName(crystalshovel, "Crystal Shovel");
		GameRegistry.registerItem(crystalshovel, "Crystal Shovel");
		GameRegistry.addRecipe(new ItemStack(crystalshovel, 1), new Object[]{
			"ZZ ",
			" X ",
			" X ",'X', Item.stick,'Z', crystal});
		crystalhoe = (new CrystalHoe(3512, FizzyClubEnumBase.CrystalTools)).setUnlocalizedName("crystalhoe").setTextureName("crystalhoe");
		LanguageRegistry.addName(crystalhoe, "Crystal Hoe");
		GameRegistry.registerItem(crystalhoe, "Crystal Hoe");
		GameRegistry.addRecipe(new ItemStack(crystalhoe, 1), new Object[]{
			" Z ",
			" X ",
			" X ",'X', Item.stick,'Z', crystal});
		
		// Set Magma
				magmaore = new MagmaOre(3513, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(10.0F).setResistance(20.0F).setUnlocalizedName("magmaore").setTextureName("magmaore");
				LanguageRegistry.addName(magmaore, "Magma Ore");
				GameRegistry.registerBlock(magmaore, "Magma Ore");
				magmablock = new FizzyClubBlock(3514, Material.rock).setStepSound(Block.soundGlassFootstep).setHardness(10.0F).setResistance(20.0F).setLightValue(1.0F).setUnlocalizedName("magmablock").setTextureName("magmablock");
				LanguageRegistry.addName(magmablock, "Magma Block");
				GameRegistry.registerBlock(magmablock, "Magma Block");
				magma = new FizzyClubItem(3515).setUnlocalizedName("magma").setTextureName("magma");
				LanguageRegistry.addName(magma, "Magma");
				GameRegistry.registerItem(magma, "Magma");
				GameRegistry.addRecipe(new ItemStack(magma, 9), new Object[]{
					"   ",
					" X ",
					"   ",
					'X', magmablock});
				GameRegistry.addRecipe(new ItemStack(magmablock, 1), new Object[]{
					"XXX",
					"XXX",
					"XXX",
					'X', magma});
				magmahelmet = new MagmaArmor(3516, FizzyClubEnumBase.MagmaArmors, 0, 0).setUnlocalizedName("magmahelmet").setTextureName("magmahelmet");
				LanguageRegistry.addName(magmahelmet, "Magma Helmet");
				GameRegistry.registerItem(magmahelmet, "Magma Helmet");
				GameRegistry.addRecipe(new ItemStack(magmahelmet, 1), new Object[]{
					"   ",
					"XXX",
					"X X",
					'X', magma});
				magmachestplate = new MagmaArmor(3517, FizzyClubEnumBase.MagmaArmors, 0, 1).setUnlocalizedName("magmachestplate").setTextureName("magmachestplate");
				LanguageRegistry.addName(magmachestplate, "Magma ChestPlate");
				GameRegistry.registerItem(magmachestplate, "Magma ChestPlate");
				GameRegistry.addRecipe(new ItemStack(magmachestplate, 1), new Object[]{
					"X X",
					"XXX",
					"XXX",
					'X', magma});
				magmalegging = new MagmaArmor(3518, FizzyClubEnumBase.MagmaArmors, 0, 2).setUnlocalizedName("magmalegging").setTextureName("magmalegging");
				LanguageRegistry.addName(magmalegging, "Magma Legging");
				GameRegistry.registerItem(magmalegging, "Magma Legging");
				GameRegistry.addRecipe(new ItemStack(magmalegging, 1), new Object[]{
					"XXX",
					"X X",
					"X X",
					'X', magma});
				magmaboot = new MagmaArmor(3519, FizzyClubEnumBase.MagmaArmors, 0, 3).setUnlocalizedName("magmaboot").setTextureName("magmaboot");
				LanguageRegistry.addName(magmaboot, "Magma Boot");
				GameRegistry.registerItem(magmaboot, "Magma Boot");
				GameRegistry.addRecipe(new ItemStack(magmaboot, 1), new Object[]{
					"   ",
					"X X",
					"X X",
					'X', magma});
				magmasword = (new MagmaSword(3520, FizzyClubEnumBase.MagmaTools)).setUnlocalizedName("magmasword").setTextureName("magmasword");
				LanguageRegistry.addName(magmasword, "Magma Sword");
				GameRegistry.registerItem(magmasword, "Magma Sword");
				GameRegistry.addRecipe(new ItemStack(magmasword, 1), new Object[]{
					" Z ",
					"ZZZ",
					" X ",
					'X', Item.stick,'Z', magma});
				magmapickaxe = (new MagmaPickaxe(3521, FizzyClubEnumBase.MagmaTools)).setUnlocalizedName("magmapickaxe").setTextureName("magmapickaxe");
				LanguageRegistry.addName(magmapickaxe, "Magma PickAxe");
				GameRegistry.registerItem(magmapickaxe, "Magma PickAxe");
				GameRegistry.addRecipe(new ItemStack(magmapickaxe, 1), new Object[]{
					"ZZZ",
					" X ",
					" X ",'X', Item.stick,'Z', magma});
				magmaaxe = (new MagmaAxe(3522, FizzyClubEnumBase.MagmaTools)).setUnlocalizedName("magmaaxe").setTextureName("magmaaxe");
				LanguageRegistry.addName(magmaaxe, "Magma Axe");
				GameRegistry.registerItem(magmaaxe, "Magma Axe");
				GameRegistry.addRecipe(new ItemStack(magmaaxe, 1), new Object[]{
					"ZZ ",
					"ZX ",
					" X ",'X', Item.stick,'Z', magma});
				magmashovel = (new MagmaShovel(3523, FizzyClubEnumBase.MagmaTools)).setUnlocalizedName("magmashovel").setTextureName("magmashovel");
				LanguageRegistry.addName(magmashovel, "Magma Shovel");
				GameRegistry.registerItem(magmashovel, "Magma Shovel");
				GameRegistry.addRecipe(new ItemStack(magmashovel, 1), new Object[]{
					"ZZ ",
					" X ",
					" X ",'X', Item.stick,'Z', magma});
				magmahoe = (new MagmaHoe(3524, FizzyClubEnumBase.MagmaTools)).setUnlocalizedName("magmahoe").setTextureName("magmahoe");
				LanguageRegistry.addName(magmahoe, "Magma Hoe");
				GameRegistry.registerItem(magmahoe, "Magma Hoe");
				GameRegistry.addRecipe(new ItemStack(magmahoe, 1), new Object[]{
					" Z ",
					" X ",
					" X ",'X', Item.stick,'Z', magma});

	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}

}
