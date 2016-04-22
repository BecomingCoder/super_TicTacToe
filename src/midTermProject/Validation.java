package midTermProject;

import java.util.*;

public class Validation {
	
	
	
	

	
	public static int readValidIntegerNoExp() {
		while (true) {
			
			if (MainApp.input.hasNextInt())
				break;
			MainApp.input.nextLine();
			System.out.println("Please enter numbers only!");
			
			}
		int x = MainApp.input.nextInt();
		
		return x;
	}
	
	public static int getValidNumberInRange(int min, int max) {
		
		int input = readValidIntegerNoExp();
		while ((input < min) || (input > max)) {
			System.out.println("Please use a number between " + min + " and " + max + ": ");
			input = readValidIntegerNoExp();
			
		}
		return input;
	}
	
	public static int getPlayerNumberInRange(int min, int max) {
		
		int input = readValidIntegerNoExp();
		while ((input < min) || (input > max)) {
			System.out.println("Please use a number between " + min + " and " + max + ": ");
			input = readValidIntegerNoExp();
			
		}
		return input;
	}

}
