package ctec.controller;

import javax.swing.JOptionPane;

import ctec.model.Regex;
import ctec.view.RegexFrame;
import ctec.view.RegexPanel;

public class RegexController 
{
	public RegexFrame baseFrame = new RegexFrame();
	public RegexPanel basePanel = new RegexPanel(this);
	private Regex model = new Regex();
	public String Finput;
	public String Linput;
	public int phoneinput;
	public String emailinput;
	

	public RegexController()
	{
		
	}
	public void start() 
	{
		baseFrame.setupFrame();
		
		
	}
	
	public void regex()
	{
		
		model.Expressions(Finput, Linput, phoneinput, emailinput);
	}

}
