package net.ccgames.rl.entity;

import java.awt.Color;

public class Entity
{
	private int x, y;
	private char glyph;
	private Color color;
	
	/**
	 * Default constructor
	 */
	public Entity()
	{
		
	}
	
	/**
	 * Constructor initialization of x,y,glyph
	 * @param initialX - Starting x position of entity, can be modified
	 * @param initialY - Starting y position of entity, can be modified
	 * @param glyph - semi-permanent glyph of entity
	 * @param color - color used to display the glyph
	 */
	public Entity(int initialX, int initialY, char glyph, Color color)
	{
		this.x = initialX;
		this.y = initialY;
		this.glyph = glyph;
		this.color = color;
	}
	
	/**
	 * Returns a coordinate system of (x, y)
	 * @return - Coordinate system as an array of ints (x, y)
	 */
	public int[] getEntityPosition()
	{
		int[] position = {x, y};
		return position;
	}
	
	/**
	 * Using getEntityPosition() returns x coordinate
	 * @return - single int representing x coordinate
	 */
	public int getEntityXPosition()
	{
		return getEntityPosition()[0];
	}
	
	/**
	 * Using getEntityPosition() returns y coordinate
	 * @return - single int representing y coordinate
	 */
	public int getEntityYPosition()
	{
		return getEntityPosition()[1];
	}
	
	/**
	 * Returns character representing the glyph used to represent the entity
	 * @return - single char representing entity glyph
	 */
	public char getEntityGlyph()
	{
		return glyph;
	}
	
	public Color getEntityColor()
	{
		return color;
	}
}
