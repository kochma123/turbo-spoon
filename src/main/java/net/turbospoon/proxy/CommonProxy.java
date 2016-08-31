package net.turbospoon.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.common.AchievementPage;
import net.turbospoon.achievements.ModAchievements;

public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	public void init(){
		ModAchievements.init();
		AchievementPage.registerAchievementPage(new AchievementPage("Turbo Spoon", ModAchievements.getAchievements()));
	}

}
