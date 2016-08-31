package net.turbospoon.achievements;

import net.minecraft.stats.Achievement;
import net.turbospoon.item.ModItems;

public class ModAchievements {

	public static Achievement achievementStarting = new Achievement("test","test",0,0,ModItems.ingotCopper,null);
	public static Achievement nextAchievement = new Achievement("test1","test1",0,3,ModItems.copperSword,achievementStarting);
	
	public static void init(){
		achievementStarting.registerStat();
		nextAchievement.registerStat();
	}

	public static Achievement[] getAchievements() {
		return new Achievement[] {achievementStarting,nextAchievement};
	}
}
