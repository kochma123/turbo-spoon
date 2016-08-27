package net.turbospoon.dimensions;

import java.util.Arrays;
import java.util.HashSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class OurDimension {
	
	public static DimensionType OurDimension;

	public static boolean CreateDimension(EntityPlayer playerIn, int test) {
		System.out.println(playerIn.dimension);
		if (test == 1) {
			OurDimension = DimensionType.register("TestDimension", "Test", "turbospoon".hashCode(),
					WorldProviderDimension.class, true);
			try {
				int Freeid = findFreeDimensionID();
				System.out.println("[HEALTHY]: Dimenion ID: " + Freeid);
				DimensionManager.registerDimension(Freeid, OurDimension);
				System.out.println("[HEALTHY]: Dimenion Created");
				DimensionManager.initDimension(Freeid);
				System.out.println("[HEALTHY]: Dimenion Loaded");
				// playerIn.changeDimension(Freeid);
				if (playerIn instanceof EntityPlayerMP) {
					FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().changePlayerDimension((EntityPlayerMP) playerIn,
							Freeid);
				} else {
					System.out.println("[ERROR]: I dont't know how this happened. But you're not a player");
				}
				System.out.println("[HEALTHY]: Player now in dimenion: " + Freeid);
			} catch (NullPointerException e) {
				System.out.println("Dimension Loading Failed: " + e.getMessage() + e.fillInStackTrace());
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
