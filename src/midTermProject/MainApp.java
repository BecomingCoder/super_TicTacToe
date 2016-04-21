package midTermProject;

import java.util.Scanner;

public class MainApp {

	public static char[][] childArray = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static int[][] positionArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	public static char[][] mainBoardArray = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	public static char player = 'X';
	public static boolean play = true;
	public static int counterChild = 0;
	public static int counterMain = 0;
	public static int x = 0;
	public static int y = 0;
	public static int userMove = '0';

	public static void main(String[] args) {
		// set class variables
		Arena a1 = new Arena();
		SaresaAISkynet s1 = new SaresaAISkynet();

		// open scanner
		Scanner input = new Scanner(System.in);

		// variables
		int gameChoice = '0';
		int gameArena = 0;
		
		

		// title
		System.out.println("Welcome to Super Tic Tac Toe!");

		// choose game play type
		System.out.print("Enter 1. To battle me! or 2. For 2 player: ");

		gameChoice = Validation.getPlayerNumberInRange(1, 2);

		// switch for game type choice
		switch (gameChoice) {

		case 1: // vs PC player

			// while loop for main board
			while (play) {
				// pick board to play on
				System.out.println("Choose your arena");
				gameArena = Validation.getValidNumberInRange(1, 9);
						// while loop for child game
				while (play) {
					// player picks move
					System.out.println("Pick your move: ");
					userMove = Validation.getPlayerNumberInRange(1, 9);

					
					while (childArray[x][y]!=' '){
						System.out.println("You must pick a open spot.");
						System.out.println("Pick your move: ");
						userMove = Validation.getPlayerNumberInRange(1, 9);
					}
					// mark spot
					childArray[x][y] = 'X';
					// check for win
					GregAllDayEveryday.checkWin();
					// increase counter
					counterChild++;
					// change player to playerO
					player = 'O';
					// get PC move +++++ put while loop that runs while PlayerO
					while (player == 'O') {
						s1.getPCmove();
					}
					// check for win
					GregAllDayEveryday.checkWin();
					// increase counter
					counterChild++;
				} // end countChild while
				counterMain++;
			} // end countMain while
			break;

		case 2: // 2 player game
			// directions player X goes first
			System.out.println("Player X goes first");
			// pick board to play on
			System.out.println("Choose your arena");
			gameArena = Validation.getPlayerNumberInRange(1, 9);

			// pick your move
			System.out.println("Pick your move: ");
			userMove = Validation.getPlayerNumberInRange(1, 9);
			// check if spot available method
			
			// mark spot

			// check for win
			GregAllDayEveryday.checkWin();
			// increase counter
			counterChild++;
			// change player to playerO
			player = 'O';
			// pick your move
			System.out.println("Pick your move: ");
			userMove = Validation.getPlayerNumberInRange(1, 9);
			// check if spot available method
			
			// mark spot

			// check for win
			GregAllDayEveryday.checkWin();
			// increase counter
			counterChild++;
			// change player to playerO
			player = 'X';

		}// end gameChoice switch
	}

}
