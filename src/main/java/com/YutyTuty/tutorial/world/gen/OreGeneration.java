package com.YutyTuty.tutorial.world.gen;

import com.YutyTuty.tutorial.TutorialMod;
import com.YutyTuty.tutorial.core.init.BlockInit;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class OreGeneration {
	private static final ArrayList<ConfiguredFeature<?, ?>> OVERWORLD_ORE = new ArrayList<ConfiguredFeature<?, ?>>();

	public static void registerOre()
	{
		OVERWORLD_ORE.add(register("ruby_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
				OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.RUBY_ORE.get().getDefaultState(), 4))
				.range(64)
				.func_242731_b(16)
		));
	}

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature)
	{
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, TutorialMod.MOD_ID + ":" + name, configuredFeature);
	}
}
