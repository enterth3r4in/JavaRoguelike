package net.ccgames.rl.entity;

public class Entity
{
	private int x, y;
	private char glyph;
	
	public Entity()
	{
		
	}
	
	public Entity(int initialX, int initialY, char glyph)
	{
		this.x = initialX;
		this.y = initialY;
		this.glyph = glyph;
	}
	
	public int[] getEntityPosition()
	{
		int[] position = {x, y};
		return position;
	}
	
	public int getEntityXPosition()
	{
		return getEntityPosition()[0];
	}
	
	public int getEntityYPosition()
	{
		return getEntityPosition()[1];
	}
	
	public char getEntityGlyph()
	{
		return glyph;
	}
}
