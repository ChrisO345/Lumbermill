package com.chrisoliver345.lumbermill;

import com.chrisoliver345.lumbermill.client.ClientHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class Lumbermill
{
    public Lumbermill()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onSetupClient);
    }

    private void onSetupClient(FMLClientSetupEvent event)
    {
        ClientHandler.setup();
    }
}
