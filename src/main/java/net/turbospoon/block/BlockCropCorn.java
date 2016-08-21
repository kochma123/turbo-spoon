package net.turbospoon.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.turbospoon.Main;
import net.turbospoon.item.ModItems;

public class BlockCropCorn extends BlockCrops {

	public BlockCropCorn() {
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");

		setCreativeTab(Main.creativeTab);
	}

	@Override
	protected Item getSeed() {
		return ModItems.cornSeed;
	}

	@Override
	protected Item getCrop() {
		return ModItems.corn;
	}

}