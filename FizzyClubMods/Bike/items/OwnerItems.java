package FizzyClubBikeMod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OwnerItems
  extends Item
{

  
  public OwnerItems(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabBlock);
	}

@SideOnly(Side.CLIENT)
  public void func_94581_a(IconRegister register)
  {
    this.itemIcon = register.registerIcon("fizzy:" + getUnlocalizedName().substring(5));
  }
}
