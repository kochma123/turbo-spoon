package net.turbospoon.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockSomething extends BlockBase {

	public BlockSomething(Material material, String name) {
		super(material, name);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.STICK;
    }
	
	public int quantityDropped(Random random)
    {
        return 3;
    }

}
