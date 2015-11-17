package net.ccgames.rl.tiles;

import java.awt.Color;

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
	
	public static final Tile tileGrass = new Tile('.', Color.GREEN, false);
}
