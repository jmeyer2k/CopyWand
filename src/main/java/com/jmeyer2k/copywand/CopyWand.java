package com.jmeyer2k.copywand;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = CopyWand.MODID, version = CopyWand.VERSION)
public class CopyWand
{
    public static final String MODID = "copywand";
    public static final String VERSION = "1.0.1a";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
