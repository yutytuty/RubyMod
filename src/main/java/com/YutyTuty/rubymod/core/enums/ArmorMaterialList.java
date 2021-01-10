package com.YutyTuty.rubymod.core.enums;

import com.YutyTuty.rubymod.TutorialMod;
import com.YutyTuty.rubymod.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial
{
    RUBY("ruby", 2000, new int[] {3, 8, 6, 3}, 25, ItemInit.RUBY.get(), "", 4f, 0.2f);

    private final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String NAME;
    private final String EQUIP_SOUND;
    private final int DURABILITY, ENCHANTABILITY;
    private final int[] DAMAGE_REDUCTION_AMOUNT;
    private final float TOUGHNESS, KNOCKBACK_RESISTANCE;
    Item REPAIR_ITEM;

    ArmorMaterialList(String NAME, int DURABILITY, int[] DAMAGE_REDUCTION_AMOUNT, int ENCHANTABILITY, Item REPAIR_ITEM, String EQUIP_SOUND, float TOUGHNESS,
                      float KNOCKBACK_RESISTANCE)
    {
        this.NAME = NAME;
        this.DURABILITY = DURABILITY;
        this.DAMAGE_REDUCTION_AMOUNT = DAMAGE_REDUCTION_AMOUNT;
        this.ENCHANTABILITY = ENCHANTABILITY;
        this.REPAIR_ITEM = REPAIR_ITEM;
        this.EQUIP_SOUND = EQUIP_SOUND;
        this.TOUGHNESS = TOUGHNESS;
        this.KNOCKBACK_RESISTANCE = KNOCKBACK_RESISTANCE;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.DURABILITY;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.DAMAGE_REDUCTION_AMOUNT[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.ENCHANTABILITY;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return new SoundEvent(new ResourceLocation(this.EQUIP_SOUND));
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.REPAIR_ITEM);
    }

    @Override
    public String getName() {
        return TutorialMod.MOD_ID + ":" + this.NAME;
    }

    @Override
    public float getToughness() {
        return this.TOUGHNESS;
    }

    @Override
    public float getKnockbackResistance() {
        return this.KNOCKBACK_RESISTANCE;
    }
}
