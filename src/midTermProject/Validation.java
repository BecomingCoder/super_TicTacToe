package midTermProject;

import java.util.Scanner;

public class Validation {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int readValidIntegerNoExp() {
		while (true) {
			
			if (sc.hasNextInt())
				break;
			sc.nextLine();
			System.out.println("Please enter numbers only!");
			
			}
		int x = sc.nextInt();
		sc.nextLine();
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
