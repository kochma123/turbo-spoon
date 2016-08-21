package net.turbospoon.item.tool;

import net.minecraft.item.Item;
import net.turbospoon.Main;
import net.turbospoon.item.ItemModelProvider;

public class ItemHoe extends net.minecraft.item.ItemHoe implements ItemModelProvider {

	private String name;

	public ItemHoe(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

}