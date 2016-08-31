package net.turbospoon;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.turbospoon.block.ModBlocks;
import net.turbospoon.client.TurboSpoonTab;
import net.turbospoon.config.DimensionsConfig;
import net.turbospoon.drops.ModDropHandler;
import net.turbospoon.item.ModItems;
import net.turbospoon.proxy.CommonProxy;
import net.turbospoon.recipe.ModRecipes;
import net.turbospoon.world.ModWorldGen;

@Mod(modid = Main.modId, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.10.2]")
public class Main {
	
	public static Main INSTANCE;

	public static final String modId = "turbospoon";
	public static final String name = "Turbo Spoon";
	public static final String version = "@VERSION@";
	
	public DimensionsConfig config;
	//public DimensionType OurDimension;

	// reference to our mod
	@Mod.Instance(modId)
	public static Main instance;

	@SidedProxy(serverSide = "net.turbospoon.proxy.CommonProxy", clientSide = "net.turbospoon.proxy.ClientProxy")
	public static CommonProxy proxy;

	// Reference to our creative tab
	public static final TurboSpoonTab creativeTab = new TurboSpoonTab();
	
	// Adds new materials to be used in crafting recipes
	public static final Item.ToolMaterial copperMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);

	// Config stuff is here
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
		config = new DimensionsConfig();
		config.preInit(event);
		//OurDimension = DimensionType.register("TestDimension", "Test", "turbospoon".hashCode(), WorldProviderDimension.class, true);
		
	}

	// Loading the mod
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(new ModDropHandler());
		MinecraftForge.EVENT_BUS.register(new EventListener());
	}

	// modsLoaded
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.init();
	}
}