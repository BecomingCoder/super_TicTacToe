package midTermProject;

public class SaresaAISkynet {
	
	static char [][] childArray = { {' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	private static char temp = '0';
	public static char findPossibleWin(){
		temp= ((childArray[0][0])=='O' && (childArray[0][1]) =='O') ? '3':'0';
		temp= ((childArray[1][0])=='O' && (childArray[1][1]) =='O') ? '6':'0';
		temp= ((childArray[2][0])=='O' && (childArray[1][1]) =='O') ? '9':'0';
		temp= ((childArray[0][1])=='O' && (childArray[0][2]) =='O') ? '1':'0';
		temp= ((childArray[1][1])=='O' && (childArray[1][2]) =='O') ? '4':'0';
		temp= ((childArray[2][1])=='O' && (childArray[2][2]) =='O') ? '7':'0';
		temp= ((childArray[0][0])=='O' && (childArray[1][0]) =='O') ? '7':'0';
		temp= ((childArray[1][0])=='O' && (childArray[2][0]) =='O') ? '1':'0';
		temp= ((childArray[0][0])=='O' && (childArray[2][0]) =='O') ? '4':'0';
		temp= ((childArray[0][0])=='O' && (childArray[1][1]) =='O') ? '9':'0';
		temp= ((childArray[0][0])=='O' && (childArray[2][2]) =='O') ? '5':'0';
		temp= ((childArray[0][3])=='O' && (childArray[1][1]) =='O') ? '7':'0';
		temp= ((childArray[0][3])=='O' && (childArray[2][0]) =='O') ? '5':'0';
		temp= ((childArray[0][1])=='O' && (childArray[1][1]) =='O') ? '8':'0';
		temp= ((childArray[1][1])=='O' && (childArray[2][1]) =='O') ? '2':'0';
		temp= ((childArray[0][1])=='O' && (childArray[2][1]) =='O') ? '5':'0';
		temp= ((childArray[0][2])=='O' && (childArray[1][2]) =='O') ? '9':'0';
		temp= ((childArray[1][2])=='O' && (childArray[2][2]) =='O') ? '3':'0';
		temp= ((childArray[0][2])=='O' && (childArray[2][2]) =='O') ? '6':'0';
		return temp;
	}
	public static char findPossibleBlock(){
		temp= ((childArray[0][0])=='X' && (childArray[0][1]) =='X') ? '3':'0';
		temp= ((childArray[1][0])=='X' && (childArray[1][1]) =='X') ? '6':'0';
		temp= ((childArray[2][0])=='X' && (childArray[1][1]) =='X') ? '9':'0';
		temp= ((childArray[0][1])=='X' && (childArray[0][2]) =='X') ? '1':'0';
		
		temp= ((childArray[1][1])=='X' && (childArray[1][2]) =='X') ? '4':'0';
		temp= ((childArray[2][1])=='X' && (childArray[2][2]) =='X') ? '7':'0';
		temp= ((childArray[0][0])=='X' && (childArray[1][0]) =='X') ? '7':'0';
		temp= ((childArray[1][0])=='X' && (childArray[2][0]) =='X') ? '1':'0';
		temp= ((childArray[0][0])=='X' && (childArray[2][0]) =='X') ? '4':'0';
		temp= ((childArray[0][0])=='X' && (childArray[1][1]) =='X') ? '9':'0';
		temp= ((childArray[0][0])=='X' && (childArray[2][2]) =='X') ? '5':'0';
		temp= ((childArray[0][3])=='X' && (childArray[1][1]) =='X') ? '7':'0';
		temp= ((childArray[0][3])=='X' && (childArray[2][0]) =='X') ? '5':'0';
		temp= ((childArray[0][1])=='X' && (childArray[1][1]) =='X') ? '8':'0';
		temp= ((childArray[1][1])=='X' && (childArray[2][1]) =='X') ? '2':'0';
		temp= ((childArray[0][1])=='X' && (childArray[2][1]) =='X') ? '5':'0';
		temp= ((childArray[0][2])=='X' && (childArray[1][2]) =='X') ? '9':'0';
		temp= ((childArray[1][2])=='X' && (childArray[2][2]) =='X') ? '3':'0';
		temp= ((childArray[0][2])=='X' && (childArray[2][2]) =='X') ? '6':'0';
		return temp;
	}
	public char getRandomMove(){
		double a =  Math.random() * 9;
		char random = (char) a;
		return random;
	}
	
	public char getPCmoveTemp(){
		temp= (findPossibleWin()!='0') ? temp:'0';
		temp= (findPossibleBlock()!='0') ? temp:'0';
		if (temp=='0')
			temp=getRandomMove();
		return temp;
	}
	
	public void getPCmove (){
		//moves
		getPCmoveTemp();
		if (temp ==1 && childArray[0][0] == ' ' ){childArray[0][0]= 'O';}
		if (temp ==2 && childArray[0][1] == ' ' ){childArray[0][1]= 'O';}
		if (temp ==3 && childArray[0][2] == ' ' ){childArray[0][2]= 'O';}
		if (temp ==4 && childArray[1][0] == ' ' ){childArray[1][0]= 'O';}
		if (temp ==5 && childArray[1][1] == ' ' ){childArray[1][1]= 'O';}
		if (temp ==6 && childArray[1][2] == ' ' ){childArray[1][2]= 'O';}
		if (temp ==7 && childArray[2][0] == ' ' ){childArray[2][0]= 'O';}
		if (temp ==8 && childArray[2][1] == ' ' ){childArray[2][1]= 'O';}
		if (temp ==9 && childArray[2][2] == ' ' ){childArray[2][2]= 'O';}
	}
}
