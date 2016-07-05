package com.bryan.tut.proxy;

import com.bryan.tut.init.TutorialBlocks;
import com.bryan.tut.init.TutorialItems;

public class clientP extends serverP {
	@Override
	public void registerRenders() {
		TutorialItems.registerRenders();
		TutorialBlocks.registerRenders();
	}
}
