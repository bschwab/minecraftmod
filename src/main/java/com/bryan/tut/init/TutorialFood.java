package com.bryan.tut.init;

import com.bryan.tut.client.Variables;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialFood {
	
	public static Item foodBanana;
	
	public static void init() {
		// Not yet wolf food
		foodBanana = new ItemFood(3, 0.9F, false).setUnlocalizedName("food_banana").setCreativeTab(TutorialTabs.tutTab).setMaxStackSize(16);
	}
	
	public static void register() {
		GameRegistry.registerItem(foodBanana, foodBanana.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(foodBanana);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Variables.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
