package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenPlay implements Screen
{

	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		
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
