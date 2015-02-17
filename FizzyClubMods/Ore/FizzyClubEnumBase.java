package FizzyClubMods.Ore;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class FizzyClubEnumBase
{
	static EnumArmorMaterial CrystalArmors = EnumHelper.addArmorMaterial("CrystalArmors", 40, new int[]{5, 6, 5, 5}, 80);
	static EnumToolMaterial CrystalTools = EnumHelper.addToolMaterial("CrystalTools", 4, 599, 5.0F, 6, 80);
	
	static EnumArmorMaterial MagmaArmors = EnumHelper.addArmorMaterial("MagmaArmors", 50, new int[]{6, 6, 6, 6}, 80);
	static EnumToolMaterial MagmaTools = EnumHelper.addToolMaterial("MagmaTools", 4, 1299, 5.5F, 8, 80);
}
