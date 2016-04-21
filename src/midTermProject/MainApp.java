package midTermProject;

import java.util.Scanner;

public class MainApp {
	public static char[][] childArray = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	public static int[][] positionArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	public static char[][] mainBoardArray = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	public static void main(String[] args) {
		// set class variables
		Validation v1 = new Validation();
		Arena a1 = new Arena();
		SaresaAISkynet s1 = new SaresaAISkynet();

		// open scanner
		Scanner input = new Scanner(System.in);

		// variables
		int gameChoice = 0;
		int gameArena = 0;
		int userMove = 0;
		int counterChild = 0;
		int counterMain = 0;
		String player;

		// title
		System.out.println("Welcome to Super Tic Tac Toe!");

		// choose game play type
		System.out.print("Enter 1. To battle me! or 2. For 2 player: ");
		gameChoice = v1.getValidNumberInRange(1, 2);

		// switch for game type choice
		switch (gameChoice) {

		case 1: // vs PC player
			
			//while loop for main board
			while (counterMain <= 9) {
				// pick board to play on
				System.out.println("Choose your arena");
				gameArena = v1.getPlayerNumberInRange(1, 9);
				//while loop for child game
				while (counterChild <= 9) {
					// player picks move
					System.out.println("Pick your move: ");
					userMove = v1.getPlayerNumberInRange(1, 9);

					// check if spot available method

					// mark spot

					// check for win

					// increase counter

					// change player to playerO

					// get PC move +++++ put while loop that runs while PlayerO
					s1.getPCmove();

					// check for win

					// increase counter
				} // end countChild while
				counterMain++;
			} // end countMain while
			break;

		case 2: // 2 player game

		}// end gameChoice switch
	}

}
