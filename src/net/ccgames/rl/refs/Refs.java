package net.ccgames.rl.refs;

import java.util.Random;

public class Refs
{
	public static int randomNumberInRange(int min, int max)
	{
		Random random = new Random(System.currentTimeMillis());
		return random.nextInt((max - min) + 1) + min;
	}
	
	public static final char PLAYER_GLYPH = (char)64;
	public static final char WOLF_GLYPH = (char)119;
	
	public static final int SCREEN_WIDTH = 120;
	public static final int SCREEN_HEIGHT = 50;
	public static final int INIT_WORLD_WIDTH = 80;
	public static final int INIT_WORLD_HEIGHT = 30;
}
