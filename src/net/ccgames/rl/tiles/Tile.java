package net.ccgames.rl.tiles;

import java.awt.Color;

import net.ccgames.rl.refs.Colors;

public class Tile
{
	private int x, y;
	private char glyph;
	private Color color;
	private boolean doesBlock;
	
	public Tile(char glyph, Color color, boolean doesBlock)
	{
		this.glyph = glyph;
		this.color = color;
		this.doesBlock = doesBlock;
	}
	
	public char getGlyph()
	{
		return glyph;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public boolean blocks()
	{
		return doesBlock;
	}
	
	public static final Tile GRASS = new Tile('.', Colors.GRASS, false);
	public static final Tile TREE = new Tile('^', Colors.TREE, true);
	public static final Tile BOUNDS = new Tile('X', Color.BLACK, true);
}
