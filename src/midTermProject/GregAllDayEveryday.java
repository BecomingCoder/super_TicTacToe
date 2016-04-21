package midTermProject;

public class GregAllDayEveryday {

	
	
	//Check for win
	public static void checkWinChild() {
		// check if spot available method
		for (int i = 0; i < MainApp.childArray.length; i++ ){
			for (int j = 0; j < MainApp.childArray.length; j++){
				if (MainApp.childArray[i][j] == MainApp.userMove){
					MainApp.x = i;
					MainApp.y = j;
				}
			}//end j for loop
		}//end i for loop
		
		while(MainApp.childArray[MainApp.x][MainApp.y] == 'X' || MainApp.childArray[MainApp.x][MainApp.y] == 'O') {
			System.out.println("This space is taken.....try again!");
		
		MainApp.childArray[MainApp.x][MainApp.y] = MainApp.player;
		//Check for win
        if (winChecker()){
            MainApp.play = false;
            System.out.println("Gameover! Player " + MainApp.player + " wins!");
        }
        
        //Statement to change players.
        if (MainApp.player == 'X') {
        	MainApp.player = 'O';
        } else {
        	MainApp.player = 'X';
        }
        
        //Check for draw by using a move counter and the max number of moves
        if (MainApp.counterChild >= 9){
            System.out.println("You both suck");
            break;
        }
        }
		}
		
	
	//Check for win
	public static void checkWinMain() {
		// check if spot available method
		for (int i = 0; i < MainApp.mainBoardArray.length; i++ ){
			for (int j = 0; j < MainApp.mainBoardArray.length; j++){
				if (MainApp.mainBoardArray[i][j] == MainApp.userMove){
					MainApp.x = i;
					MainApp.y = j;
				}
			}//end j for loop
		}//end i for loop
		
		while(MainApp.mainBoardArray[MainApp.x][MainApp.y] == 'X' || MainApp.mainBoardArray[MainApp.x][MainApp.y] == 'O') {
			System.out.println("This space is taken.....try again!");
		
		MainApp.mainBoardArray[MainApp.x][MainApp.y] = MainApp.player;
		//Check for win
        if (winChecker()){
            MainApp.play = false;
            System.out.println("Gameover! Player " + MainApp.player + " wins!");
        }
        
        //Statement to change players.
        if (MainApp.player == 'X') {
        	MainApp.player = 'O';
        } else {
        	MainApp.player = 'X';
        }
        
        //Check for draw by using a move counter and the max number of moves
        if (MainApp.counterMain >= 9){
            System.out.println("You both suck");
            break;
        }
        }
		}

	
	
    public static boolean winChecker(){
        //check horizontal
        if(MainApp.childArray[0][0] == MainApp.player && MainApp.childArray[0][1] == MainApp.player && MainApp.childArray[0][2] == MainApp.player)
            return true;
        if(MainApp.childArray[1][0] == MainApp.player && MainApp.childArray[1][1] == MainApp.player && MainApp.childArray[1][2] == MainApp.player)
            return true;
        if(MainApp.childArray[2][0] == MainApp.player && MainApp.childArray[2][1] == MainApp.player && MainApp.childArray[2][2] == MainApp.player)
            return true;
        //check vertical
        if(MainApp.childArray[0][0] == MainApp.player && MainApp.childArray[1][0] == MainApp.player && MainApp.childArray[2][0] == MainApp.player)
            return true;
        if(MainApp.childArray[0][1] == MainApp.player && MainApp.childArray[1][1] == MainApp.player && MainApp.childArray[2][1] == MainApp.player)
            return true;
        if(MainApp.childArray[0][2] == MainApp.player && MainApp.childArray[1][2] == MainApp.player && MainApp.childArray[2][2] == MainApp.player)
            return true;
        //check diagonal
        if(MainApp.childArray[0][0] == MainApp.player && MainApp.childArray[1][1] == MainApp.player && MainApp.childArray[2][2] == MainApp.player)
            return true;
        if (MainApp.childArray[0][2] == MainApp.player && MainApp.childArray[1][1] == MainApp.player && MainApp.childArray[2][0] == MainApp.player)
            return true;
        return false;

    }

}
