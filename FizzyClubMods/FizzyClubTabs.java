package FizzyClubMods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FizzyClubTabs extends CreativeTabs 
{
	public FizzyClubTabs(int par1, String par2Str)
	{
		super(par1, par2Str);
	}
	
	public Item getTabIconItem()
	{
		return FizzyClubMods.FizzyClubMain.fizzyclubmods;
	}
	
	public String getTrankatedTabLabel()
	{
		return "FizzyClubMods";
	}

}
