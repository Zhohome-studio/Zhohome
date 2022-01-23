package org.supermommy.zhohome.procedures;

import org.supermommy.zhohome.world.dimension.Zhohome1Dimension;
import org.supermommy.zhohome.ZhohomeMod;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

public class JinruProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ZhohomeMod.LOGGER.warn("Failed to load dependency world for procedure Jinru!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ZhohomeMod.LOGGER.warn("Failed to load dependency entity for procedure Jinru!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ()))))
				.getBlock() == Blocks.NETHER_PORTAL) {
			if (world instanceof World)
				Zhohome1Dimension.portal.portalSpawn((World) world,
						new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())));
		}
	}
}
