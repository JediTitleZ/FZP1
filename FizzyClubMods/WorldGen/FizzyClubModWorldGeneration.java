package FizzyClubMods.WorldGen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import FizzyClubMods.Ore.FizzyClubMain;
import FizzyClubMods.WorldGen.Feature.FizzyClubModNetherGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class FizzyClubModWorldGeneration implements IWorldGenerator
{
	protected Random rand = new Random();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateWorld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateTheEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	private void generateTheEnd(World world, Random random, int i, int j)
	{
		
	}

	private void generateWorld(World world, Random random, int i, int j)
	{
		
	}

	private void generateNether(World world, Random random, int i, int j)
	{
		for (int k = 0; k < 3; k++)
		{
			int chunkX = i + this.rand.nextInt(16);
			int chunkY = this.rand.nextInt(256);
			int chunkZ = j + this.rand.nextInt(16);
			
			(new FizzyClubModNetherGenMinable(FizzyClubMain.crystalore.blockID, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		for (int k = 0; k < 2; k++)
		{
			int chunkX = i + this.rand.nextInt(16);
			int chunkY = this.rand.nextInt(256);
			int chunkZ = j + this.rand.nextInt(16);
			
			(new FizzyClubModNetherGenMinable(FizzyClubMain.magmaore.blockID, 3)).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}
}
