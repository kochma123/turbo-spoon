package net.turbospoon.block;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

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
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		playerIn.displayGUIChest(playerIn.getInventoryEnderChest());
		System.out.println("It works!");
        return true;
    }
}
