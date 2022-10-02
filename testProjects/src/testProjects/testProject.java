package testProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class testProject {
	{
    /* 
			 * ********************
			 * Step 1
		     * ********************
			 */
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
				
		    // Instructions are to get the difference of the first and last element.
		    // However we are not allowed to use any numbers at all...
			int lengthOfArr = ages.length;
	
		    int difference = Math.abs(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);
				
			System.out.println("Difference of first and last element in ages[] = " + difference);
				
		     
		    ArrayList<Integer> myNewAge = new ArrayList<>(Arrays.asList(3, 9, 23, 64, 2, 8, 28, 93));
			myNewAge.add(25);
			
			int newDifference = Math.abs(myNewAge.get(myNewAge.size() - myNewAge.size()) 
					- myNewAge.get(myNewAge.size() - 1));
		 
		 
	 }
	 
	
	 
	 
		}	 
	

	
	
	
	
	
	





