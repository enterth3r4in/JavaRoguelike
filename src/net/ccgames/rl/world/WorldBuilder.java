package net.ccgames.rl.world;

import net.ccgames.rl.tiles.Tile;

public class WorldBuilder
{
	private Tile[][] tiles;
	
	public WorldBuilder(int width, int height)
	{
		this.tiles = new Tile[width][height];
	}
	
	public World build()
	{
		return new World(tiles);
	}
	
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
	
	public WorldBuilder addRandomTrees(int trees)
	{
		Tile[][] tiles2 = tiles;
		int currentTreeCount = 0;
		
		while(currentTreeCount <= trees)
		{
			for(int x = 0; x < tiles2.length; x++)
			{
				for(int y = 0; y < tiles2[0].length; y++)
				{
					if(Math.random() < 0.2)
					{
						tiles2[x][y] = Tile.TREE;
					}
				}
			}
//			tiles = tiles2;
		}
		tiles = tiles2;
		return this;
	}
}
