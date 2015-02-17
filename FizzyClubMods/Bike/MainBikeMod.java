package FizzyClubMods.Bike;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import FizzyClubMods.Bike.entity.EntityFizzy;
import FizzyClubMods.Bike.entity.EntityFizzyBike;
import FizzyClubMods.Bike.items.OwnerItems;
import FizzyClubMods.Bike.items.SpawnItem;
import FizzyClubMods.Bike.proxy.serverside;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "FizzyClubMod", name = "FizzyClubModBike", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MainBikeMod {

	@Mod.Instance("MainBikeMod")
	public static MainBikeMod instance;

	@SidedProxy(clientSide = "FizzyClubMods.Bike.proxy.clientside", serverSide = "FizzyClubMods.Bike.proxy.serverside")
	public static serverside proxy;

	public int modEntityID = -1;
	public int ItemIDs = 2000;

	
	
	public static Item OwenItems;
	public static Item spawnMonter;

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRender();
		AddItem();
		AddMobs();
	}

	public void AddMobs() {

		registerEntity(EntityFizzy.class, "robotOne", 5137428, 5137428);

	}
	
	public void regisItems(Item item , String name){
		
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
		
	}

	public void AddItem() {

		OwenItems = new OwnerItems(++ItemIDs).setUnlocalizedName("Owner");
		spawnMonter = new SpawnItem(++ItemIDs).setUnlocalizedName("Spawn");
		
		regisItems(OwenItems, "OwnerItems");
		regisItems(spawnMonter, "spawnMonter");
	}

	public void registerEntity(Class<? extends Entity> entityClass,
			String entityName, int bkEggColor, int fgEggColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id,
				bkEggColor, fgEggColor));
	}

	public void addSpawn(Class<? extends EntityLiving> entityClass,
			int spawnProb, int min, int max, BiomeGenBase[] biomes) {
		if (spawnProb > 0) {
			EntityRegistry.addSpawn(entityClass, spawnProb, min, max,
					EnumCreatureType.creature, biomes);
		}
	}
}
