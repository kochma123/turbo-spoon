package net.turbospoon.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.turbospoon.Main;
import net.turbospoon.item.tool.ItemAxe;
import net.turbospoon.item.tool.ItemHoe;
import net.turbospoon.item.tool.ItemPickaxe;
import net.turbospoon.item.tool.ItemShovel;
import net.turbospoon.item.tool.ItemSword;

public class ModItems {

	// references to the items we are adding
	public static ItemBase ingotCopper;
	public static ItemCorn corn;
	public static ItemCornSeed cornSeed;
	public static ItemSword copperSword;
	public static ItemPickaxe copperPickaxe;
	public static ItemShovel copperShovel;
	public static ItemAxe copperAxe;
	public static ItemHoe copperHoe;
	public static ItemBase trap;
	
	// Actually adds the items here
	public static void init() {
		ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
		corn = register(new ItemCorn());
		cornSeed = register(new ItemCornSeed());
		copperSword = register(new ItemSword(Main.copperMaterial, "copperSword"));
		copperPickaxe = register(new ItemPickaxe(Main.copperMaterial, "copperPickaxe"));
		copperShovel = register(new ItemShovel(Main.copperMaterial, "copperShovel"));
		copperAxe = register(new ItemAxe(Main.copperMaterial, "copperAxe"));
		copperHoe = register(new ItemHoe(Main.copperMaterial, "copperHoe"));
		trap = register(new ItemBase("trap"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}

		return item;
	}
}
