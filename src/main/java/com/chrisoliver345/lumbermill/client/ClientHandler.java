package com.chrisoliver345.lumbermill.client;

import com.chrisoliver345.lumbermill.client.gui.screen.inventory.LumbermillScreen;
import com.chrisoliver345.lumbermill.init.ModBlocks;
import com.chrisoliver345.lumbermill.init.ModContainers;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;


public class ClientHandler
{
    public static void setup()
    {
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_LUMBERMILL, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_LUMBERMILL, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_LUMBERMILL, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_LUMBERMILL, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_LUMBERMILL, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_LUMBERMILL, RenderType.cutout());
        ScreenManager.registerFactory(ModContainers.LUMBERMILL, LumbermillScreen::new);
    }
}
