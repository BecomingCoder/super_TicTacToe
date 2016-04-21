package midTermProject;
import java.util.*;



public class Arena {

	public static void printsArena() {
        
        System.out.print(" " + MainApp.mainBoardArray[0][1] + " |" + " " + MainApp.mainBoardArray[0][2] + " |" + " " + MainApp.mainBoardArray[0][3] + "\n");
        System.out.println("---|---|---");
        System.out.print(" " + MainApp.mainBoardArray[1][1] + " |" + " " + MainApp.mainBoardArray[1][2] + " |" + " " + MainApp.mainBoardArray[1][3] + "\n");
        System.out.println("---|---|---");
        System.out.print(" " + MainApp.mainBoardArray[2][1] + " |" + " " + MainApp.mainBoardArray[2][2] + " |" + " " + MainApp.mainBoardArray[2][3] + "\n");}


 public static void printsSmallArena(){
	 
	 System.out.print(" " + MainApp.childArray[0][1] + " |" + " " + MainApp.childArray[0][2] + " |" + " " + MainApp.childArray[0][3] + "\n");
     System.out.println("---|---|---");
     System.out.print(" " + MainApp.childArray[1][1] + " |" + " " + MainApp.childArray[1][2] + " |" + " " + MainApp.childArray[1][3] + "\n");
     System.out.println("---|---|---");
     System.out.print(" " + MainApp.childArray[2][1] + " |" + " " + MainApp.childArray[2][2] + " |" + " " + MainApp.childArray[2][3] + "\n");}

 
 
	
	
	
	 
 		public static void resetArena(){
 			for(char[] rows: MainApp.mainBoardArray	)
 				Arrays.fill(rows,' ');
}


 		public static void resetBoard() {
 			for(char[]rows:MainApp.childArray )
 				Arrays.fill(rows, ' ');
 			}
					}
	

    

 


	




