package net.ccgames.rl;

import java.applet.Applet;

import asciiPanel.AsciiPanel;

public class MainApplet extends Applet
{
	private static final long serialVersionUID = 1L;
	private AsciiPanel terminal;
	
	public MainApplet()
	{
		super();
		terminal = new AsciiPanel();
		add(terminal);
	}
	
	public void init()
	{
		super.init();
		this.setSize(terminal.getWidth() + 20, terminal.getHeight() + 20);
	}
	
	public void repaint()
	{
		super.repaint();
		terminal.repaint();
	}
}
