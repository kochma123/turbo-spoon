package net.turbospoon.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.turbospoon.Main;
import net.turbospoon.item.ModItems;

public class TurboSpoonTab extends CreativeTabs {

	public TurboSpoonTab() {
		super(Main.modId);
		setBackgroundImageName("tutorialmod.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ingotCopper;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

}