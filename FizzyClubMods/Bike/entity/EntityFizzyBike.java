package FizzyClubMods.Bike.entity;

import java.io.PrintStream;
import java.util.UUID;

//import com.sun.org.apache.xalan.internal.xsltc.runtime.Attributes;

import FizzyClubMods.Bike.MainBikeMod;
import FizzyClubMods.Bike.render.Model.ModelFizzy;
import FizzyClubMods.Slots.MainFizzyclubSlot;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.world.World;

public abstract class EntityFizzyBike
  extends EntityWolf
{
  private EntityPlayer owner;
  private String ownerName;
  private ItemStack Istack;
  
  public EntityFizzyBike(World p_i1735_1_)
  {
    super(p_i1735_1_);
    this.setSize(1.4F, 0.9F);
    this.ownerName = "";
  }
  
  public void setNames(String ownerName)
  {
    this.ownerName = ownerName;
  }
  
  public String getOwnerName()
  {
    return this.ownerName;
  }
  
  public EntityPlayer getOwnerEntity()
  {
    return this.owner;
  }
  
  public ItemStack addItems(ItemStack stack)
  {
    this.Istack = stack;
    
    return stack;
  }
  
  public ItemStack getItems()
  {
    return this.Istack;
  }
  
  public void setOwnerEntity(EntityPlayer playerEntityByName)
  {
    this.owner = playerEntityByName;
  }
  
  public boolean interact(EntityPlayer player)
  {
    ItemStack itemstack = player.inventory.getCurrentItem();
    String Owner = player.getCommandSenderName();
    if (itemstack != null)
    {
      if ((itemstack.getItem() == MainBikeMod.OwenItems) && (!isTamed()))
      {
        setTamed(true);
        setPathToEntity((PathEntity)null);
        setAttackTarget((EntityLivingBase)null);
        setHealth(200.0F);
        playTameEffect(true);
        this.worldObj.setEntityState(this, (byte)7);
        setCustomNameTag(Owner);
        setOwnerEntity(player);
        setNames(Owner);
        addItems(getItems());
        player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
      }
      if (player.getCommandSenderName().equalsIgnoreCase(getCustomNameTag()))
      {
        if ((this.riddenByEntity == null) && (player.isSneaking())) {
          setDead();
        }
        if ((this.riddenByEntity == null) && (player.isSneaking()!=true)){
        	player.mountEntity(this);
        }
      }
      else {
        player.setFire(10);
      }
    }
    return true;
  }
  
  public void setDead()
  {
    if ((this.owner != null) && (!this.worldObj.isRemote))
    {
      setHealth(1.0F);
      if (getItems() != null) {
        if (this.owner.inventory.addItemStackToInventory(getItems()))
        {
          this.worldObj.playSoundAtEntity(this.owner, "mob.slime.big", 1.0F, 1.0F);
          
          System.out.println("Work");
        }
        else
        {
          this.worldObj.playSoundAtEntity(this.owner, "mob.slime.big", 1.0F, 1.0F);
          
          this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj, this.owner.posX, this.owner.posY, this.owner.posZ, getItems()));
          

          this.owner.inventory.addItemStackToInventory(getItems());
        }
      }
    }
    super.setDead();
  }
  protected void attackEntity(Entity par1Entity, float par2)
  {
    if ((this.attackTime <= 0) && (par2 < 2.0F) && (par1Entity.boundingBox.maxY > this.boundingBox.minY) && (par1Entity.boundingBox.minY < this.boundingBox.maxY))
    {
      this.attackTime = 20;
      attackEntityAsMob(par1Entity);
    }
  }
  
  public void moveEntityWithHeading(float par1, float par2)
  {
    if (this.riddenByEntity != null)
    {
      this.prevRotationYaw = (this.rotationYaw = this.riddenByEntity.rotationYaw);
      this.rotationPitch = (this.riddenByEntity.rotationPitch * 0.5F);
      setRotation(this.rotationYaw, this.rotationPitch);
      this.rotationYawHead = (this.renderYawOffset = this.rotationYaw);
      par1 = 0.0F;
      par2 = ((EntityLivingBase)this.riddenByEntity).moveForward;
      this.stepHeight = 1.0F;
    }
    if (!this.worldObj.isRemote)
    {
      setAIMoveSpeed((float)getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
      super.moveEntityWithHeading(par1, par2);
    }
    if (par2 <= 0.0F) {
      par2 *= 0.25F;
    }
  }
  protected String getLivingSound()
  {
    return null;
  }
  
  protected String getHurtSound()
  {
    return null;
  }
  
  protected String getDeathSound()
  {
    return null;
  }
}
