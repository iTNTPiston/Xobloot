package com.tntp.xobloot.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = XoblootMod.MODID, version = XoblootMod.VERSION)
public class XoblootMod {
    public static final String MODID = "xobloot";
    public static final String VERSION = "1.7.10-1.0.0";
    @SidedProxy(clientSide = "com.tntp.xobloot.core.ClientProxy", serverSide = "com.tntp.xobloot.core.Proxy")
    public static Proxy proxy;
    public static Logger log = LogManager.getLogger("Xobloot");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        log.info("*** Xobloot PreInit                     ***");
        proxy.preInit(event);
        log.info("*** Xobloot PreInit Finish             ***");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        log.info("*** Xobloot Init                        ***");
        proxy.init(event);
        log.info("*** Xobloot Init Finish                 ***");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        log.info("*** Xobloot PostInit                    ***");
        proxy.postInit(event);
        log.info("*** Xobloot PostInit Finish             ***");
    }
}
