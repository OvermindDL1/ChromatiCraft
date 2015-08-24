/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension.Structure.Locks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import Reika.ChromatiCraft.Base.DimensionStructureGenerator;
import Reika.ChromatiCraft.Base.StructurePiece;
import Reika.ChromatiCraft.Block.Worldgen.BlockStructureShield.BlockType;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.DragonAPI.Instantiable.Worldgen.ChunkSplicedGenerationCache;

public class LocksLoot extends StructurePiece {

	public LocksLoot(DimensionStructureGenerator s) {
		super(s);
	}

	@Override
	public void generate(ChunkSplicedGenerationCache world, int x, int y, int z) {

		this.generateBlocks(world, x, y, z);
		this.generateAir(world, x, y, z);
	}

	private void generateBlocks(ChunkSplicedGenerationCache world, int x, int y, int z) {

		Block b = ChromaBlocks.STRUCTSHIELD.getBlockInstance();
		int ms = BlockType.STONE.metadata;
		int ml = BlockType.LIGHT.metadata;
		int mg = BlockType.GLASS.metadata;
		int mc = BlockType.CRACKS.metadata;

		this.placeCore(x+4, y+2, z-5);

		for (int i = -1; i <= 1; i++)
			for (int k = -1; k <= 1; k++)
				parent.addBreakable(x+4+i, y, z-5+k);

		world.setBlock(x+0, y+0, z-2, b, ms);
		world.setBlock(x+0, y+0, z-3, b, ms);
		world.setBlock(x+0, y+0, z-4, b, ms);
		world.setBlock(x+0, y+0, z-5, b, ms);
		world.setBlock(x+0, y+0, z-6, b, ms);
		world.setBlock(x+0, y+0, z-7, b, ms);
		world.setBlock(x+0, y+0, z-8, b, ms);
		world.setBlock(x+0, y+1, z-2, b, ms);
		world.setBlock(x+0, y+1, z-3, b, ms);
		world.setBlock(x+0, y+1, z-4, b, ms);
		world.setBlock(x+0, y+1, z-5, b, ms);
		world.setBlock(x+0, y+1, z-6, b, ms);
		world.setBlock(x+0, y+1, z-7, b, ms);
		world.setBlock(x+0, y+1, z-8, b, ms);
		world.setBlock(x+0, y+2, z-2, b, ms);
		world.setBlock(x+0, y+2, z-3, b, ms);
		world.setBlock(x+0, y+2, z-4, b, ms);
		world.setBlock(x+0, y+2, z-5, b, ms);
		world.setBlock(x+0, y+2, z-6, b, ms);
		world.setBlock(x+0, y+2, z-7, b, ms);
		world.setBlock(x+0, y+2, z-8, b, ms);
		world.setBlock(x+0, y+3, z-2, b, ms);
		world.setBlock(x+0, y+3, z-3, b, ms);
		world.setBlock(x+0, y+3, z-4, b, ms);
		world.setBlock(x+0, y+3, z-5, b, ms);
		world.setBlock(x+0, y+3, z-6, b, ms);
		world.setBlock(x+0, y+3, z-7, b, ms);
		world.setBlock(x+0, y+3, z-8, b, ms);
		world.setBlock(x+0, y+4, z-2, b, ms);
		world.setBlock(x+0, y+4, z-3, b, ms);
		world.setBlock(x+0, y+4, z-4, b, ms);
		world.setBlock(x+0, y+4, z-5, b, ms);
		world.setBlock(x+0, y+4, z-6, b, ms);
		world.setBlock(x+0, y+4, z-7, b, ms);
		world.setBlock(x+0, y+4, z-8, b, ms);
		world.setBlock(x+0, y+5, z-3, b, ms);
		world.setBlock(x+0, y+5, z-4, b, ms);
		world.setBlock(x+0, y+5, z-5, b, ms);
		world.setBlock(x+0, y+5, z-6, b, ms);
		world.setBlock(x+0, y+5, z-7, b, ms);
		world.setBlock(x+1, y+0, z-1, b, ms);
		world.setBlock(x+1, y+0, z-2, b, ms);
		world.setBlock(x+1, y+0, z-3, b, ms);
		world.setBlock(x+1, y+0, z-4, b, ms);
		world.setBlock(x+1, y+0, z-5, b, ms);
		world.setBlock(x+1, y+0, z-6, b, ms);
		world.setBlock(x+1, y+0, z-7, b, ms);
		world.setBlock(x+1, y+0, z-8, b, ms);
		world.setBlock(x+1, y+0, z-9, b, ms);
		world.setBlock(x+1, y+1, z-1, b, ms);
		world.setBlock(x+1, y+1, z-9, b, ms);
		world.setBlock(x+1, y+2, z-1, b, ms);
		world.setBlock(x+1, y+2, z-9, b, ms);
		world.setBlock(x+1, y+3, z-1, b, ms);
		world.setBlock(x+1, y+3, z-9, b, ms);
		world.setBlock(x+1, y+4, z-1, b, ms);
		world.setBlock(x+1, y+4, z-4, b, ms);
		world.setBlock(x+1, y+4, z-5, b, ml);
		world.setBlock(x+1, y+4, z-6, b, ms);
		world.setBlock(x+1, y+4, z-9, b, ms);
		world.setBlock(x+1, y+5, z-2, b, ms);
		world.setBlock(x+1, y+5, z-8, b, ms);
		world.setBlock(x+1, y+6, z-3, b, ms);
		world.setBlock(x+1, y+6, z-4, b, ms);
		world.setBlock(x+1, y+6, z-5, b, ms);
		world.setBlock(x+1, y+6, z-6, b, ms);
		world.setBlock(x+1, y+6, z-7, b, ms);
		world.setBlock(x+2, y+0, z-0, b, ms);
		world.setBlock(x+2, y+0, z-1, b, ms);
		world.setBlock(x+2, y+0, z-2, b, ms);
		world.setBlock(x+2, y+0, z-3, b, ms);
		world.setBlock(x+2, y+0, z-4, b, ms);
		world.setBlock(x+2, y+0, z-5, b, ms);
		world.setBlock(x+2, y+0, z-6, b, ms);
		world.setBlock(x+2, y+0, z-7, b, ms);
		world.setBlock(x+2, y+0, z-8, b, ms);
		world.setBlock(x+2, y+0, z-9, b, ms);
		world.setBlock(x+2, y+0, z-10, b, ms);
		world.setBlock(x+2, y+1, z-0, b, ms);
		world.setBlock(x+2, y+1, z-4, b, ms);
		world.setBlock(x+2, y+1, z-5, b, ms);
		world.setBlock(x+2, y+1, z-6, b, ms);
		world.setBlock(x+2, y+1, z-10, b, ms);
		world.setBlock(x+2, y+2, z-0, b, ms);
		world.setBlock(x+2, y+2, z-4, b, ms);
		world.setBlock(x+2, y+2, z-5, b, mg);
		world.setBlock(x+2, y+2, z-6, b, ms);
		world.setBlock(x+2, y+2, z-10, b, ms);
		world.setBlock(x+2, y+3, z-0, b, ms);
		world.setBlock(x+2, y+3, z-4, b, ms);
		world.setBlock(x+2, y+3, z-5, b, ms);
		world.setBlock(x+2, y+3, z-6, b, ms);
		world.setBlock(x+2, y+3, z-10, b, ms);
		world.setBlock(x+2, y+4, z-0, b, ms);
		world.setBlock(x+2, y+4, z-4, b, ms);
		world.setBlock(x+2, y+4, z-5, b, ms);
		world.setBlock(x+2, y+4, z-6, b, ms);
		world.setBlock(x+2, y+4, z-10, b, ms);
		world.setBlock(x+2, y+5, z-1, b, ms);
		world.setBlock(x+2, y+5, z-2, b, ms);
		world.setBlock(x+2, y+5, z-8, b, ms);
		world.setBlock(x+2, y+5, z-9, b, ms);
		world.setBlock(x+2, y+6, z-3, b, ms);
		world.setBlock(x+2, y+6, z-4, b, ms);
		world.setBlock(x+2, y+6, z-5, b, ms);
		world.setBlock(x+2, y+6, z-6, b, ms);
		world.setBlock(x+2, y+6, z-7, b, ms);
		world.setBlock(x+3, y+0, z-0, b, ms);
		world.setBlock(x+3, y+0, z-1, b, ms);
		world.setBlock(x+3, y+0, z-2, b, ms);
		world.setBlock(x+3, y+0, z-3, b, ms);
		world.setBlock(x+3, y+0, z-4, b, ms);
		world.setBlock(x+3, y+0, z-5, b, ms);
		world.setBlock(x+3, y+0, z-6, b, ms);
		world.setBlock(x+3, y+0, z-7, b, ms);
		world.setBlock(x+3, y+0, z-8, b, ms);
		world.setBlock(x+3, y+0, z-9, b, ms);
		world.setBlock(x+3, y+0, z-10, b, ms);
		world.setBlock(x+3, y+1, z-0, b, ms);
		world.setBlock(x+3, y+1, z-3, b, ms);
		world.setBlock(x+3, y+1, z-7, b, ms);
		world.setBlock(x+3, y+2, z-0, b, ms);
		world.setBlock(x+3, y+2, z-3, b, ms);
		world.setBlock(x+3, y+2, z-7, b, ms);
		world.setBlock(x+3, y+3, z-0, b, ms);
		world.setBlock(x+3, y+3, z-3, b, ms);
		world.setBlock(x+3, y+3, z-7, b, ms);
		world.setBlock(x+3, y+4, z-0, b, ms);
		world.setBlock(x+3, y+4, z-3, b, ms);
		world.setBlock(x+3, y+4, z-7, b, ms);
		world.setBlock(x+3, y+4, z-10, b, ms);
		world.setBlock(x+3, y+5, z-1, b, ms);
		world.setBlock(x+3, y+5, z-2, b, ms);
		world.setBlock(x+3, y+5, z-3, b, ms);
		world.setBlock(x+3, y+5, z-7, b, ms);
		world.setBlock(x+3, y+5, z-8, b, ms);
		world.setBlock(x+3, y+5, z-9, b, ms);
		world.setBlock(x+3, y+6, z-3, b, ms);
		world.setBlock(x+3, y+6, z-4, b, ms);
		world.setBlock(x+3, y+6, z-5, b, ms);
		world.setBlock(x+3, y+6, z-6, b, ms);
		world.setBlock(x+3, y+6, z-7, b, ms);
		world.setBlock(x+4, y+0, z-0, b, ms);
		world.setBlock(x+4, y+0, z-1, b, ms);
		world.setBlock(x+4, y+0, z-2, b, ms);
		world.setBlock(x+4, y+0, z-3, b, ms);
		world.setBlock(x+4, y+0, z-4, b, ms);
		world.setBlock(x+4, y+0, z-5, b, ms);
		world.setBlock(x+4, y+0, z-6, b, ms);
		world.setBlock(x+4, y+0, z-7, b, ms);
		world.setBlock(x+4, y+0, z-8, b, ms);
		world.setBlock(x+4, y+0, z-9, b, ms);
		world.setBlock(x+4, y+0, z-10, b, ms);
		world.setBlock(x+4, y+1, z-0, b, ms);
		world.setBlock(x+4, y+1, z-3, b, mc);
		world.setBlock(x+4, y+1, z-7, b, ms);
		world.setBlock(x+4, y+2, z-0, b, ml);
		world.setBlock(x+4, y+2, z-3, b, mc);
		world.setBlock(x+4, y+2, z-7, b, ml);
		world.setBlock(x+4, y+3, z-0, b, ms);
		world.setBlock(x+4, y+3, z-3, b, mc);
		world.setBlock(x+4, y+3, z-7, b, ms);
		world.setBlock(x+4, y+4, z-0, b, ms);
		world.setBlock(x+4, y+4, z-1, b, ms);
		world.setBlock(x+4, y+4, z-2, b, ms);
		world.setBlock(x+4, y+4, z-3, b, ms);
		world.setBlock(x+4, y+4, z-7, b, ms);
		world.setBlock(x+4, y+4, z-10, b, ms);
		world.setBlock(x+4, y+5, z-1, b, ms);
		world.setBlock(x+4, y+5, z-2, b, ms);
		world.setBlock(x+4, y+5, z-3, b, ms);
		world.setBlock(x+4, y+5, z-7, b, ms);
		world.setBlock(x+4, y+5, z-8, b, ms);
		world.setBlock(x+4, y+5, z-9, b, ms);
		world.setBlock(x+4, y+6, z-3, b, ms);
		world.setBlock(x+4, y+6, z-4, b, ms);
		world.setBlock(x+4, y+6, z-5, b, ms);
		world.setBlock(x+4, y+6, z-6, b, ms);
		world.setBlock(x+4, y+6, z-7, b, ms);
		world.setBlock(x+5, y+0, z-0, b, ms);
		world.setBlock(x+5, y+0, z-1, b, ms);
		world.setBlock(x+5, y+0, z-2, b, ms);
		world.setBlock(x+5, y+0, z-3, b, ms);
		world.setBlock(x+5, y+0, z-4, b, ms);
		world.setBlock(x+5, y+0, z-5, b, ms);
		world.setBlock(x+5, y+0, z-6, b, ms);
		world.setBlock(x+5, y+0, z-7, b, ms);
		world.setBlock(x+5, y+0, z-8, b, ms);
		world.setBlock(x+5, y+0, z-9, b, ms);
		world.setBlock(x+5, y+0, z-10, b, ms);
		world.setBlock(x+5, y+1, z-0, b, ms);
		world.setBlock(x+5, y+1, z-3, b, ms);
		world.setBlock(x+5, y+1, z-7, b, ms);
		world.setBlock(x+5, y+2, z-0, b, ms);
		world.setBlock(x+5, y+2, z-3, b, ms);
		world.setBlock(x+5, y+2, z-7, b, ms);
		world.setBlock(x+5, y+3, z-0, b, ms);
		world.setBlock(x+5, y+3, z-3, b, ms);
		world.setBlock(x+5, y+3, z-7, b, ms);
		world.setBlock(x+5, y+4, z-0, b, ms);
		world.setBlock(x+5, y+4, z-3, b, ms);
		world.setBlock(x+5, y+4, z-7, b, ms);
		world.setBlock(x+5, y+4, z-10, b, ms);
		world.setBlock(x+5, y+5, z-1, b, ms);
		world.setBlock(x+5, y+5, z-2, b, ms);
		world.setBlock(x+5, y+5, z-3, b, ms);
		world.setBlock(x+5, y+5, z-7, b, ms);
		world.setBlock(x+5, y+5, z-8, b, ms);
		world.setBlock(x+5, y+5, z-9, b, ms);
		world.setBlock(x+5, y+6, z-3, b, ms);
		world.setBlock(x+5, y+6, z-4, b, ms);
		world.setBlock(x+5, y+6, z-5, b, ms);
		world.setBlock(x+5, y+6, z-6, b, ms);
		world.setBlock(x+5, y+6, z-7, b, ms);
		world.setBlock(x+6, y+0, z-0, b, ms);
		world.setBlock(x+6, y+0, z-1, b, ms);
		world.setBlock(x+6, y+0, z-2, b, ms);
		world.setBlock(x+6, y+0, z-3, b, ms);
		world.setBlock(x+6, y+0, z-4, b, ms);
		world.setBlock(x+6, y+0, z-5, b, ms);
		world.setBlock(x+6, y+0, z-6, b, ms);
		world.setBlock(x+6, y+0, z-7, b, ms);
		world.setBlock(x+6, y+0, z-8, b, ms);
		world.setBlock(x+6, y+0, z-9, b, ms);
		world.setBlock(x+6, y+0, z-10, b, ms);
		world.setBlock(x+6, y+1, z-0, b, ms);
		world.setBlock(x+6, y+1, z-4, b, ms);
		world.setBlock(x+6, y+1, z-5, b, ms);
		world.setBlock(x+6, y+1, z-6, b, ms);
		world.setBlock(x+6, y+1, z-10, b, ms);
		world.setBlock(x+6, y+2, z-0, b, ms);
		world.setBlock(x+6, y+2, z-4, b, ms);
		world.setBlock(x+6, y+2, z-5, b, mg);
		world.setBlock(x+6, y+2, z-6, b, ms);
		world.setBlock(x+6, y+2, z-10, b, ms);
		world.setBlock(x+6, y+3, z-0, b, ms);
		world.setBlock(x+6, y+3, z-4, b, ms);
		world.setBlock(x+6, y+3, z-5, b, ms);
		world.setBlock(x+6, y+3, z-6, b, ms);
		world.setBlock(x+6, y+3, z-10, b, ms);
		world.setBlock(x+6, y+4, z-0, b, ms);
		world.setBlock(x+6, y+4, z-4, b, ms);
		world.setBlock(x+6, y+4, z-5, b, ms);
		world.setBlock(x+6, y+4, z-6, b, ms);
		world.setBlock(x+6, y+4, z-10, b, ms);
		world.setBlock(x+6, y+5, z-1, b, ms);
		world.setBlock(x+6, y+5, z-2, b, ms);
		world.setBlock(x+6, y+5, z-8, b, ms);
		world.setBlock(x+6, y+5, z-9, b, ms);
		world.setBlock(x+6, y+6, z-3, b, ms);
		world.setBlock(x+6, y+6, z-4, b, ms);
		world.setBlock(x+6, y+6, z-5, b, ms);
		world.setBlock(x+6, y+6, z-6, b, ms);
		world.setBlock(x+6, y+6, z-7, b, ms);
		world.setBlock(x+7, y+0, z-1, b, ms);
		world.setBlock(x+7, y+0, z-2, b, ms);
		world.setBlock(x+7, y+0, z-3, b, ms);
		world.setBlock(x+7, y+0, z-4, b, ms);
		world.setBlock(x+7, y+0, z-5, b, ms);
		world.setBlock(x+7, y+0, z-6, b, ms);
		world.setBlock(x+7, y+0, z-7, b, ms);
		world.setBlock(x+7, y+0, z-8, b, ms);
		world.setBlock(x+7, y+0, z-9, b, ms);
		world.setBlock(x+7, y+1, z-1, b, ms);
		world.setBlock(x+7, y+1, z-9, b, ms);
		world.setBlock(x+7, y+2, z-1, b, ms);
		world.setBlock(x+7, y+2, z-9, b, ms);
		world.setBlock(x+7, y+3, z-1, b, ms);
		world.setBlock(x+7, y+3, z-9, b, ms);
		world.setBlock(x+7, y+4, z-1, b, ms);
		world.setBlock(x+7, y+4, z-4, b, ms);
		world.setBlock(x+7, y+4, z-5, b, ml);
		world.setBlock(x+7, y+4, z-6, b, ms);
		world.setBlock(x+7, y+4, z-9, b, ms);
		world.setBlock(x+7, y+5, z-2, b, ms);
		world.setBlock(x+7, y+5, z-8, b, ms);
		world.setBlock(x+7, y+6, z-3, b, ms);
		world.setBlock(x+7, y+6, z-4, b, ms);
		world.setBlock(x+7, y+6, z-5, b, ms);
		world.setBlock(x+7, y+6, z-6, b, ms);
		world.setBlock(x+7, y+6, z-7, b, ms);
		world.setBlock(x+8, y+0, z-2, b, ms);
		world.setBlock(x+8, y+0, z-3, b, ms);
		world.setBlock(x+8, y+0, z-4, b, ms);
		world.setBlock(x+8, y+0, z-5, b, ms);
		world.setBlock(x+8, y+0, z-6, b, ms);
		world.setBlock(x+8, y+0, z-7, b, ms);
		world.setBlock(x+8, y+0, z-8, b, ms);
		world.setBlock(x+8, y+1, z-2, b, ms);
		world.setBlock(x+8, y+1, z-3, b, ms);
		world.setBlock(x+8, y+1, z-4, b, ms);
		world.setBlock(x+8, y+1, z-5, b, ms);
		world.setBlock(x+8, y+1, z-6, b, ms);
		world.setBlock(x+8, y+1, z-7, b, ms);
		world.setBlock(x+8, y+1, z-8, b, ms);
		world.setBlock(x+8, y+2, z-2, b, ms);
		world.setBlock(x+8, y+2, z-3, b, ms);
		world.setBlock(x+8, y+2, z-4, b, ms);
		world.setBlock(x+8, y+2, z-5, b, ms);
		world.setBlock(x+8, y+2, z-6, b, ms);
		world.setBlock(x+8, y+2, z-7, b, ms);
		world.setBlock(x+8, y+2, z-8, b, ms);
		world.setBlock(x+8, y+3, z-2, b, ms);
		world.setBlock(x+8, y+3, z-3, b, ms);
		world.setBlock(x+8, y+3, z-4, b, ms);
		world.setBlock(x+8, y+3, z-5, b, ms);
		world.setBlock(x+8, y+3, z-6, b, ms);
		world.setBlock(x+8, y+3, z-7, b, ms);
		world.setBlock(x+8, y+3, z-8, b, ms);
		world.setBlock(x+8, y+4, z-2, b, ms);
		world.setBlock(x+8, y+4, z-3, b, ms);
		world.setBlock(x+8, y+4, z-4, b, ms);
		world.setBlock(x+8, y+4, z-5, b, ms);
		world.setBlock(x+8, y+4, z-6, b, ms);
		world.setBlock(x+8, y+4, z-7, b, ms);
		world.setBlock(x+8, y+4, z-8, b, ms);
		world.setBlock(x+8, y+5, z-3, b, ms);
		world.setBlock(x+8, y+5, z-4, b, ms);
		world.setBlock(x+8, y+5, z-5, b, ms);
		world.setBlock(x+8, y+5, z-6, b, ms);
		world.setBlock(x+8, y+5, z-7, b, ms);
	}

	private void generateAir(ChunkSplicedGenerationCache world, int x, int y, int z) {
		world.setBlock(x+1, y+1, z-2, Blocks.air);
		world.setBlock(x+1, y+1, z-3, Blocks.air);
		world.setBlock(x+1, y+1, z-4, Blocks.air);
		world.setBlock(x+1, y+1, z-5, Blocks.air);
		world.setBlock(x+1, y+1, z-6, Blocks.air);
		world.setBlock(x+1, y+1, z-7, Blocks.air);
		world.setBlock(x+1, y+1, z-8, Blocks.air);
		world.setBlock(x+1, y+2, z-2, Blocks.air);
		world.setBlock(x+1, y+2, z-3, Blocks.air);
		world.setBlock(x+1, y+2, z-4, Blocks.air);
		world.setBlock(x+1, y+2, z-5, Blocks.air);
		world.setBlock(x+1, y+2, z-6, Blocks.air);
		world.setBlock(x+1, y+2, z-7, Blocks.air);
		world.setBlock(x+1, y+2, z-8, Blocks.air);
		world.setBlock(x+1, y+3, z-2, Blocks.air);
		world.setBlock(x+1, y+3, z-3, Blocks.air);
		world.setBlock(x+1, y+3, z-4, Blocks.air);
		world.setBlock(x+1, y+3, z-5, Blocks.air);
		world.setBlock(x+1, y+3, z-6, Blocks.air);
		world.setBlock(x+1, y+3, z-7, Blocks.air);
		world.setBlock(x+1, y+3, z-8, Blocks.air);
		world.setBlock(x+1, y+4, z-2, Blocks.air);
		world.setBlock(x+1, y+4, z-3, Blocks.air);
		world.setBlock(x+1, y+4, z-7, Blocks.air);
		world.setBlock(x+1, y+4, z-8, Blocks.air);
		world.setBlock(x+1, y+5, z-3, Blocks.air);
		world.setBlock(x+1, y+5, z-4, Blocks.air);
		world.setBlock(x+1, y+5, z-5, Blocks.air);
		world.setBlock(x+1, y+5, z-6, Blocks.air);
		world.setBlock(x+1, y+5, z-7, Blocks.air);
		world.setBlock(x+2, y+1, z-1, Blocks.air);
		world.setBlock(x+2, y+1, z-2, Blocks.air);
		world.setBlock(x+2, y+1, z-3, Blocks.air);
		world.setBlock(x+2, y+1, z-7, Blocks.air);
		world.setBlock(x+2, y+1, z-8, Blocks.air);
		world.setBlock(x+2, y+1, z-9, Blocks.air);
		world.setBlock(x+2, y+2, z-1, Blocks.air);
		world.setBlock(x+2, y+2, z-2, Blocks.air);
		world.setBlock(x+2, y+2, z-3, Blocks.air);
		world.setBlock(x+2, y+2, z-7, Blocks.air);
		world.setBlock(x+2, y+2, z-8, Blocks.air);
		world.setBlock(x+2, y+2, z-9, Blocks.air);
		world.setBlock(x+2, y+3, z-1, Blocks.air);
		world.setBlock(x+2, y+3, z-2, Blocks.air);
		world.setBlock(x+2, y+3, z-3, Blocks.air);
		world.setBlock(x+2, y+3, z-7, Blocks.air);
		world.setBlock(x+2, y+3, z-8, Blocks.air);
		world.setBlock(x+2, y+3, z-9, Blocks.air);
		world.setBlock(x+2, y+4, z-1, Blocks.air);
		world.setBlock(x+2, y+4, z-2, Blocks.air);
		world.setBlock(x+2, y+4, z-3, Blocks.air);
		world.setBlock(x+2, y+4, z-7, Blocks.air);
		world.setBlock(x+2, y+4, z-8, Blocks.air);
		world.setBlock(x+2, y+4, z-9, Blocks.air);
		world.setBlock(x+2, y+5, z-3, Blocks.air);
		world.setBlock(x+2, y+5, z-4, Blocks.air);
		world.setBlock(x+2, y+5, z-5, Blocks.air);
		world.setBlock(x+2, y+5, z-6, Blocks.air);
		world.setBlock(x+2, y+5, z-7, Blocks.air);
		world.setBlock(x+3, y+1, z-1, Blocks.air);
		world.setBlock(x+3, y+1, z-2, Blocks.air);
		world.setBlock(x+3, y+1, z-4, Blocks.air);
		world.setBlock(x+3, y+1, z-5, Blocks.air);
		world.setBlock(x+3, y+1, z-6, Blocks.air);
		world.setBlock(x+3, y+1, z-8, Blocks.air);
		world.setBlock(x+3, y+1, z-9, Blocks.air);
		world.setBlock(x+3, y+1, z-10, Blocks.air);
		world.setBlock(x+3, y+2, z-1, Blocks.air);
		world.setBlock(x+3, y+2, z-2, Blocks.air);
		world.setBlock(x+3, y+2, z-4, Blocks.air);
		world.setBlock(x+3, y+2, z-5, Blocks.air);
		world.setBlock(x+3, y+2, z-6, Blocks.air);
		world.setBlock(x+3, y+2, z-8, Blocks.air);
		world.setBlock(x+3, y+2, z-9, Blocks.air);
		world.setBlock(x+3, y+2, z-10, Blocks.air);
		world.setBlock(x+3, y+3, z-1, Blocks.air);
		world.setBlock(x+3, y+3, z-2, Blocks.air);
		world.setBlock(x+3, y+3, z-4, Blocks.air);
		world.setBlock(x+3, y+3, z-5, Blocks.air);
		world.setBlock(x+3, y+3, z-6, Blocks.air);
		world.setBlock(x+3, y+3, z-8, Blocks.air);
		world.setBlock(x+3, y+3, z-9, Blocks.air);
		world.setBlock(x+3, y+3, z-10, Blocks.air);
		world.setBlock(x+3, y+4, z-1, Blocks.air);
		world.setBlock(x+3, y+4, z-2, Blocks.air);
		world.setBlock(x+3, y+4, z-4, Blocks.air);
		world.setBlock(x+3, y+4, z-5, Blocks.air);
		world.setBlock(x+3, y+4, z-6, Blocks.air);
		world.setBlock(x+3, y+4, z-8, Blocks.air);
		world.setBlock(x+3, y+4, z-9, Blocks.air);
		world.setBlock(x+3, y+5, z-4, Blocks.air);
		world.setBlock(x+3, y+5, z-5, Blocks.air);
		world.setBlock(x+3, y+5, z-6, Blocks.air);
		world.setBlock(x+4, y+1, z-1, Blocks.air);
		world.setBlock(x+4, y+1, z-2, Blocks.air);
		world.setBlock(x+4, y+1, z-4, Blocks.air);
		world.setBlock(x+4, y+1, z-5, Blocks.air);
		world.setBlock(x+4, y+1, z-6, Blocks.air);
		world.setBlock(x+4, y+1, z-8, Blocks.air);
		world.setBlock(x+4, y+1, z-9, Blocks.air);
		world.setBlock(x+4, y+1, z-10, Blocks.air);
		world.setBlock(x+4, y+2, z-1, Blocks.air);
		world.setBlock(x+4, y+2, z-2, Blocks.air);
		world.setBlock(x+4, y+2, z-4, Blocks.air);
		world.setBlock(x+4, y+2, z-6, Blocks.air);
		world.setBlock(x+4, y+2, z-8, Blocks.air);
		world.setBlock(x+4, y+2, z-9, Blocks.air);
		world.setBlock(x+4, y+2, z-10, Blocks.air);
		world.setBlock(x+4, y+3, z-1, Blocks.air);
		world.setBlock(x+4, y+3, z-2, Blocks.air);
		world.setBlock(x+4, y+3, z-4, Blocks.air);
		world.setBlock(x+4, y+3, z-5, Blocks.air);
		world.setBlock(x+4, y+3, z-6, Blocks.air);
		world.setBlock(x+4, y+3, z-8, Blocks.air);
		world.setBlock(x+4, y+3, z-9, Blocks.air);
		world.setBlock(x+4, y+3, z-10, Blocks.air);
		world.setBlock(x+4, y+4, z-4, Blocks.air);
		world.setBlock(x+4, y+4, z-5, Blocks.air);
		world.setBlock(x+4, y+4, z-6, Blocks.air);
		world.setBlock(x+4, y+4, z-8, Blocks.air);
		world.setBlock(x+4, y+4, z-9, Blocks.air);
		world.setBlock(x+4, y+5, z-4, Blocks.air);
		world.setBlock(x+4, y+5, z-5, Blocks.air);
		world.setBlock(x+4, y+5, z-6, Blocks.air);
		world.setBlock(x+5, y+1, z-1, Blocks.air);
		world.setBlock(x+5, y+1, z-2, Blocks.air);
		world.setBlock(x+5, y+1, z-4, Blocks.air);
		world.setBlock(x+5, y+1, z-5, Blocks.air);
		world.setBlock(x+5, y+1, z-6, Blocks.air);
		world.setBlock(x+5, y+1, z-8, Blocks.air);
		world.setBlock(x+5, y+1, z-9, Blocks.air);
		world.setBlock(x+5, y+1, z-10, Blocks.air);
		world.setBlock(x+5, y+2, z-1, Blocks.air);
		world.setBlock(x+5, y+2, z-2, Blocks.air);
		world.setBlock(x+5, y+2, z-4, Blocks.air);
		world.setBlock(x+5, y+2, z-5, Blocks.air);
		world.setBlock(x+5, y+2, z-6, Blocks.air);
		world.setBlock(x+5, y+2, z-8, Blocks.air);
		world.setBlock(x+5, y+2, z-9, Blocks.air);
		world.setBlock(x+5, y+2, z-10, Blocks.air);
		world.setBlock(x+5, y+3, z-1, Blocks.air);
		world.setBlock(x+5, y+3, z-2, Blocks.air);
		world.setBlock(x+5, y+3, z-4, Blocks.air);
		world.setBlock(x+5, y+3, z-5, Blocks.air);
		world.setBlock(x+5, y+3, z-6, Blocks.air);
		world.setBlock(x+5, y+3, z-8, Blocks.air);
		world.setBlock(x+5, y+3, z-9, Blocks.air);
		world.setBlock(x+5, y+3, z-10, Blocks.air);
		world.setBlock(x+5, y+4, z-1, Blocks.air);
		world.setBlock(x+5, y+4, z-2, Blocks.air);
		world.setBlock(x+5, y+4, z-4, Blocks.air);
		world.setBlock(x+5, y+4, z-5, Blocks.air);
		world.setBlock(x+5, y+4, z-6, Blocks.air);
		world.setBlock(x+5, y+4, z-8, Blocks.air);
		world.setBlock(x+5, y+4, z-9, Blocks.air);
		world.setBlock(x+5, y+5, z-4, Blocks.air);
		world.setBlock(x+5, y+5, z-5, Blocks.air);
		world.setBlock(x+5, y+5, z-6, Blocks.air);
		world.setBlock(x+6, y+1, z-1, Blocks.air);
		world.setBlock(x+6, y+1, z-2, Blocks.air);
		world.setBlock(x+6, y+1, z-3, Blocks.air);
		world.setBlock(x+6, y+1, z-7, Blocks.air);
		world.setBlock(x+6, y+1, z-8, Blocks.air);
		world.setBlock(x+6, y+1, z-9, Blocks.air);
		world.setBlock(x+6, y+2, z-1, Blocks.air);
		world.setBlock(x+6, y+2, z-2, Blocks.air);
		world.setBlock(x+6, y+2, z-3, Blocks.air);
		world.setBlock(x+6, y+2, z-7, Blocks.air);
		world.setBlock(x+6, y+2, z-8, Blocks.air);
		world.setBlock(x+6, y+2, z-9, Blocks.air);
		world.setBlock(x+6, y+3, z-1, Blocks.air);
		world.setBlock(x+6, y+3, z-2, Blocks.air);
		world.setBlock(x+6, y+3, z-3, Blocks.air);
		world.setBlock(x+6, y+3, z-7, Blocks.air);
		world.setBlock(x+6, y+3, z-8, Blocks.air);
		world.setBlock(x+6, y+3, z-9, Blocks.air);
		world.setBlock(x+6, y+4, z-1, Blocks.air);
		world.setBlock(x+6, y+4, z-2, Blocks.air);
		world.setBlock(x+6, y+4, z-3, Blocks.air);
		world.setBlock(x+6, y+4, z-7, Blocks.air);
		world.setBlock(x+6, y+4, z-8, Blocks.air);
		world.setBlock(x+6, y+4, z-9, Blocks.air);
		world.setBlock(x+6, y+5, z-3, Blocks.air);
		world.setBlock(x+6, y+5, z-4, Blocks.air);
		world.setBlock(x+6, y+5, z-5, Blocks.air);
		world.setBlock(x+6, y+5, z-6, Blocks.air);
		world.setBlock(x+6, y+5, z-7, Blocks.air);
		world.setBlock(x+7, y+1, z-2, Blocks.air);
		world.setBlock(x+7, y+1, z-3, Blocks.air);
		world.setBlock(x+7, y+1, z-4, Blocks.air);
		world.setBlock(x+7, y+1, z-5, Blocks.air);
		world.setBlock(x+7, y+1, z-6, Blocks.air);
		world.setBlock(x+7, y+1, z-7, Blocks.air);
		world.setBlock(x+7, y+1, z-8, Blocks.air);
		world.setBlock(x+7, y+2, z-2, Blocks.air);
		world.setBlock(x+7, y+2, z-3, Blocks.air);
		world.setBlock(x+7, y+2, z-4, Blocks.air);
		world.setBlock(x+7, y+2, z-5, Blocks.air);
		world.setBlock(x+7, y+2, z-6, Blocks.air);
		world.setBlock(x+7, y+2, z-7, Blocks.air);
		world.setBlock(x+7, y+2, z-8, Blocks.air);
		world.setBlock(x+7, y+3, z-2, Blocks.air);
		world.setBlock(x+7, y+3, z-3, Blocks.air);
		world.setBlock(x+7, y+3, z-4, Blocks.air);
		world.setBlock(x+7, y+3, z-5, Blocks.air);
		world.setBlock(x+7, y+3, z-6, Blocks.air);
		world.setBlock(x+7, y+3, z-7, Blocks.air);
		world.setBlock(x+7, y+3, z-8, Blocks.air);
		world.setBlock(x+7, y+4, z-2, Blocks.air);
		world.setBlock(x+7, y+4, z-3, Blocks.air);
		world.setBlock(x+7, y+4, z-7, Blocks.air);
		world.setBlock(x+7, y+4, z-8, Blocks.air);
		world.setBlock(x+7, y+5, z-3, Blocks.air);
		world.setBlock(x+7, y+5, z-4, Blocks.air);
		world.setBlock(x+7, y+5, z-5, Blocks.air);
		world.setBlock(x+7, y+5, z-6, Blocks.air);
		world.setBlock(x+7, y+5, z-7, Blocks.air);
	}

}