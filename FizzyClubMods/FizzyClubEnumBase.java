package FizzyClubMods;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class FizzyClubEnumBase
{
	static EnumArmorMaterial EmeraldArmors = EnumHelper.addArmorMaterial("EmeraldArmors", 50, new int[]{6, 6, 6, 6}, 80);
	static EnumToolMaterial EmeraldTools = EnumHelper.addToolMaterial("EmeraldTools", 4, 1499, 5.0F, 12, 80);
}