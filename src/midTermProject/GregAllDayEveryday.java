package midTermProject;

public class GregAllDayEveryday {

	public static String player;
	
	//Check for win
	public static boolean checkWin() {
	    if (winChecker()){
	        play = false;
	        System.out.println("Gameover! Player " + player + " wins!");
	    }
	}

	
	
    public static boolean winChecker(){
        //check horizontal
        if(childArray[0][0] == player && childArray[0][1] == player && childArray[0][2] == player)
            return true;
        if(childArray[1][0] == player && childArray[1][1] == player && childArray[1][2] == player)
            return true;
        if(childArray[2][0] == player && childArray[2][1] == player && childArray[2][2] == player)
            return true;
        //check vertical
        if(childArray[0][0] == player && childArray[1][0] == player && childArray[2][0] == player)
            return true;
        if(childArray[0][1] == player && childArray[1][1] == player && childArray[2][1] == player)
            return true;
        if(childArray[0][2] == player && childArray[1][2] == player && childArray[2][2] == player)
            return true;
        //check diagonal
        if(childArray[0][0] == player && childArray[1][1] == player && childArray[2][2] == player)
            return true;
        if (childArray[0][2] == player && childArray[1][1] == player && childArray[2][0] == player)
            return true;
        return false;

    }

}
