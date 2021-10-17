package com.ghosty366.morestuffmod.tools;

import com.ghosty366.morestuffmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    STEEL(3, 1600, 9.0F, 8.0F, 12, () -> {
       return Ingredient.of(RegistryHandler.STEEL_SWORD.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackdamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackdamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackdamage = attackdamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    

    @Override
    public int getUses() {
        // TODO Auto-generated method stub
        return maxUses;
    }

    @Override
    public float getSpeed() {
        // TODO Auto-generated method stub
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        // TODO Auto-generated method stub
        return attackdamage;
    }

    @Override
    public int getLevel() {
        // TODO Auto-generated method stub
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        // TODO Auto-generated method stub
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return repairMaterial.get();
    }
}
