package ctec.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ctec.controller.RegexController;
import ctec.model.Regex;

public class RegexPanel extends JPanel
{
	private JTextField inputField;
	private JButton checkFNameButton;
	private JButton checkLNameButton;
	private JButton checkPhoneButton;
	private JButton checkEmailButton;
	private JTextArea outputArea;
	private SpringLayout baseLayout;
	
	private RegexController baseController = new RegexController();
	public RegexPanel(RegexController baseController)
	{
		
		inputField = new JTextField(10);
		checkPhoneButton = new JButton();
		checkEmailButton = new JButton();
		checkFNameButton = new JButton();
		checkLNameButton = new JButton();
		outputArea = new JTextArea(5,15);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, checkPhoneButton, 150, SpringLayout.NORTH, this);
		this.baseController = baseController;
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void showTextMessage(String userInput)// does not send a string back.
	{
		outputArea.append("\n" + userInput);

	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(500,500);
		this.setBackground(Color.GRAY);
		this.add(checkPhoneButton);
		this.add(checkEmailButton);
		this.add(checkFNameButton);
		this.add(checkLNameButton);
		this.add(inputField);
		this.add(outputArea);
		this.setVisible(true);
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		checkFNameButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				System.out.println("first name jacob validation result: "+ Regex.validateFirstName("jacob"));
				System.out.println("first name 3 validation result: "+Regex.validatePhoneNumber("3"));
				// put current input as text
				//showTextMessage(result);// set up result as text
				inputField.setText("");// finish with empty text.
			}
		});
		
		checkLNameButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				System.out.println("last name lindquist validation result: "+ Regex.validateLastName("1234567890"));
				System.out.println("last name  w validation result: "+Regex.validatePhoneNumber("w"));
				// put current input as text
				//showTextMessage(result);// set up result as text
				inputField.setText("");// finish with empty text.
			}
		});
		
		checkPhoneButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				System.out.println("Phone number 1234567890 validation result: "+ Regex.validatePhoneNumber("1234567890"));
				// put current input as text
				//showTextMessage(result);// set up result as text
				inputField.setText("");// finish with empty text.
			}
		});
		
		checkEmailButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				System.out.println("email cool@gmail.com validation result: "+ Regex.validateEmail("cool@gmail.com"));
				// put current input as text
				//showTextMessage(result);// set up result as text
				inputField.setText("");// finish with empty text.
			}
		});
	}

}
