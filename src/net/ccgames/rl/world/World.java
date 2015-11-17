package net.ccgames.rl.world;

import java.awt.Color;

import net.ccgames.rl.tiles.Tile;

public class World
{
	private Tile[][] tiles;
	private int width;
	private int height;
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public World(Tile[][] tiles)
	{
		this.tiles = tiles;
		this.width = tiles.length;
		this.height = tiles[0].length;
	}
	
	public Tile getTileAtCoordinates(int x, int y)
	{
		if(x < 0 || x >= width || y < 0 || y >= height)
			return Tile.BOUNDS;
		else
			return tiles[x][y];
	}
	
	public char getGlyphAtLoc(int x, int y)
	{
		return getTileAtCoordinates(x, y).getGlyph();
	}
	
	public Color getColorAtLoc(int x, int y)
	{
		return getTileAtCoordinates(x, y).getColor();
	}
	
	public boolean doesBlockAtLoc(int x, int y)
	{
		return getTileAtCoordinates(x, y).blocks();
	}
}
