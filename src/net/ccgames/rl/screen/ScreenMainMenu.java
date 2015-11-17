package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenMainMenu implements Screen
{

	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		terminal.write("Title", 5, 4);
		terminal.write("Subtitle", 9, 8);
		terminal.write("PhrasePhrasePhrase", 13, 12);
		
		terminal.write("New Game", 15, 30);
		terminal.write("Load Game", 15, 33);
		terminal.write("Options", 15, 36);
		terminal.write("Credits", 15, 39);
		terminal.write("Exit Game", 15, 42);
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent event)
	{
		switch(event.getKeyCode())
		{
		case KeyEvent.VK_R:
			return this;
		default:
			return this;
		}
	}

}
