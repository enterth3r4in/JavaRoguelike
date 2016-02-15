package net.ccgames.rl.entity;

import java.awt.Color;

import net.ccgames.rl.world.World;

public class EntityWolf extends Entity
{
	/**
	 * Constructor to define wolf properties
	 * @param initialX - initial x position
	 * @param initialY - initial y position
	 * @param glyph - wolf glyph
	 * @param color - wolf color
	 * @param internalName - name to use for debugging
	 * @param world - gotten elsewhere
	 */
	public EntityWolf(int initialX, int initialY, char glyph, Color color, String internalName, World world)
	{
		super(initialX, initialY, glyph, color, true, internalName, world);
	}

}
