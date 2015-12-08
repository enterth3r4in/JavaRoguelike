package net.ccgames.rl.world;

import java.util.Random;

import net.ccgames.rl.tiles.Tile;

public class WorldBuilder
{
	private Tile[][] tiles;
	
	/**
	 * Constructor to create new local tiles
	 * @param width - Width of map
	 * @param height - Height of map
	 */
	public WorldBuilder(int width, int height)
	{
		this.tiles = new Tile[width][height];
	}
	
	/**
	 * Returns a World, using the local tiles to fulfil World.Constructor
	 * @return - New instance of the world
	 */
	public World build()
	{
		return new World(tiles);
	}
	
	/**
	 * Randomizes tiles between Dirt and Grass for variety.
	 * @return - Self returning to chain method calls
	 */
	public WorldBuilder randomizeTiles()
	{
		for(int x = 0; x < tiles.length; x++)
		{
			for(int y = 0; y < tiles[0].length; y++)
			{
				if(Math.random() < 0.5)
					tiles[x][y] = Tile.GRASS;
				else
					tiles[x][y] = Tile.DIRT;
			}
		}
		return this;
	}
	
	/**
	 * Generates a random x and y and uses those as test coordinates to try to add a 
	 * tree if tile is plantable (doesn't block).
	 * @param trees - Number of trees to be generated
	 * @return - Self-returning to chain method calls
	 */
	public WorldBuilder addRandomTrees(int trees)
	{
		Tile[][] tiles2 = tiles;
		int currentTreeCount = 0;
		
		while(currentTreeCount <= trees)
		{
			//reassign tiles2 to tiles to update changes of trees
			tiles2 = tiles;
			
			int x = (int) (Math.random() * tiles2.length);
			int y = (int) (Math.random() * tiles2[0].length);
			if(tiles2[x][y] == Tile.DIRT || tiles2[x][y] == Tile.GRASS)
			{
				tiles2[x][y] = Tile.TREE;
				currentTreeCount++;
			}
			else
			{
				System.out.println("Duplicate tree!");
				continue;
			}
			
			tiles = tiles2;
		}
		return this;
	}
}
