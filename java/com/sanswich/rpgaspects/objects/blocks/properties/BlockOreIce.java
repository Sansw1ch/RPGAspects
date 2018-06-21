package com.sanswich.rpgaspects.objects.blocks.properties;

import com.sanswich.rpgaspects.objects.blocks.Blockbase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOreIce extends Blockbase{

	public BlockOreIce(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(35.0F);
		setResistance(30.0F);
		//made of 1: wooden/gold 2: stone 3: iron/steel/amethyst/ruby/saphire/elven/dwarven  
		//4: diamond/jade/orcish/glass 5: ebony/daedric 6: awakeneddwarven/dragon 7: Soul/Draconic
		setHarvestLevel("pickaxe", 4);
		setLightLevel(0.0F);
		setLightOpacity(-2);
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isTranslucent(IBlockState state) 
	{
		return true;
	}
	@Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
