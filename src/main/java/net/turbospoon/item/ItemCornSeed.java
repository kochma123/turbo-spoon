package net.turbospoon.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.turbospoon.Main;
import net.turbospoon.block.ModBlocks;

public class ItemCornSeed extends ItemSeeds implements ItemModelProvider {

	public ItemCornSeed() {
		super(ModBlocks.cropCorn, Blocks.FARMLAND);
		setUnlocalizedName("cornSeed");
		setRegistryName("cornSeed");

		setCreativeTab(Main.creativeTab);
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(item, 0, "cornSeed");
	}

}