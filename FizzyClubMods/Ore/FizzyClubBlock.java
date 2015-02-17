package FizzyClubMods.Ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FizzyClubBlock extends Block
{
	public FizzyClubBlock(int par1, Material par2Material)
	{
		super(par1, par2Material);
	}
	public boolean isOpaqueCube()
	{
		return false;
	}
}
