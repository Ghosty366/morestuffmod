package com.ghosty366.morestuffmod.util;

import com.ghosty366.morestuffmod.MoreStuff;
import com.ghosty366.morestuffmod.armor.ModArmorMaterial;
import com.ghosty366.morestuffmod.blocks.BlockItemBase;
import com.ghosty366.morestuffmod.blocks.SteelBlock;
import com.ghosty366.morestuffmod.blocks.SteelOre;
import com.ghosty366.morestuffmod.items.Cheeze;
import com.ghosty366.morestuffmod.items.ItemBase;
import com.ghosty366.morestuffmod.items.Pepperoni;
import com.ghosty366.morestuffmod.items.Pizza;
import com.ghosty366.morestuffmod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreStuff.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreStuff.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> STEEL_PLATING = ITEMS.register("steel_plating", ItemBase::new);
    public static final RegistryObject<Cheeze> CHEEZE = ITEMS.register("cheeze", Cheeze::new);
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel", ItemBase::new);
    public static final RegistryObject<Pizza> PIZZA = ITEMS.register("pizza", Pizza::new);
    public static final RegistryObject<Pepperoni> PEPPERONI = ITEMS.register("pepperoni", Pepperoni::new);

    // Tools
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 0, -2.4F, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, -4, -2.8F, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 1, -3.0F, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModItemTier.STEEL, -3.5F, -2.8F, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, -3, 2, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModItemTier.STEEL, -1, -2.4F, new Item.Properties().group(MoreStuff.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(MoreStuff.TAB)));

    // Blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> STEEL_ORE = BLOCKS.register("steel_ore", SteelOre::new);

    // Block Items
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_ORE_ITEM = ITEMS.register("steel_ore", () -> new BlockItemBase(STEEL_ORE.get()));
}
