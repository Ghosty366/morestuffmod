package com.ghosty366.morestuffmod.armor;

import com.ghosty366.morestuffmod.MoreStuff;
import com.ghosty366.morestuffmod.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    STEEL(MoreStuff.MOD_ID + ":steel", 35, new int[] { 3, 6, 7, 3 }, 9, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, () -> { return Ingredient.of(RegistryHandler.STEEL.get()); }, 0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;
    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        // TODO Auto-generated method stub
        return MAX_DAMAGE_ARRAY[p_200896_1_.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        // TODO Auto-generated method stub
        return this.damageReductionAmountArray[p_200902_1_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        // TODO Auto-generated method stub
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        // TODO Auto-generated method stub
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return this.repairMaterial.get();
    }
}
