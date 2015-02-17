package FizzyClubMods.Slots;

import FizzyClubMods.Slots.Block.FizzyClubBlock;
import FizzyClubMods.Slots.Gui.FizzyclubSlotGuiHandler;
import FizzyClubMods.Slots.Gui.packet.FizzyclubSlotPacketHandler;
import FizzyClubMods.Slots.Items.FizzyclubArmor;
import FizzyClubMods.Slots.Proxy.FizzyclubServer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;


@Mod(modid = MainFizzyclubSlot.ModID , name = MainFizzyclubSlot.Name , version = MainFizzyclubSlot.Version )
@NetworkMod(clientSideRequired = true , serverSideRequired=true, packetHandler= FizzyclubSlotPacketHandler.class, channels={"FizzyClubMods"})
public class MainFizzyclubSlot {

	@Mod.Instance("MainFizzyClub")
	public static MainFizzyclubSlot instance;
	public static final String ModID = "MainFizzyClub";
	public static final String Name = "FizzyClubMods";
	public static final String Version = "1.6.4";
	
	@SidedProxy(clientSide = "FizzyClubMods.Proxy.FizzyclubClient",serverSide = "FizzyClubMods.Proxy.FizzyclubServer")
	public static FizzyclubServer proxy;
	
	@EventHandler
	public void load (FMLInitializationEvent event){
		FizzyClubBlock.init();
	    proxy.renderPlayer();
	    proxy.registerKeyhandler();
		NetworkRegistry.instance().registerGuiHandler(instance, new FizzyclubSlotGuiHandler());
		FizzyclubArmor.registerWing();
		FizzyclubArmor.registerBuff();
	}
}
