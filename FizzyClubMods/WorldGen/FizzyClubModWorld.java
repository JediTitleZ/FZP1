package FizzyClubMods.WorldGen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class FizzyClubModWorld
{
	public static void FizzyClubMain()
	{
		initWorldGen();
	}

	private static void initWorldGen()
	{
		registerWorldGen(new FizzyClubModWorldGeneration(), 1);
	}

	private static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbabaility)
	{
		GameRegistry.registerWorldGenerator(worldGenClass);
	}
}
