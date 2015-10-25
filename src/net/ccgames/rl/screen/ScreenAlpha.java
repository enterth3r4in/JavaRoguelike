package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenAlpha implements Screen
{

	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		terminal.writeCenter("This is an alpha game.", 2);
		terminal.writeCenter("Along with that goes all the warnings of you potentially losing", 8);
		terminal.writeCenter("all your save data and the game ruining your whole life because", 10);
		terminal.writeCenter("of that lost save data. That won't happen. But it might. Beware.", 12);
		
		terminal.writeCenter("But really, it is in fact in alpha. There will be bugs.", 18);
		terminal.writeCenter("Feel free to email me about them at believe.the.rain@gmail.com", 20);
		
		terminal.writeCenter("Keys you must press to navigate menus will be in [ ] brackets.", 26);
		terminal.writeCenter("This includes letters. Example: [ENTER], [G], [UP]", 28);
		
		terminal.writeCenter("Now, if you are willing to accept these warnings, press [ENTER]", 38);
		terminal.writeCenter("If you don't want to continue, press [ESCAPE]", 40);
	}

	@Override
	public Screen respondToUserInput(KeyEvent event)
	{
		switch(event.getKeyCode())
		{
		case KeyEvent.VK_ENTER:
			return new ScreenMainMenu();
		case KeyEvent.VK_ESCAPE:
			System.exit(0);
		default:
			return this;
		}
	}

}
