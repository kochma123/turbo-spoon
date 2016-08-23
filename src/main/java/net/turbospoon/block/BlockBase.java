package net.turbospoon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.turbospoon.Main;
import net.turbospoon.item.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.creativeTab);
	}

	public BlockBase setHardness(float hardness){
		super.setHardness(hardness);
		return this;
	}
	
	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(item, 0, name);
	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}