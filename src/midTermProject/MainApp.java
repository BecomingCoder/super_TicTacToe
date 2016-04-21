package midTermProject;

import java.util.Scanner;

public class MainApp {
	public static char [][] childArray = { {' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	static int [][] positionArray = { {1,2,3},{4,5,6},{7,8,9}};
	static char [][] mainBoardArray = { {' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	public static void main(String[] args) {
		//set class variables
		Validation v1 = new Validation();
		Arena a1 = new Arena();
		
		//open scanner
		Scanner input = new Scanner (System.in);
		
		//variables
		int gameChoice = 0;
		int gameArena = 0;
		int userMove =0;
		String player;
		
		// title
		System.out.println("Welcome to Super Tic Tac Toe!");
		
		//choose game play type
		System.out.print("Enter 1. To battle me! or 2. For 2 player: ");
		gameChoice = v1.getValidNumberInRange(1,2);
		
		
		
		//switch for game type choice 
		switch(gameChoice){
		
		case 1: //vs PC player
			
		//pick board to play on
		System.out.println("Choose your arena");
		gameArena = v1.getPlayerNumberInRange(1,9);
		
		//player picks move
		System.out.println("Pick your move: ");
		userMove = v1.getPlayerNumberInRange(1,9);
		
		
		break;
		
		case 2: //2 player game
		
		}//end gameChoice switch
	}

}
