package net.turbospoon.dimensions;

import java.util.Arrays;
import java.util.HashSet;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class OurDimension {
	
	public static DimensionType OurDimension;

	public static boolean CreateDimension(EntityPlayer playerIn, int test) {
		int Freeid = 0;
		System.out.println(playerIn.dimension);
		if (test == 1) {
			OurDimension = DimensionType.register("TestDimension", "Test", "turbospoon".hashCode(),
					WorldProviderDimension.class, true);
			try {
				Freeid = findFreeDimensionID();
				System.out.println("[HEALTHY]: Dimenion ID: " + Freeid);
				DimensionManager.registerDimension(Freeid, OurDimension);
				System.out.println("[HEALTHY]: Dimenion Created");
				DimensionManager.initDimension(Freeid);
				System.out.println("[HEALTHY]: Dimenion Loaded");
			} catch (NullPointerException e) {
				System.out.println("Dimension Loading Failed: " + e.getMessage() + e.fillInStackTrace());
			}
		} 
		if (test == 2) {
			if (playerIn instanceof EntityPlayerMP) {
				System.out.println("[HEALTHY]: Player is MP");
				FMLCommonHandler part1 = FMLCommonHandler.instance();
				System.out.println("[HEALTHY]: FMLCommonHandler.instance()");
				MinecraftServer part2 = part1.getMinecraftServerInstance();
				System.out.println("[HEALTHY]: getMinecraftServerInstance()");
				PlayerList part3 = part2.getPlayerList();
				System.out.println("[HEALTHY]: getPlayerList()");
				System.out.println("playerIn - " + (EntityPlayerMP)playerIn);
				System.out.println("Freeid - " + Freeid);
				part3.transferPlayerToDimension((EntityPlayerMP)playerIn, 10, new OurTeleporter((WorldServer)part2.getEntityWorld()));
				System.out.println("[HEALTHY]: changePlayerDimension");
				//	FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().changePlayerDimension((EntityPlayerMP) playerIn,
				//			Freeid);
			} else {
				System.out.println("[ERROR]: I dont't know how this happened. But you're not a player");
			}
		}
		return true;
	}

	private static int findFreeDimensionID() {
		HashSet<Integer> ids = new HashSet<Integer>();
		ids.addAll(Arrays.asList(DimensionManager.getIDs()));
		int currentID = 10;
		while (true) {
			if (!ids.contains(currentID)) {
				return currentID;
			} else {
				currentID++;
			}
		}
	}
}