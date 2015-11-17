package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenConfirmExit implements Screen
{
	private Screen previousScreen;

	public ScreenConfirmExit(Screen previousScreen)
	{
		this.previousScreen = previousScreen;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		terminal.write("Are you sure you wish to exit?", 15, 15);
		terminal.write("Y - Yes, Exit program.", 11, 30);
		terminal.write("N - No, my mistake!", 11, 33);
	}

	@Override
	public Screen respondToUserInput(KeyEvent event)
	{
		switch(event.getKeyCode())
		{
		case KeyEvent.VK_Y:
			System.exit(0);
		case KeyEvent.VK_N:
			return previousScreen;
		default:
			return this;
		}
	}

}
