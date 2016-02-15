package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import net.ccgames.rl.entity.Entity;
import net.ccgames.rl.entity.EntityPlayer;
import net.ccgames.rl.factories.EntityFactory;
import net.ccgames.rl.refs.Refs;
import net.ccgames.rl.world.World;
import net.ccgames.rl.world.WorldBuilder;
import asciiPanel.AsciiPanel;

public class ScreenPlay implements Screen
{
	private World toDisplay;
	Entity player;
	static List<Entity> entities = new ArrayList<Entity>();
	EntityFactory factory;
	
	/**
	 * Constructor where the world is built and generated.
	 * Temporarily generates the player
	 */
	public ScreenPlay()
	{
		WorldBuilder builder = new WorldBuilder(Refs.INIT_WORLD_WIDTH, Refs.INIT_WORLD_HEIGHT);
		toDisplay = builder.randomizeTiles().addRandomTrees(10).build();
		
		player = new EntityPlayer(10, 10, toDisplay);
		factory = new EntityFactory(toDisplay);
		
		generateAllEntities();
	}
	
	public void generateAllEntities()
	{
		factory.spawnWolves(1);
	}
	
	public static void addEntityToList(Entity e)
	{
		entities.add(e);
	}
	
	public static List<Entity> getEntitiesList()
	{
		return entities;
	}
	
	/**
	 * Calls all other display methods and passes terminal reference
	 */
	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		displayWorld(terminal);
		updateAndDisplayEntities(terminal);
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
	 * @param terminal - Needed to be able to draw
	 */
	private void updateAndDisplayEntities(AsciiPanel terminal)
	{
		terminal.write(player.getEntityGlyph(), player.getEntityXPosition(), player.getEntityYPosition(), player.getEntityColor());
		for(Entity e : entities)
		{
//			e.updateAI();
			terminal.write(e.getEntityGlyph(), e.getEntityXPosition(), e.getEntityYPosition(), e.getEntityColor());
		}
	}

	@Override
	public Screen respondToUserInput(KeyEvent event)
	{
		switch(event.getKeyCode())
		{
		case KeyEvent.VK_W:
		case KeyEvent.VK_NUMPAD8:
		case KeyEvent.VK_UP:
			player.move(0, -1);
			return this;
		case KeyEvent.VK_S:
		case KeyEvent.VK_NUMPAD2:
		case KeyEvent.VK_DOWN:
			player.move(0, 1);
			return this;
		case KeyEvent.VK_A:
		case KeyEvent.VK_NUMPAD4:
		case KeyEvent.VK_LEFT:
			player.move(-1, 0);
			return this;
		case KeyEvent.VK_D:
		case KeyEvent.VK_NUMPAD6:
		case KeyEvent.VK_RIGHT:
			player.move(1, 0);
			return this;
		case KeyEvent.VK_NUMPAD1:
		case KeyEvent.VK_Z:
			player.move(-1, 1);
			return this;
		case KeyEvent.VK_NUMPAD3:
		case KeyEvent.VK_C:
			player.move(1, 1);
			return this;
		case KeyEvent.VK_NUMPAD7:
		case KeyEvent.VK_Q:
			player.move(-1, -1);
			return this;
		case KeyEvent.VK_NUMPAD9:
		case KeyEvent.VK_E:
			player.move(1, -1);
			return this;
		case KeyEvent.VK_NUMPAD5:
		case KeyEvent.VK_X:
			return this;
		case KeyEvent.VK_P: //DEBUG
			if(java.lang.management.ManagementFactory.
			getRuntimeMXBean().getInputArguments().toString().
			indexOf("jdwp") >= 0)
				System.exit(0);
			else
				return this;
		default:
			return this;
		}
	}

}
