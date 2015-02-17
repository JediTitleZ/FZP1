package FizzyClubMods.Donate.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RobotPlusArmor extends ItemArmor
{
	public RobotPlusArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.robotplushelmet || stack.getItem() == FizzyClubMain.robotpluschestplate || stack.getItem() == FizzyClubMain.robotplusboot)
	{
		return "textures/armors/robot_1.png";
	}
	if (stack.getItem() == FizzyClubMain.robotpluslegging) {
		return "textures/armors/robot_2.png";
	}
	return null;
	}
}
