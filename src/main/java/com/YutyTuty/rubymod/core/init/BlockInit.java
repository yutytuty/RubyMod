package com.YutyTuty.rubymod.core.init;

import com.YutyTuty.rubymod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			TutorialMod.MOD_ID);

	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.RED)
			.hardnessAndResistance(5f, 6f)
			.sound(SoundType.METAL)));

	public static final RegistryObject<OreBlock> RUBY_ORE = BLOCKS.register("ruby_ore",
			() -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.RED)
			.hardnessAndResistance(3f, 3f)
			.sound(SoundType.STONE)
			.setRequiresTool()
			.harvestLevel(2)));
}
