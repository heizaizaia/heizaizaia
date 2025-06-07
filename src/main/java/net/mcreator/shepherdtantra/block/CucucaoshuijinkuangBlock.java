
package net.mcreator.shepherdtantra.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class CucucaoshuijinkuangBlock extends Block {
	public CucucaoshuijinkuangBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANCIENT_DEBRIS).strength(3f, 100f).requiresCorrectToolForDrops().speedFactor(0.9f).jumpFactor(1.1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
