package FizzyClubMods.Quest;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class FizzyClubEnumBase
{
	static EnumArmorMaterial kingArmors = EnumHelper.addArmorMaterial("kingArmors", 55, new int[]{6, 6, 6, 6}, 80);
	static EnumToolMaterial QueenSwords = EnumHelper.addToolMaterial("QueenSwords", 0, 599, 0.0F, 0, 80);
}
