package FizzyClubMods.Donate.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class LavaPlusArmor extends ItemArmor
{
	public LavaPlusArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.lavaplushelmet || stack.getItem() == FizzyClubMain.lavapluschestplate || stack.getItem() == FizzyClubMain.lavaplusboot)
	{
		return "textures/armors/lavaplus_1.png";
	}
	if (stack.getItem() == FizzyClubMain.lavapluslegging) {
		return "textures/armors/lavaplus_2.png";
	}
	return null;
	}
}
