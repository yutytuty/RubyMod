package com.YutyTuty.rubymod.world.gen;

import com.YutyTuty.rubymod.TutorialMod;
import com.YutyTuty.rubymod.core.init.BlockInit;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class OreGeneration {
	private static final ArrayList<ConfiguredFeature<?, ?>> OVERWORLD_ORE = new ArrayList<ConfiguredFeature<?, ?>>();

	public static void registerOre()
	{
		OVERWORLD_ORE.add(register("ruby_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.RUBY_ORE.get().getDefaultState(), 8))
				.range(20).square()
				.func_242731_b(3)
		));
	}

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature)
	{
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, TutorialMod.MOD_ID + ":" + name, configuredFeature);
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void gen(BiomeLoadingEvent event)
	{
		BiomeGenerationSettingsBuilder generation = event.getGeneration();
		for (ConfiguredFeature<?, ?> ore :OVERWORLD_ORE)
		{
			if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
		}
	}
}
