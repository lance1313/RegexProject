package ctec.view;

import javax.swing.*;

import ctec.controller.RegexController;

public class RegexFrame extends JFrame
{
	private RegexController baseController = new RegexController();
	public RegexPanel basePanel = new RegexPanel(baseController);
	
	public RegexFrame()
	{
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("Regex");
		this.setVisible(true);
	}

}
