package net.ccgames.rl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;
import net.ccgames.rl.screen.Screen;
import net.ccgames.rl.screen.ScreenAlpha;

public class MainApplication extends JFrame implements KeyListener
{
	private static final long serialVersionUID = 1L;

	private AsciiPanel terminal;
	private Screen screen;
	
	public MainApplication()
	{
		super();
		terminal = new AsciiPanel(120, 50);
		add(terminal);
		pack();
		screen = new ScreenAlpha();
		addKeyListener(this);
		repaint();
	}
	
	public void repaint()
	{
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}
	
	public static void main(String args[])
	{
		MainApplication application = new MainApplication();
		application.setLocationRelativeTo(null);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent event)
	{
		screen = screen.respondToUserInput(event);
		repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent arg0){}
	@Override
	public void keyTyped(KeyEvent arg0){}
}
