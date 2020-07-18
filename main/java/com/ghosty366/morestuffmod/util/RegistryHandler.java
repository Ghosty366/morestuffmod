package com.ghosty366.morestuffmod.util;

import com.ghosty366.morestuffmod.MoreStuff;
import com.ghosty366.morestuffmod.blocks.BlockItemBase;
import com.ghosty366.morestuffmod.blocks.SteelBlock;
import com.ghosty366.morestuffmod.blocks.SteelOre;
import com.ghosty366.morestuffmod.items.Cheeze;
import com.ghosty366.morestuffmod.items.ItemBase;
import com.ghosty366.morestuffmod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoreStuff.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MoreStuff.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> STEEL_PLATING = ITEMS.register("steel_plating", ItemBase::new);
    public static final RegistryObject<Cheeze> CHEEZE = ITEMS.register("cheeze", Cheeze::new);
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 0, -2.4F, new Item.Properties().group(MoreStuff.TAB)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, -4, -2.8F, new Item.Properties().group(MoreStuff.TAB)));

    // Blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> STEEL_ORE = BLOCKS.register("steel_ore", SteelOre::new);

    // Block Items
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_ORE_ITEM = ITEMS.register("steel_ore", () -> new BlockItemBase(STEEL_ORE.get()));
}
