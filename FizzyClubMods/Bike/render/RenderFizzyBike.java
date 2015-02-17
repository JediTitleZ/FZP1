package FizzyClubBikeMod.render;

import FizzyClubBikeMod.entity.EntityFizzyBike;
import FizzyClubBikeMod.render.Model.ModelFizzy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderFizzyBike
  extends RenderLiving
{
  private static final ResourceLocation pigTextures = new ResourceLocation("atv", "textures/mob/Tier2ATV.png");
  
  public RenderFizzyBike(ModelFizzy modelFizzy, float par3)
  {
    super(modelFizzy, par3);
  }
  
  protected void scaleBike(EntityFizzyBike par1EntityATV, float par2)
  {
    GL11.glScalef(1.2F, 1.2F, 1.2F);
  }
  

  
  protected ResourceLocation getPigTextures(EntityFizzyBike par1EntityFriendly)
  {
    return pigTextures;
  }

  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
  {
    scaleBike((EntityFizzyBike)par1EntityLivingBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity par1Entity)
  {
    return getPigTextures((EntityFizzyBike)par1Entity);
  }
}
