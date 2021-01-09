package com.YutyTuty.tutorial;

import com.YutyTuty.tutorial.core.init.BlockInit;
import com.YutyTuty.tutorial.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/*
To get the right ruby color from iron items you need to use HSV: (0, 100, 60) and an alpha of 175
 */

@Mod("tutorial")
public class TutorialMod
{
    public static final String MOD_ID = "tutorial";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup ITEM_GROUP = (new ItemGroup("tutorial_mod") {
        @SuppressWarnings("NullableProblems")
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.RUBY.get());
        }
    });

    public TutorialMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
