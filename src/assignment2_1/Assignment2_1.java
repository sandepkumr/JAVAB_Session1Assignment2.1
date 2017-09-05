/**
 * 
 */
package assignment2_1;
import java.util.Scanner;
/**
 * Class to find the highest of three numbers
 *
 */
public class Assignment2_1 {

	public static void main(String[] args) {// main method starts
		
		int firstNumber,secondNumber,thirdNumber; // Declaring 3 variables 
		
		Scanner s = new Scanner(System.in); // Creating scanner object for taking input
		
		System.out.println("Enter the first number :");
		firstNumber=s.nextInt(); // Initializing first number with user input
		
		System.out.println("Enter the second number :");
		secondNumber=s.nextInt(); // Initializing second number with user input
		
		System.out.println("Enter the third number :");
		thirdNumber=s.nextInt(); // Initializing third number with user input
		
		
		if (firstNumber>=secondNumber && firstNumber>=thirdNumber)		// Using if to find if first number is greater than second and third
			System.out.println("The highest number is : "+firstNumber); // Printing first number as highest if satisfies
		else if (secondNumber>=firstNumber && secondNumber>=thirdNumber)// Using if to find if second number is greater than first and third
			System.out.println("The highest number is : "+secondNumber);// Printing second number as highest
		else if (thirdNumber>=firstNumber && thirdNumber>=secondNumber) // Using if to find if third number is greater than first and second
			System.out.println("The highest number is : "+thirdNumber); // Printing third number as highest
		
		s.close(); // Scanner close


	}

}// Class closed
