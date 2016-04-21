package midTermProject;

public class GregAllDayEveryday {

	
	
	
	//Check for win
	public static boolean checkWin() {
	    if (winChecker()){
	        play = false;
	        System.out.println("Gameover! Player " + player + " wins!");
	    }
	}

	
	
    public static boolean winChecker(){
        //check horizontal
        if(MainApp.childArray[0][0] == MainApp.player && MainApp.childArray[0][1] == player && MainApp.childArray[0][2] == player)
            return true;
        if(MainApp.childArray[1][0] == player && MainApp.childArray[1][1] == player && MainApp.childArray[1][2] == player)
            return true;
        if(MainApp.childArray[2][0] == player && MainApp.childArray[2][1] == player && MainApp.childArray[2][2] == player)
            return true;
        //check vertical
        if(MainApp.childArray[0][0] == player && MainApp.childArray[1][0] == player && MainApp.childArray[2][0] == player)
            return true;
        if(MainApp.childArray[0][1] == player && MainApp.childArray[1][1] == player && MainApp.childArray[2][1] == player)
            return true;
        if(MainApp.childArray[0][2] == player && MainApp.childArray[1][2] == player && MainApp.childArray[2][2] == player)
            return true;
        //check diagonal
        if(MainApp.childArray[0][0] == player && MainApp.childArray[1][1] == player && MainApp.childArray[2][2] == player)
            return true;
        if (MainApp.childArray[0][2] == player && MainApp.childArray[1][1] == player && MainApp.childArray[2][0] == player)
            return true;
        return false;

    }

}
