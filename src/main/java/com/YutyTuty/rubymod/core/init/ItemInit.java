package com.YutyTuty.rubymod.core.init;

import com.YutyTuty.rubymod.TutorialMod;
import com.YutyTuty.rubymod.core.enums.ArmorMaterialList;
import com.YutyTuty.rubymod.core.enums.ToolMaterialList;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			TutorialMod.MOD_ID);

	// Basic Items
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()
		.group(TutorialMod.ITEM_GROUP)));


	// Block Items
	public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block",
			() -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().group(TutorialMod.ITEM_GROUP)));

	public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
			() -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().group(TutorialMod.ITEM_GROUP)));


	// Tools
	public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
			() -> new SwordItem(ToolMaterialList.RUBY, -2, -2.4f, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));

	public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
			() -> new PickaxeItem(ToolMaterialList.RUBY, -4, -2.8f, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));

	public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
			() -> new AxeItem(ToolMaterialList.RUBY, 0, -3f, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));

	public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
			() -> new ShovelItem(ToolMaterialList.RUBY, -5, -3f, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));

	public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
			() -> new HoeItem(ToolMaterialList.RUBY, -10, 1f, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));


	// Armor
	public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
			() -> new ArmorItem(ArmorMaterialList.RUBY, EquipmentSlotType.HEAD, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));
	public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
			() -> new ArmorItem(ArmorMaterialList.RUBY, EquipmentSlotType.CHEST, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));
	public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
			() -> new ArmorItem(ArmorMaterialList.RUBY, EquipmentSlotType.LEGS, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));
	public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
			() -> new ArmorItem(ArmorMaterialList.RUBY, EquipmentSlotType.FEET, new Item.Properties()
			.group(TutorialMod.ITEM_GROUP)));
}
