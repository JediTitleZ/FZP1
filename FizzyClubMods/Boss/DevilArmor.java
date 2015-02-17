package FizzyClubMods.Boss;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DevilArmor extends ItemArmor
{
	public DevilArmor(int par1,EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.devilhelmet || stack.getItem() == FizzyClubMain.devilchestplate || stack.getItem() == FizzyClubMain.devilboot) {
		return "textures/armors/devil_1.png";
	}
	if (stack.getItem() == FizzyClubMain.devillegging) {
		return "textures/armors/devil_2.png";
	}
	return null;
	}
}
