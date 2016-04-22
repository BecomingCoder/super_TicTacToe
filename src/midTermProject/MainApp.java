package midTermProject;

import java.util.Scanner;

public class MainApp {
	// open scanner
	public static Scanner input = new Scanner(System.in);
	public static char[][] childArray = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static int[][] positionArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	public static char[][] mainBoardArray = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	public static char player = 'X';
	public static boolean play = true;
	public static int counterChild = 0;
	public static int counterMain = 0;
	public static int x = 0;
	public static int y = 0;
	public static int userMove = 0;
	public static int gameChoice = 0;
	public static int gameArena = 0;

	public static void main(String[] args) {
		// set class variables
		Arena a1 = new Arena();
		SaresaAISkynet s1 = new SaresaAISkynet();

		

		// variables
		
		boolean test=true;
		

		// title
		System.out.println("Welcome to Super Tic Tac Toe!");

		// choose game play type
		System.out.print("Enter 1. To battle me! or 2. For 2 player: ");

		gameChoice = Validation.getPlayerNumberInRange(1, 2);

		// switch for game type choice
		switch (gameChoice) {
	

		case 1: // vs PC player

			// while loop for main board
			while (play) { // arena 
				// pick board to play on
				System.out.println("Choose your arena");
				gameArena = Validation.getValidNumberInRange(1, 9);
				
						// while loop for child game
				//Arena.printsSmallArena();
				while (counterChild <= 8 && !checkForWin(childArray)) {
					// player picks move
					System.out.println("Pick your move: ");
					userMove = Validation.getValidNumberInRange(1, 9);
					for (int i = 0; i < MainApp.positionArray.length; i++ ){
						for (int j = 0; j < MainApp.positionArray.length; j++){
							if (MainApp.positionArray[i][j] == MainApp.userMove){
								MainApp.x = i;
								MainApp.y = j;
							}
						}//end j for loop
					}//end i for loop
					
					while (childArray[x][y]!=' '){
						System.out.println("You must pick a open spot.");
						System.out.println("Pick your move: ");
						userMove = Validation.getPlayerNumberInRange(1, 9);
					}
					// mark spot
					childArray[x][y] = 'X';
					test=checkForWin(childArray);
					if (test)
						break;
					
					//print board
					Arena.printsSmallArena();
					// check for win
					//GregAllDayEveryday.checkWinChild();
					// increase counter
					counterChild++;
					// change player to playerO
					player = 'O';
					System.out.println("My Turn!");
					// get PC move +++++ put while loop that runs while PlayerO
					while (player == 'O') {
						s1.getPCmove();
					}
					//print board
					
					
					Arena.printsSmallArena();
					// increase counter
					counterChild++;
					// check for win
					//GregAllDayEveryday.checkWinChild();
					//System.out.println(counterChild);
				} // end countChild while
				counterMain++;
				
				
				if (counterChild<=8){
					System.out.println("Player"+player+" wins!");
					//Arena.printsSmallArena();
					
					
					
				}else{
				System.out.println("It's a Tie!! Wild Card gets the spot!!");
				}
				counterChild = 0;
				Arena.resetBoard();
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
			GregAllDayEveryday.checkWinChild();
			// increase counter
			counterChild++;
			// change player to playerO
			//player = 'O';
			// pick your move
			System.out.println("Pick your move: ");
			userMove = Validation.getPlayerNumberInRange(1, 9);
			// check if spot available method
			
			// mark spot

			// check for win
			GregAllDayEveryday.checkWinChild();
			// increase counter
			counterChild++;
			// change player to playerO
			player = 'X';

		}// end gameChoice switch
	}
	public static boolean checkForWin(char[][] childArray) {
		// check for win
		if (childArray[0][0] == childArray[0][1] && childArray[0][1] == childArray[0][2] && (childArray[0][0] == 'X' || childArray[0][0] == 'O'))
			return true;
		else if (childArray[1][0] == childArray[1][1] && childArray[1][1] == childArray[1][2] && (childArray[1][0] == 'X' || childArray[1][0] == 'O'))
			return true;
		else if (childArray[2][0] == childArray[2][1] && childArray[2][1] == childArray[2][2] && (childArray[2][0] == 'X' || childArray[2][0] == 'O'))
			return true;
		else if (childArray[0][0] == childArray[1][0] && childArray[1][0] == childArray[2][0] && (childArray[0][0] == 'X' || childArray[0][0] == 'O'))
			return true;
		else if (childArray[0][1] == childArray[1][1] && childArray[1][1] == childArray[2][1] && (childArray[0][1] == 'X' || childArray[0][1] == 'O'))
			return true;
		else if (childArray[0][2] == childArray[1][2] && childArray[1][2] == childArray[2][2] && (childArray[0][2] == 'X' || childArray[0][2] == 'O'))
			return true;
		else if (childArray[0][0] == childArray[1][1] && childArray[1][1] == childArray[2][2] && (childArray[0][0] == 'X' || childArray[0][0] == 'O'))
			return true;
		else if (childArray[0][2] == childArray[1][1] && childArray[1][1] == childArray[2][1] && (childArray[0][2] == 'X' || childArray[0][2] == 'O'))
			return true;
		else
			return false;
	}
}
