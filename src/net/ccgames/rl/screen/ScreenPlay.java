package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import net.ccgames.rl.world.World;
import net.ccgames.rl.world.WorldBuilder;
import asciiPanel.AsciiPanel;

public class ScreenPlay implements Screen
{
	private World toDisplay;
	
	public ScreenPlay()
	{
		WorldBuilder builder = new WorldBuilder(50, 50);
		toDisplay = builder.randomizeTiles().addRandomTrees(100).build();
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		displayWorld(terminal);
//		displayEntities();
	}
	
	private void displayWorld(AsciiPanel terminal)
	{
		for(int x = 0; x < toDisplay.getWidth(); x++)
		{
			for(int y = 0; y < toDisplay.getHeight(); y++)
			{
				terminal.write(toDisplay.getTileAtCoordinates(x, y).getGlyph(), x, y);
			}
		}
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
