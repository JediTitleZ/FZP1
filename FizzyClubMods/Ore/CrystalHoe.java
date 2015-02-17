package FizzyClubMods.Ore;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CrystalHoe extends ItemHoe
{
    protected EnumToolMaterial theToolMaterial;

    public CrystalHoe(int par1,EnumToolMaterial par2)
	{
		super(par1, par2);
        this.theToolMaterial = par2;
        this.maxStackSize = 1;
        this.setMaxDamage(par2.getMaxUses());
    }

    @SideOnly(Side.CLIENT)

    public boolean isFull3D()
    {
        return true;
    }

    public String getMaterialName()
    {
        return this.theToolMaterial.toString();
    }
}
