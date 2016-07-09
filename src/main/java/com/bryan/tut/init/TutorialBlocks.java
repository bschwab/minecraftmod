package com.bryan.tut.init;

import com.bryan.tut.client.Variables;

import com.bryan.tut.blocks.obsidianBlock;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class TutorialBlocks {
	
	public static obsidianBlock obsidian_Block;

	public static void init() {
		obsidian_Block = new obsidianBlock();
		obsidian_Block.setUnlocalizedName("obsidian_Block");
	}
	
	public static void registerRenders() {
		registerRender(obsidian_Block);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Variables.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}