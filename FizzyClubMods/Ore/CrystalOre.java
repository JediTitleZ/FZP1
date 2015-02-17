package FizzyClubMods.Ore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CrystalOre extends Block
{
	public CrystalOre(int par1, Material par2Material)
	{
		super(par1, par2Material);
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return FizzyClubMain.crystal.itemID;
    }
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
        
        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
        	int j1 = 0;
        	j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 2, 50);
        	
        	this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
        }
    }
	
	@Override
	public int quantityDropped(Random par1Random)
    {
        return 1;
    }
	
	public boolean isOpaqueCube()
	{
		return false;
	}
}

