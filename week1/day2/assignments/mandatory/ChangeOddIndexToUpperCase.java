package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {
	
	
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	
		String test = "changeme";
		
		char[] ch1= test.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			
			int j = i%2;
			
			if(j!=0) {
				
				ch1[i] = Character.toUpperCase(ch1[i]);
			}
			
			System.out.print(ch1[i]);
			
		}
		
		
	}
}
