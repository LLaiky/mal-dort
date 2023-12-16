
package net.mcreator.maldort.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class TrophyNJBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public TrophyNJBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> 4).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("This trophy resembles a stick but also looks like a special thing."));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(2, 0, 2, 14, 0.4, 14), box(3.1, 0, 4, 12.9, 1.6, 12), box(2.6, 0, 3, 13.3, 1, 13), box(4.9, -1, 11.3, 11, 0, 14), box(7, 1, 7, 8, 10, 8), box(3, 5, 8, 12, 6, 9));
			case NORTH -> Shapes.or(box(2, 0, 2, 14, 0.4, 14), box(3.1, 0, 4, 12.9, 1.6, 12), box(2.7, 0, 3, 13.4, 1, 13), box(5, -1, 2, 11.1, 0, 4.7), box(8, 1, 8, 9, 10, 9), box(4, 5, 7, 13, 6, 8));
			case EAST -> Shapes.or(box(2, 0, 2, 14, 0.4, 14), box(4, 0, 3.1, 12, 1.6, 12.9), box(3, 0, 2.7, 13, 1, 13.4), box(11.3, -1, 5, 14, 0, 11.1), box(7, 1, 8, 8, 10, 9), box(8, 5, 4, 9, 6, 13));
			case WEST -> Shapes.or(box(2, 0, 2, 14, 0.4, 14), box(4, 0, 3.1, 12, 1.6, 12.9), box(3, 0, 2.6, 13, 1, 13.3), box(2, -1, 4.9, 4.7, 0, 11), box(8, 1, 7, 9, 10, 8), box(7, 5, 3, 8, 6, 12));
			case UP -> Shapes.or(box(2, 2, 0, 14, 14, 0.4), box(3.1, 4, 0, 12.9, 12, 1.6), box(2.7, 3, 0, 13.4, 13, 1), box(5, 11.3, -1, 11.1, 14, 0), box(8, 7, 1, 9, 8, 10), box(4, 8, 5, 13, 9, 6));
			case DOWN -> Shapes.or(box(2, 2, 15.6, 14, 14, 16), box(3.1, 4, 14.4, 12.9, 12, 16), box(2.7, 3, 15, 13.4, 13, 16), box(5, 2, 16, 11.1, 4.7, 17), box(8, 8, 6, 9, 9, 15), box(4, 7, 10, 13, 8, 11));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
