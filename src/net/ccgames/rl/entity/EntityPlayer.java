package net.ccgames.rl.entity;

import net.ccgames.rl.refs.Colors;
import net.ccgames.rl.refs.Refs;

public class EntityPlayer extends Entity
{
	int health;
	int attack;
	int armor;
	
	/**
	 * Initialize the player with a given initial x and y and the constant glyph and color
	 * @param initialX
	 * @param initialY
	 */
	public EntityPlayer(int initialX, int initialY)
	{
		super(initialX, initialY, Refs.PLAYER_GLYPH, Colors.PLAYER);
	}
}
