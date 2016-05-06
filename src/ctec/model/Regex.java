package ctec.model;

import ctec.controller.RegexController;
import ctec.view.RegexPanel;
import java.util.*;

public class Regex 
{
	private RegexController baseController = new RegexController();
	private RegexPanel panel = new RegexPanel(baseController);
	/*
	 * First Name: 2-30 letters, no symbols

Last Name: 2-40 letters, -,. allowed

Phone: 10 numbers

Email: valid email address
	 */
	public Regex()
	{
		
	}
	
	public void Expressions(String FName, String LName,int phone,String email)
	{
		// \b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b
		///^[a-z ,.'-]+$/i
	}
	
	
	
	public static  boolean validatePhoneNumber(String phoneNo) {
		//validate phone numbers of format "1234567890"
		if (phoneNo.matches("\\d{10}")) return true;
		//validating phone number with -, . or spaces
		else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
		//validating phone number with extension length from 3 to 5
		else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
		//validating phone number where area code is in braces ()
		else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
		//return false if nothing matches the input
		else return false;
		
	}
	
	public static boolean validateFirstName(String FName) {
		//validate phone numbers of format "1234567890"
		if (FName.matches("^[a-z ,.'-]+$/i")) return true;
		//validating phone number with -, . or spaces
		else if(FName.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
		
		else return false;
		
	}
	
	public static boolean validateLastName(String LName) {
		//validate phone numbers of format "1234567890"
		if (LName.matches("\b[A-Z0-9._%+-]+@[A-Z0-9.-]")) return true;
		//validating phone number with -, . or spaces
		else if(LName.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
		
		else return false;
		
	}
	
	public static boolean validateEmail(String email) {
		
		//validating phone number with extension length from 3 to 5
		 if(email.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{@gmail.com}")) return true;
		
		//return false if nothing matches the input
		else return false;
		
	}

}
