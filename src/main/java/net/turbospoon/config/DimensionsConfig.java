package net.turbospoon.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class DimensionsConfig {
	
	Configuration config;

	int startID = 0;

	public void preInit(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		startID = config.get("Settings", "StartID", 30000, "Where should turbospoon start to search for free Dimension IDs?").getInt();
		

		if (config.hasChanged())
		{
			config.save();
		}
	}
	
	public int startDimensionID()
	{
		System.out.println("[HEALTHY]: DimenConfig");
		return startID;
	}
}
