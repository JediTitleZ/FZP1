package FizzyClubMods.Slots.Gui.Funtion;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import FizzyClubMods.Slots.Gui.Inv.FizzyClubInv;

public class INVFunction
{
  public static void addEntry(String var1, FizzyClubInv var2)
  {
    if ((MinecraftServer.getServer() != null) && (MinecraftServer.getServer().getConfigurationManager() != null))
    {
      EntityPlayerMP var3 = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(var1);
      try
      {
        if (var3 != null)
        {
          if (var3.getEntityData().hasKey("PlayerPersisted"))
          {
            var3.getEntityData().getCompoundTag("PlayerPersisted").setCompoundTag("FizzyClubInv", var2.writeToNBT(new NBTTagCompound("FizzyClubInv")));
          }
          else
          {
            var3.getEntityData().setCompoundTag("PlayerPersisted", new NBTTagCompound("PlayerPersisted"));
            var3.getEntityData().getCompoundTag("PlayerPersisted").setCompoundTag("FizzyClubInv", var2.writeToNBT(new NBTTagCompound("FizzyClubInv")));
          }
        }
      }
      catch (Throwable var5)
      {
        var5.printStackTrace();
      }
    }
  }

  public static FizzyClubInv getInventory(String var1) {
	  FizzyClubInv var2 = new FizzyClubInv(var1);

    if ((MinecraftServer.getServer() != null) && (MinecraftServer.getServer().getConfigurationManager() != null))
    {
      EntityPlayerMP var3 = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(var1);

      if (var3 != null)
      {
        if ((var3.getEntityData().hasKey("PlayerPersisted")) && (var3.getEntityData().getCompoundTag("PlayerPersisted").hasKey("FizzyClubInv")))
        {
          var2.readFromNBT(var3.getEntityData().getCompoundTag("PlayerPersisted").getCompoundTag("FizzyClubInv"));
        }
        else
        {
          if (!var3.getEntityData().hasKey("PlayerPersisted"))
          {
            var3.getEntityData().setCompoundTag("PlayerPersisted", new NBTTagCompound("PlayerPersisted"));
          }

          var3.getEntityData().getCompoundTag("PlayerPersisted").setCompoundTag("FizzyClubInv", var2.writeToNBT(new NBTTagCompound()));
        }
      }
    }

    return var2;
  }
}