import java.util.Scanner;

public class Cs111
{
		final static String NAME = "Tyler Bobik";
		final static String COURSE = "CS 111 Intro to CS I";
		final static String SECTION = "MW 11:10am-1:10pm";	

	// DESCRIPTION:    prints header which includes name, course, 
	// section, homework and lastModified
	// PRECONDITIONS:  all instance variables have value
	// POSTCONDITIONS: header outputs to the console
	public static void printHeader(int homework, String lastModified) 
	{
		System.out.println("/********************************************");
		System.out.println("* AUTHOR:        " + NAME);
		System.out.println("* COURSE:        " + COURSE);
		System.out.println("* SECTION:       " + SECTION);
		System.out.println("* HOMEWORK #:    " + homework);
		System.out.println("* LAST MODIFIED: " + lastModified);
		System.out.println("********************************************/");
	}
	
	// DESCRIPTION:    reads input from user, returns integer 
	// value (error-checked using bounds)
	// PRECONDITIONS:  key is instantiated, prompt is in form 
	// "Enter...: ", lower < upper
	// POSTCONDITIONS: returns integer value between lower 
	// and upper (inclusive)
	public static int readInt(String prompt, Scanner key, int lower, int upper)
	{
		String temp;
		int result;
		boolean isNotValid;
		
		do
		{
			System.out.print(prompt);
			temp = key.nextLine();
			result = Integer.parseInt(temp);
			isNotValid = (result < lower) || (result > upper);
			if(isNotValid)
			{
				System.out.println("ERROR: please enter value between " + lower + " - " + upper);
			}
		} while(isNotValid);
		
		return result;
	}

	// DESCRIPTION:    reads input from user, returns 
	// double value (error-checked using bounds)
	// PRECONDITIONS:  key is instantiated, prompt is in
	// form "Enter...: ", lower < upper
	// POSTCONDITIONS: returns integer value between lower and upper (inclusive)
	public static double readDouble(String prompt, Scanner key, double lower, double upper)
	{
		String temp;
		double result;
		boolean isNotValid;
		
		do
		{
			System.out.print(prompt);
			temp = key.nextLine();
			result = Double.parseDouble(temp);
			isNotValid = (result < lower) || (result > upper);
			if(isNotValid)
			{
				System.out.println("ERROR: please enter value between " + lower + " - " + upper);
			}
		} while(isNotValid);
		
		return result;
	}
	

	// DESCRIPTION:    reads input from user, returns char value 
	// (error-checked using bounds)
	// PRECONDITIONS:  key is instantiated, prompt is in 
	// form "Enter...: ", valid chars
	// POSTCONDITIONS: returns char value within the valid chars 
	public static char readChar(String prompt, Scanner key, String validChars)
    {
        String temp;
        char result;
        boolean isNotValid;
        
        do
        {
        	System.out.print(prompt);
        	temp = key.nextLine();
        	result = temp.charAt(0);
        	isNotValid = validChars.indexOf(result) == -1;
        	if(isNotValid)
        	{
        		System.out.println("ERROR: please enter value in " + validChars);
        	}
        } while(isNotValid);
        
        return result;
      
     }
}