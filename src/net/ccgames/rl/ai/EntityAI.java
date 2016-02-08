package net.ccgames.rl.ai;

import net.ccgames.rl.entity.Entity;
import net.ccgames.rl.entity.EntityWolf;


public class EntityAI
{
	public void wander(Entity e)
	{
		if(Math.random() < 1)
		{
			int x, y;
			if(Math.random() < 0.5)
			{
				x = (int)(Math.random());
				y = (int)(Math.random());
				e.move(x, y);
			}else{
				x = -(int)(Math.random());
				y = -(int)(Math.random());
				e.move(x, y);
			}
		}
	}
	
	public void update(Entity e)
	{
		if(e instanceof EntityWolf)
			wander(e);
	}
}
