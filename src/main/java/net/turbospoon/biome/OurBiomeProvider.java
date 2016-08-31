package net.turbospoon.biome;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.storage.WorldInfo;

public class OurBiomeProvider extends BiomeProvider {
	public static List<Biome> allowedBiomes = Lists.newArrayList(Biomes.PLAINS, Biomes.DESERT, Biomes.ICE_PLAINS, Biomes.ICE_MOUNTAINS, Biomes.DESERT_HILLS, Biomes.SAVANNA, Biomes.MESA, Biomes.MESA_CLEAR_ROCK, Biomes.MESA_ROCK);

    public OurBiomeProvider(WorldInfo info)
    {
        super(info);
    }

}
