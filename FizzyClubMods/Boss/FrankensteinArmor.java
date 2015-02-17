package FizzyClubMods.Boss;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class FrankensteinArmor extends ItemArmor
{
	public FrankensteinArmor(int par1,EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.frankensteinhelmet || stack.getItem() == FizzyClubMain.frankensteinchestplate || stack.getItem() == FizzyClubMain.frankensteinboot) {
		return "textures/armors/frankenstein_1.png";
	}
	if (stack.getItem() == FizzyClubMain.frankensteinlegging) {
		return "textures/armors/frankenstein_2.png";
	}
	return null;
	}
}
