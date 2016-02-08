package net.ccgames.rl.entity;

import java.awt.Color;

import net.ccgames.rl.ai.EntityAI;
import net.ccgames.rl.refs.Refs;
import net.ccgames.rl.world.World;

/**
 * Generic start for all entities
 * @author Cody Miller
 *
 */
public class Entity
{
	private int x, y;
	private char glyph;
	private Color color;
	private String internalName;
	private World world;
	private EntityAI ai;
	
	/**
	 * Constructor initialization of x,y,glyph
	 * @param initialX - Starting x position of entity, can be modified
	 * @param initialY - Starting y position of entity, can be modified
	 * @param glyph - semi-permanent glyph of entity
	 * @param color - color used to display the glyph
	 */
	public Entity(int initialX, int initialY, char glyph, Color color, String internalName, World world)
	{
		this.x = initialX;
		this.y = initialY;
		this.glyph = glyph;
		this.color = color;
		this.internalName = internalName;
		this.world = world;
	}
	
	public void addAI(EntityAI ai)
	{
		this.ai = ai;
	}
	
	public void updateAI()
	{
		ai.update(this);
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
	 * Allows entities to move (used in AI)
	 * @param dx - delta X (change in distance x)
	 * @param dy - delta Y (change in distance y)
	 * @param world - Access to the world for tile checking
	 */
	public void move(int dx, int dy)
	{
		if(this.getEntityXPosition() + dx < 0 || this.getEntityXPosition() + dx > Refs.INIT_WORLD_WIDTH -1 ||
				this.getEntityYPosition() + dy < 0 || this.getEntityYPosition() + dy > Refs.INIT_WORLD_HEIGHT -1)
		{
			System.out.println(this.getEntityInternalName() + " TRIED EXITING BOUNDS");
		}else if(!(world.getTileAtCoordinates(x + dx, y + dy).blocks()))
		{
			this.x += dx;
			this.y += dy;
		}
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
	
	/**
	 * Returns the color (r, g, b) of the entity
	 * @return - r,g,b representing the color to display entity in
	 */
	public Color getEntityColor()
	{
		return color;
	}
	
	/**
	 * Returns the internal name declared, only for debugging use.
	 * @return - String representing the internal name used for debugging
	 */
	public String getEntityInternalName()
	{
		return internalName;
	}
}
