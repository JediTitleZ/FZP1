package FizzyClubMods.Ore;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MagmaArmor extends ItemArmor
{
	public MagmaArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.magmahelmet || stack.getItem() == FizzyClubMain.magmachestplate || stack.getItem() == FizzyClubMain.magmaboot)
	{
		return "textures/armors/magma_1.png";
	}
	if (stack.getItem() == FizzyClubMain.magmalegging) {
		return "textures/armors/magma_2.png";
	}
	return null;
	}
}
