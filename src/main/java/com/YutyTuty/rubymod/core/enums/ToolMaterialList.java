package com.YutyTuty.rubymod.core.enums;

import com.YutyTuty.rubymod.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
	RUBY(10.0f, 10.0f, 2500, 3, 25, ItemInit.RUBY.get());

	private final float ATTACK_DAMAGE;
	private final float EFFICIENCY;
	private final int DURABILITY, HARVEST_LEVEL, ENCHANTABILITY;
	private final Item REPAIR_MATERIAL;

	ToolMaterialList(float ATTACK_DAMAGE, float EFFICIENCY, int DURABILITY, int HARVEST_LEVEL, int ENCHANTABILITY, Item REPAIR_MATERIAL)
	{
		this.ATTACK_DAMAGE = ATTACK_DAMAGE;
		this.EFFICIENCY = EFFICIENCY;
		this.DURABILITY = DURABILITY;
		this.HARVEST_LEVEL = HARVEST_LEVEL;
		this.ENCHANTABILITY = ENCHANTABILITY;
		this.REPAIR_MATERIAL = REPAIR_MATERIAL;
	}

	@Override
	public int getMaxUses() {
		return this.DURABILITY;
	}

	@Override
	public float getEfficiency() {
		return this.EFFICIENCY;
	}

	@Override
	public float getAttackDamage() {
		return this.ATTACK_DAMAGE;
	}

	@Override
	public int getHarvestLevel() {
		return this.HARVEST_LEVEL;
	}

	@Override
	public int getEnchantability() {
		return this.ENCHANTABILITY;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.REPAIR_MATERIAL);
	}
}
