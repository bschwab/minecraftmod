package com.bryan.tut.init;

import com.bryan.tut.client.Variables;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialItems {
	
	public static Item obsidianShard;
	
	public static void init() {
		obsidianShard = new Item().setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64).setUnlocalizedName("obsidianShard");
	}
	
	public static void register() {
		GameRegistry.registerItem(obsidianShard, obsidianShard.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(obsidianShard);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Variables.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}