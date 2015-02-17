package FizzyClubMods.Ore;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CrystalArmor extends ItemArmor
{
	public CrystalArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.crystalhelmet || stack.getItem() == FizzyClubMain.crystalchestplate || stack.getItem() == FizzyClubMain.crystalboot)
	{
		return "textures/armors/crystal_1.png";
	}
	if (stack.getItem() == FizzyClubMain.crystallegging) {
		return "textures/armors/crystal_2.png";
	}
	return null;
	}
}
