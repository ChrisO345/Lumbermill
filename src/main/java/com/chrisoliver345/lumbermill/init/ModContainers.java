package com.chrisoliver345.lumbermill.init;

import com.chrisoliver345.lumbermill.Reference;
import com.chrisoliver345.lumbermill.inventory.container.LumbermillContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModContainers
{
    private static final List<ContainerType<?>> CONTAINER_TYPES = new ArrayList<>();

    public static final ContainerType<LumbermillContainer> LUMBERMILL = register(Reference.MOD_ID + ":lumbermill", LumbermillContainer::new);

    private static <T extends Container> ContainerType<T> register(String key, ContainerType.IFactory<T> factory)
    {
        ContainerType<T> type = new ContainerType<>(factory);
        type.setRegistryName(key);
        CONTAINER_TYPES.add(type);
        return type;
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerTypes(final RegistryEvent.Register<ContainerType<?>> event)
    {
        IForgeRegistry<ContainerType<?>> registry = event.getRegistry();
        CONTAINER_TYPES.forEach(registry::register);
        CONTAINER_TYPES.clear();
    }
}
