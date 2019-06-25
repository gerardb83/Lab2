
import java.util.*;

public class Lab2 {
	
	public static void main(String[] args) {
		
		double inputLength;
		double inputWidth;
		double inputHeight;
		char userContinue = 'y';
		
		
			Scanner scnr = new Scanner(System.in); 
			System.out.println("Welcome to Grand Circus\' Room Detail Generator!");
			
		do {
			System.out.print("\nEnter Length: ");
			inputLength = scnr.nextDouble();
			System.out.print("\nEnter Width: ");
			inputWidth = scnr.nextDouble();
			System.out.print("\nEnter Height: ");
			inputHeight = scnr.nextDouble();
			
			double calcArea = inputLength * inputWidth;
			double calcParimeter = (inputLength * 2) + (inputWidth * 2);
			double calcVolume = calcArea * inputHeight;
			
			System.out.println("Area: " + calcArea);
			System.out.println("Perimeter: " + calcParimeter);
			System.out.println("Volume: " + calcVolume);
			
			System.out.print("\nContinue? (y/n) ");
			userContinue = scnr.next().toLowerCase().charAt(0);
	
		} while (userContinue == 'y');
	
		System.out.println("Goodbye!");
		
	}

}
