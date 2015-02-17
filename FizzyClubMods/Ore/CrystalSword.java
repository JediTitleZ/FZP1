package FizzyClubMods.Ore;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class CrystalSword extends ItemSword {
	
	private float weaponDamage;
    private final EnumToolMaterial toolMaterial;
	
	public CrystalSword(int par1,EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, par2EnumToolMaterial);
		this.toolMaterial = par2EnumToolMaterial;
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
	}
}
