package com.sanswich.rpgaspects.system.world.gen;

import java.util.Random;

import com.sanswich.rpgaspects.objects.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator{
	private WorldGenerator copper_ore, ebony_ore, amethyst_ore, corundum_ore, jade_ore, malachite_ore, moonstone_ore, orichalcum_ore, quicksilver_ore, ruby_ore, saphire_ore, silver_ore,stalhrim_ore,stalhrim_ore_ice;
	public WorldGenCustomOres() {
		copper_ore = new WorldGenMinable(BlockInit.ORE_COPPER.getDefaultState(),6, BlockMatcher.forBlock(Blocks.STONE));
		ebony_ore = new WorldGenMinable(BlockInit.ORE_EBONY.getDefaultState(),5, BlockMatcher.forBlock(Blocks.STONE));
		amethyst_ore = new WorldGenMinable(BlockInit.ORE_AMETHYST.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
		corundum_ore = new WorldGenMinable(BlockInit.ORE_CORUNDUM.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
		jade_ore = new WorldGenMinable(BlockInit.ORE_JADE.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
		malachite_ore = new WorldGenMinable(BlockInit.ORE_MALACHITE.getDefaultState(),6, BlockMatcher.forBlock(Blocks.STONE));
		moonstone_ore = new WorldGenMinable(BlockInit.ORE_MOONSTONE.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
		orichalcum_ore = new WorldGenMinable(BlockInit.ORE_ORICHALCUM.getDefaultState(),5, BlockMatcher.forBlock(Blocks.STONE));
		quicksilver_ore = new WorldGenMinable(BlockInit.ORE_QUICKSILVER.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
		ruby_ore = new WorldGenMinable(BlockInit.ORE_RUBY.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
		saphire_ore = new WorldGenMinable(BlockInit.ORE_SAPHIRE.getDefaultState(),4, BlockMatcher.forBlock(Blocks.STONE));
		silver_ore = new WorldGenMinable(BlockInit.ORE_SILVER.getDefaultState(),6, BlockMatcher.forBlock(Blocks.STONE));
		stalhrim_ore_ice = new WorldGenMinable(BlockInit.ORE_STALHRIM_ICE.getDefaultState(),3, BlockMatcher.forBlock(Blocks.ICE));
		stalhrim_ore = new WorldGenMinable(BlockInit.ORE_STALHRIM.getDefaultState(),10, BlockMatcher.forBlock(Blocks.PACKED_ICE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		//NETHER
		case -1:
//			runGenerator(ore_nether_copper, world, random, chunkX, chunkZ, 50, minHeight, maxHeight);
			break;
		//OVERWORLD
		case 0:
			runGenerator(copper_ore, world, random, chunkX, chunkZ, 60, 20, 130);
			runGenerator(ebony_ore, world, random, chunkX, chunkZ, 1, 0, 8);
			runGenerator(amethyst_ore, world, random, chunkX, chunkZ, 20, 16, 48);
			runGenerator(corundum_ore, world, random, chunkX, chunkZ, 35, 32, 100);
			runGenerator(jade_ore, world, random, chunkX, chunkZ, 10, 24, 48);
			runGenerator(malachite_ore, world, random, chunkX, chunkZ, 10, 0, 24);
			runGenerator(moonstone_ore, world, random, chunkX, chunkZ, 10, 0, 24);
			runGenerator(orichalcum_ore, world, random, chunkX, chunkZ, 25, 30, 68);
			runGenerator(quicksilver_ore, world, random, chunkX, chunkZ, 10, 48, 130);
			runGenerator(ruby_ore, world, random, chunkX, chunkZ, 10, 24, 48);
			runGenerator(saphire_ore, world, random, chunkX, chunkZ, 10, 24, 48);
			runGenerator(silver_ore, world, random, chunkX, chunkZ, 10, 34, 68);
			runGenerator(stalhrim_ore_ice, world, random, chunkX, chunkZ, 30, 50, 140);
			runGenerator(stalhrim_ore, world, random, chunkX, chunkZ, 150, 50, 140);
			break;
		//END
		case 1:
			break;
		}
	}
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if(minHeight> maxHeight || minHeight<0 || maxHeight>256) throw new IllegalArgumentException("Ore generated out of bounds");
		int heightDiff = maxHeight - minHeight +1;
		
		for(int i=0;i<chance;i++) {
			int x = chunkX*16+rand.nextInt(16);
			int y = minHeight+rand.nextInt(heightDiff);
			int z = chunkZ*16+rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
