package FizzyClubMods.Boss;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MushroomsArmor extends ItemArmor
{
	public MushroomsArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.mushroomshelmet || stack.getItem() == FizzyClubMain.mushroomschestplate || stack.getItem() == FizzyClubMain.mushroomsboot) {
		return "textures/armors/mushrooms_1.png";
	}
	if (stack.getItem() == FizzyClubMain.mushroomslegging) {
		return "textures/armors/mushrooms_2.png";
	}
	return null;
	}
}
