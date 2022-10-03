package testProjects;

/**
*
* @author angeluz
*/
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;

public class avaWeek3And4CodingAssignment {

	public avaWeek3And4CodingAssignment() {
		// TODO Auto-generated constructor stub
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
					
		System.out.println("Difference of first and last element in myNewAge[] = " + newDifference);
	
		Double sum = 0.0;
		for (int i = 0; i < myNewAge.size(); i++) {
	            sum += myNewAge.get(i);
		}
		double average = sum / myNewAge.size();
		System.out.println("The average age in myNewAge[] = " + average );
			
		/* 
		 * *******************-----
	     * Step 2
		 * ********************
	     */
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum = 0.0;
		for (int i = 0; i < names.length; i++) {
	            sum += names[i].length();
		}
		average = sum / names.length;
	      
		System.out.println("The average number of letters per name in names[] = " + average );
			
		String allNames = "";
	       for (int i = 0; i < names.length; i++) {
	           allNames += names[i] + " ";
		}
		System.out.println(allNames);
			
		/* 
	     * ********************
	     * Step 3
		 * ********************
	     */
			
		System.out.println("Use array[arr.length - 1] to access the last element of an array");
			
		/* 
	     * ********************
		 * Step 4
	     * ********************
	     */
			
		System.out.println("Use array[0] to access the first element of an array");
			
		/* 
	     * ********************
		 * Step 5
	     * ********************
		 */
			
	    int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
	           nameLengths[i] = names[i].length(); 
		 }
			
		/* 
		 * ********************
	     * Step 6
		 * ********************
	     */
			
		int sumOfL = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfL += nameLengths[i];
		}
	       System.out.println("The sum of all lengths in nameLengths[] = " + sumOfL);
			
		/* 
		 * ********************
	     * Step 7
		 * ********************
	     */
			
		System.out.println(duplicateWord("Hello", 5));
			
		/* 
		 * ********************
	     * Step 8
		 * ********************
	     */
			
		System.out.println(getFullName("Bruce", "Banner"));
			
	    /* 
		 * ********************
	     * Step 9
		 * ********************
	     */
			
		System.out.println("checkIfSumGreaterThan100() returns => " + checkIfSumGreaterThan100(ages));
			
		/* 
		 * ********************
	     * Step 10
		 * ********************
	     */
			
	    double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
		System.out.println("getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(doubleArr));
		
		/* 
	     * ********************
		 * Step 11
	     * ********************
		 */
			
		double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
		System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
	        
		/* 
         * ********************
	     * Step 12
         * ********************
	     */
        
         System.out.println("willBuyDrink() returns => " + willBuyDrink(true, 20.5));

		/* 
	     * ********************
		 * Step 13
	     * ********************
		 */
		System.out.println("getAge() returns => " + getAge(1981));

	    }
		
	    private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
	            duplicatedWord += word;
		}
	        return "duplicatedWord() returns => " + duplicatedWord;
	    }
		
	    private static String getFullName(String firstName, String lastName) {
	        return "getFullName() returns => " + firstName + " " + lastName;
	    }
		
	    private static Boolean checkIfSumGreaterThan100(int[] arr) {
	        return Arrays.stream(arr).sum() > 100;
	    }
		
	    private static double getAverageOfDoubleArr(double[] arr) {
	        // We need to use .orElse() in case an empty array is passed in
		return Arrays.stream(arr).average().orElse(Double.NaN);
	    }
		
	    private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
	        return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
	    }
	    
	    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside == true && moneyInPocket > 10.50; 
	    }

	    /*
	     * getAge calculates a new user's age with the given birthYear
	     */
	    private static int getAge(int birthYear) {
	        return Year.now().getValue() - birthYear; 
	    }

}



