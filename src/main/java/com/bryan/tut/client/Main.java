package com.bryan.tut.client;

import com.bryan.tut.init.TutorialItems;
import com.bryan.tut.proxy.serverP;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Variables.MOD_ID, name = Variables.MOD_NAME, version = Variables.MOD_VERSION)
public class Main {
	@SidedProxy(clientSide = Variables.MOD_CLIENT_PROXY, serverSide = Variables.MOD_SERVER_PROXY)
	public static serverP proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		TutorialItems.init();
		TutorialItems.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		
	}
}
