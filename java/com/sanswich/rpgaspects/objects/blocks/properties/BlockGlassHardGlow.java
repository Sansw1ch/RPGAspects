package com.sanswich.rpgaspects.objects.blocks.properties;

import com.sanswich.rpgaspects.objects.blocks.Blockbase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGlassHardGlow extends Blockbase{

	public BlockGlassHardGlow(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(1.0F);
		setResistance(30.0F);
		//made of 1: wooden/gold 2: stone 3: iron/steel/amethyst/ruby/saphire/elven/dwarven  
		//4: diamond/jade/orcish/glass 5: ebony/daedric 6: awakeneddwarven/dragon 7: Soul/Draconic
		setHarvestLevel("pickaxe", 0);
		setLightLevel(20.0F);
		setLightOpacity(0);
	}

}
