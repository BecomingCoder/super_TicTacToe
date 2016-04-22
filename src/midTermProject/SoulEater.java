package midTermProject;

public class SoulEater {
	
	private String Player;
	
	private String Player2;

	public String getPlayer() {
		return Player;
	}
	public String getPlayer2(){
		return Player2;
	
	}

	public void setPlayer(String player) {
		Player = player;
		Player2 = player2;
	}
	
	public class Player_Symbol extends Player {

	    private String symbolChoice;
	    private int[][] symbolPosition;

	    public void setSymbol (String symbol) {
	        this.symbolChoice = symbol;
	    }

	    public void setPosition(int[][] position) {
	        this.setPosition = position;
	    }

	    public String getPosition() {
	        return Player;
	    }

	    public int[][] getSymbolPos() {
	        return symbolPosition;
	    }

	

}
}
