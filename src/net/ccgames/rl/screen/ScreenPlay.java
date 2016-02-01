package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import net.ccgames.rl.entity.Entity;
import net.ccgames.rl.entity.EntityPlayer;
import net.ccgames.rl.world.World;
import net.ccgames.rl.world.WorldBuilder;
import asciiPanel.AsciiPanel;

public class ScreenPlay implements Screen
{
	private World toDisplay;
	
	/**
	 * Constructor where the world is built and generated.
	 * Temporarily generates the player
	 */
	public ScreenPlay()
	{
		WorldBuilder builder = new WorldBuilder(80, 30);
		toDisplay = builder.randomizeTiles().addRandomTrees(10).build();
		Entity player = new EntityPlayer(10, 10);
	}
	
	/**
	 * Calls all other display methods and passes terminal reference
	 */
	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		displayWorld(terminal);
		displayEntities();
	}
	
	/**
	 * Cycles through the world and displays the tiles
	 * @param terminal - Needed to be able to draw
	 */
	private void displayWorld(AsciiPanel terminal)
	{
		for(int x = 0; x < toDisplay.getWidth(); x++)
		{
			for(int y = 0; y < toDisplay.getHeight(); y++)
			{
				terminal.write(toDisplay.getTileAtCoordinates(x, y).getGlyph(), x, y, toDisplay.getTileAtCoordinates(x, y).getColor());
			}
		}
	}
	
	/**
	 * Displays all entities in the world
	 * Displays the player separately
	 */
	private void displayEntities()
	{
		terminal.write(player.
	}

	@Override
	public Screen respondToUserInput(KeyEvent event)
	{
		switch(event.getKeyCode())
		{
		
		default:
			return this;
		}
	}

}
