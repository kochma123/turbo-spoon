package net.turbospoon.item.tool;

import net.minecraft.item.Item;
import net.turbospoon.Main;
import net.turbospoon.item.ItemModelProvider;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {

	private String name;

	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

}