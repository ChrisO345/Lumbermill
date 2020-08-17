package com.chrisoliver345.lumbermill.init;

import com.chrisoliver345.lumbermill.Reference;
import com.chrisoliver345.lumbermill.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
    private static final List<Block> BLOCKS = new ArrayList<>();
    private static final List<Item> ITEMS = new ArrayList<>();

    public static final Block OAK_LUMBERMILL = register(new ResourceLocation(Reference.MOD_ID, "oak_lumbermill"),
            new LumbermillBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));
    public static final Block BIRCH_LUMBERMILL = register(new ResourceLocation(Reference.MOD_ID, "birch_lumbermill"),
            new LumbermillBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));
    public static final Block ACACIA_LUMBERMILL = register(new ResourceLocation(Reference.MOD_ID, "acacia_lumbermill"),
            new LumbermillBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));
    public static final Block DARK_OAK_LUMBERMILL = register(new ResourceLocation(Reference.MOD_ID, "dark_oak_lumbermill"),
            new LumbermillBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));
    public static final Block JUNGLE_LUMBERMILL = register(new ResourceLocation(Reference.MOD_ID, "jungle_lumbermill"),
            new LumbermillBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));
    public static final Block SPRUCE_LUMBERMILL = register(new ResourceLocation(Reference.MOD_ID, "spruce_lumbermill"),
            new LumbermillBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5F)));

    private static Block register(ResourceLocation key, Block block)
    {
        block.setRegistryName(key);
        BLOCKS.add(block);
        BlockItem item = new BlockItem(block, new Item.Properties().group(ItemGroup.DECORATIONS));
        item.setRegistryName(key);
        ITEMS.add(item);
        return block;
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        BLOCKS.forEach(registry::register);
        BLOCKS.clear();
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        ITEMS.forEach(registry::register);
        ITEMS.clear();
    }
}
