package FizzyClubBikeMod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Entityspawn
  extends EntityThrowable
{
  EntityPlayer player;
  
  public Entityspawn(World par1World)
  {
    super(par1World);
  }
  
  public Entityspawn(World par1World, EntityLivingBase par2EntityLivingBase)
  {
    super(par1World, par2EntityLivingBase);
  }
  
  public Entityspawn(World par1World, double par2, double par4, double par6)
  {
    super(par1World, par2, par4, par6);
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
  {
    if (par1MovingObjectPosition.entityHit != null) {
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), 0.0F);
    }
    if (!this.worldObj.isRemote)
    {
      EntityFizzy entitychicken = new EntityFizzy(this.worldObj);
      
      entitychicken.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
      
      this.worldObj.spawnEntityInWorld(entitychicken);
    }
    for (int j = 0; j < 8; j++) {
      this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    }
    if (!this.worldObj.isRemote) {
      setDead();
    }
  }
}
