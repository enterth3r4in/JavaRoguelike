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
		
		terminal.write("N - New Game", 11, 30);
		terminal.write("L - Load Game", 11, 33);
		terminal.write("O - Options", 11, 36);
		terminal.write("C - Credits", 11, 39);
		terminal.write("E - Exit Game", 11, 42);
		terminal.write("P - Debug to play mode", 90, 49);
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent event)
	{
		switch(event.getKeyCode())
		{
		case KeyEvent.VK_P:
			return new ScreenPlay();
//		case KeyEvent.VK_N:
//			return new ScreenNewGame();
//		case KeyEvent.VK_L:
//			return new ScreenLoadGame();
//		case KeyEvent.VK_O:
//			return new ScreenOptions();
//		case KeyEvent.VK_C:
//			return new ScreenCredits();
		case KeyEvent.VK_E:
			return new ScreenConfirmExit(this);
		default:
			return this;
		}
	}

}
