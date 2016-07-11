package com.bryan.tut.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void register() {
		addRecipe();
		addSmelting();
	}

	public static void addRecipe() {
		GameRegistry.addRecipe(new ItemStack(TutorialBlocks.obsidian_Block,1), new Object[]{"XYX","YXY","XYX",'X', TutorialItems.obsidianShard, 'Y', Items.GLOWSTONE_DUST});
	}
	
	public static void addSmelting() {
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(Items.DIAMOND, 1), 20);
	}
}
