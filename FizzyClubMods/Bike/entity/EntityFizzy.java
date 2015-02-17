package FizzyClubMods.Bike.entity;

import FizzyClubMods.Bike.MainBikeMod;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class EntityFizzy
  extends EntityFizzyBike
{
  public EntityFizzy(World p_i1735_1_)
  {
    super(p_i1735_1_);
    addItems(new ItemStack(MainBikeMod.spawnMonter));
  }
}