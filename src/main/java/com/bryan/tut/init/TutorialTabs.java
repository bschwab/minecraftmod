package com.bryan.tut.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialTabs {

	public static final CreativeTabs tutTab = new CreativeTabs("tutTab") {
		
		@Override
		public Item getTabIconItem() {
			return TutorialItems.obsidianShard;
		}
	};
}
