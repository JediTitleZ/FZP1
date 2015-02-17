package FizzyClubMods;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class EmeraldArmor extends ItemArmor
{
	public EmeraldArmor(int par1,EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	String type) {
	if (stack.getItem() == FizzyClubMain.emeraldhelmet || stack.getItem() == FizzyClubMain.emeraldchestplate || stack.getItem() == FizzyClubMain.emeraldboot) {
		return "textures/armors/emerald_1.png";
	}
	if (stack.getItem() == FizzyClubMain.emeraldlegging) {
		return "textures/armors/emerald_2.png";
	}
	return null;
	}
	/*
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
	{
		if(player.getCurrentArmor(0) != null)
		{
			ItemStack hand = player.getCurrentArmor(0);
			if(hand.getItem() == FizzyClubMain.dragonaxe || hand.getItem() == FizzyClubMain.dragonaxe1 || hand.getItem() == FizzyClubMain.dragonaxe2 || hand.getItem() == FizzyClubMain.dragonaxe3 || hand.getItem() == FizzyClubMain.dragonaxe4 || hand.getItem() == FizzyClubMain.dragonaxe5 || hand.getItem() == FizzyClubMain.dragonaxe6 || hand.getItem() == FizzyClubMain.dragonaxe7 || hand.getItem() == FizzyClubMain.dragonaxe8 || hand.getItem() == FizzyClubMain.dragonaxe9 || hand.getItem() == FizzyClubMain.dragonaxe10)
			{
				player.addPotionEffect((new PotionEffect(Potion.digSlowdown.id, 20, 9)));
			}
		}
	}
	*/
}
