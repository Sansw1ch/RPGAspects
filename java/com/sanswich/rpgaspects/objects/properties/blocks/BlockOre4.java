package com.sanswich.rpgaspects.objects.properties.blocks;

import com.sanswich.rpgaspects.objects.properties.base.Blockbase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOre4 extends Blockbase{

	public BlockOre4(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(12.0F);
		setResistance(100.0F);
		//made of 1: wooden/gold 2: stone 3: iron/steel/amethyst/ruby/saphire/elven/dwarven  
		//4: diamond/jade/orcish/glass 5: ebony/daedric 6: awakeneddwarven/dragon 7: Soul/Draconic
		setHarvestLevel("pickaxe", 4);
		setLightLevel(0.0F);
		setLightOpacity(0);
	}

}
