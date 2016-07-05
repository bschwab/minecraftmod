package com.bryan.tut.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObsidianBlock extends Block {

	public ObsidianBlock() {
		super(Material.GLASS);
		setRegistryName("Obsidian_Block");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		this.setCreativeTab(CreativeTabs.MISC);
		this.setHardness(0.3f);
		this.setLightLevel(0.93f);
		this.setLightOpacity(16);
		this.setSoundType(SoundType.GLASS);
	}	
}