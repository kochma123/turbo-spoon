package net.turbospoon.dimensions;



import net.minecraft.world.DimensionType;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.storage.WorldInfo;
import net.turbospoon.biome.OurBiomeProvider;

public class WorldProviderDimension extends WorldProvider {

	public WorldProviderDimension() {
		super();
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionType.OVERWORLD;
	}
	
	public void createBiomeProvider()
    {
		Long seed = 2052930197336800526L;
		WorldSettings settings = new WorldSettings(seed, GameType.SURVIVAL, true, false, new WorldType("OurDimension"));
		WorldInfo info = new WorldInfo(settings, "OurDimension");
        this.biomeProvider = new OurBiomeProvider(info);
    }
}
