package net.ccgames.rl;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;

public class MainApplication extends JFrame
{
	private static final long serialVersionUID = 1L;

	private AsciiPanel terminal;
	
	public MainApplication()
	{
		super();
		terminal = new AsciiPanel(120, 50);
		
		add(terminal);
		pack();
	}
	
	public static void main(String args[])
	{
		MainApplication application = new MainApplication();
		application.setLocationRelativeTo(null);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setVisible(true);
	}
}
