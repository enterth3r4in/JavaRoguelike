package net.ccgames.rl.factories;

import java.util.Random;

import net.ccgames.rl.ai.EntityAI;
import net.ccgames.rl.entity.Entity;
import net.ccgames.rl.entity.EntityWolf;
import net.ccgames.rl.refs.Colors;
import net.ccgames.rl.refs.Refs;
import net.ccgames.rl.screen.ScreenPlay;
import net.ccgames.rl.world.World;

public class EntityFactory
{
	private World world;
	
	public EntityFactory(World world)
	{
		this.world = world;
	}
	
	public void spawnWolves(int wolvesToSpawn)
	{
		for(int i = 0; i < wolvesToSpawn; i++)
		{
			Random random = new Random(System.nanoTime());
			int spawnX = random.nextInt(Refs.INIT_WORLD_WIDTH);
			int spawnY = random.nextInt(Refs.INIT_WORLD_HEIGHT);
			Entity wolf = new EntityWolf(spawnX, spawnY, Refs.WOLF_GLYPH, Colors.WOLF, "WOLF", world);
			ScreenPlay.addEntityToList(wolf);
			wolf.addAI(new EntityAI());
		}
	}
}
