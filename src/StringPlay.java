/*
 * Modified on 1/31/2013
 * 
 * ULID: Rkhickm
 * Course: IT 168
 * Lecture Section: 4
 * Instructor: Professor Matsuda
 * Lab section: 5
 * Instructor: Professor Erickson
 */

/**
 * Asks the user for their favorite quote and then displays on the user's screen: the original string they entered, the amount of characters in the string they entered, the first word of their string in all upper case,
 * the last word of their string in all camel case, the first middle and last characters of the string labeled, and all the vowels in the user's string converted to a #. 
 * 
 * &author Ryan Hickman
 * 
 */


import java.util.Scanner;						//Needed for the scanner class

public class StringPlay 
{
	public static void main (String [] args)
	{
		
		String quote;							//Declares the variable "quote"
		int stringSize;							//Declares the variable "stringSize"
		
		//Creates a scanner input to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Asks the user for their favorite quote
		System.out.println("What is your favorite quote?");
		quote = keyboard.nextLine();
		
		//Displays the user's favorite quote on the screen
		System.out.println("You entered: " + quote);
		
		//Calculates and displays the character length of the user's quote
		stringSize = quote.length();
		System.out.println("The length of the phrase you entered is: " + stringSize );
		
		//Replaces all vowels in the user's quote with a "#" and displays it on the screen
		String quote1 = quote.replaceAll("[aeiouAEIOU]", "#");
		System.out.println(quote1);
		
		
		
		
		
		
		
		
		
		
	}

}
