package net.turbospoon.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.turbospoon.block.ModBlocks;
import net.turbospoon.item.ModItems;

public class ModRecipes {

	public static void init() {
//		Shapeless Crafting
//		addShapelessRecipe(ItemStack output, Item/Block/ItemStack.. inputs)
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), ModItems.corn);
		
		
//		Shaped Crafting
//		addShapedRecipe(ItemStack output, String firstRow,String secondRow , String thridRow, (char,Item/Block/ItemStack))
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_STEW), " R ", "CPM", " B ", 'R', Items.COOKED_RABBIT, 'C', ModItems.corn, 'P', Items.BAKED_POTATO, 'M', Blocks.BROWN_MUSHROOM, 'B', Items.BOWL);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperPickaxe), "CCC"," S "," S ",'C',ModItems.ingotCopper,'S',Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperAxe), "CC ","CS "," S ",'C',ModItems.ingotCopper,'S',Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSword), " C "," C "," S ",'C',ModItems.ingotCopper,'S',Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHoe), "CC "," S "," S ",'C',ModItems.ingotCopper,'S',Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperShovel), " C "," S "," S ",'C',ModItems.ingotCopper,'S',Items.STICK);
		
//		Recipe (similar to shaped crafting but can start on any line)
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.BUCKET, "I I", " I ", 'I', "ingotCopper"));
		GameRegistry.addRecipe(new ItemStack(ModItems.trap), " S", "SS", 'S', Items.STICK);

//		Smelting
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
	}

}