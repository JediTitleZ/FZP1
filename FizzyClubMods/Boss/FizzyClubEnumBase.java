package FizzyClubMods.Boss;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class FizzyClubEnumBase
{
	static EnumArmorMaterial MushroomsArmors = EnumHelper.addArmorMaterial("MushroomsArmors", 20, new int[]{5, 5, 5, 5}, 80);
	static EnumToolMaterial MushroomsTools = EnumHelper.addToolMaterial("MushroomsTools", 0, 399, 0.0F, 6, 80);
	
	static EnumArmorMaterial FrankensteinArmors = EnumHelper.addArmorMaterial("FrankensteinArmors", 40, new int[]{5, 6, 6, 5}, 80);
	static EnumToolMaterial FrankensteinTools = EnumHelper.addToolMaterial("FrankensteinTools", 0, 499, 0.0F, 0, 80);
	
	static EnumArmorMaterial DevilArmors = EnumHelper.addArmorMaterial("DevilArmors", 43, new int[]{6, 6, 6, 5}, 80);
	static EnumToolMaterial DevilTools = EnumHelper.addToolMaterial("DevilTools", 0, 599, 0.0F, 0, 80);
}
