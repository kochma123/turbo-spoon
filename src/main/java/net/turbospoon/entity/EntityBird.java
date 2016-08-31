package net.turbospoon.entity;

import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.world.World;

public class EntityBird extends EntityAmbientCreature{

	public EntityBird(World worldIn) {
		super(worldIn);
	}

    protected void entityInit()
    {
        super.entityInit();
        //this.dataManager.register(false, Byte.valueOf((byte)0));
    }

}
