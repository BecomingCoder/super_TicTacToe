package midTermProject;


public class SaresaAISkynet {
	
	private static char temp = '0';
	public static char findPossibleWin(){
		temp= ((MainApp.childArray[0][0])=='O' && (MainApp.childArray[0][1]) =='O') ? '3':'0';
		temp= ((MainApp.childArray[1][0])=='O' && (MainApp.childArray[1][1]) =='O') ? '6':'0';
		temp= ((MainApp.childArray[2][0])=='O' && (MainApp.childArray[1][1]) =='O') ? '9':'0';
		temp= ((MainApp.childArray[0][1])=='O' && (MainApp.childArray[0][2]) =='O') ? '1':'0';
		temp= ((MainApp.childArray[1][1])=='O' && (MainApp.childArray[1][2]) =='O') ? '4':'0';
		temp= ((MainApp.childArray[2][1])=='O' && (MainApp.childArray[2][2]) =='O') ? '7':'0';
		temp= ((MainApp.childArray[0][0])=='O' && (MainApp.childArray[1][0]) =='O') ? '7':'0';
		temp= ((MainApp.childArray[1][0])=='O' && (MainApp.childArray[2][0]) =='O') ? '1':'0';
		temp= ((MainApp.childArray[0][0])=='O' && (MainApp.childArray[2][0]) =='O') ? '4':'0';
		temp= ((MainApp.childArray[0][0])=='O' && (MainApp.childArray[1][1]) =='O') ? '9':'0';
		temp= ((MainApp.childArray[0][0])=='O' && (MainApp.childArray[2][2]) =='O') ? '5':'0';
		temp= ((MainApp.childArray[0][2])=='O' && (MainApp.childArray[1][1]) =='O') ? '7':'0';
		temp= ((MainApp.childArray[0][2])=='O' && (MainApp.childArray[2][0]) =='O') ? '5':'0';
		temp= ((MainApp.childArray[0][1])=='O' && (MainApp.childArray[1][1]) =='O') ? '8':'0';
		temp= ((MainApp.childArray[1][1])=='O' && (MainApp.childArray[2][1]) =='O') ? '2':'0';
		temp= ((MainApp.childArray[0][1])=='O' && (MainApp.childArray[2][1]) =='O') ? '5':'0';
		temp= ((MainApp.childArray[0][2])=='O' && (MainApp.childArray[1][2]) =='O') ? '9':'0';
		temp= ((MainApp.childArray[1][2])=='O' && (MainApp.childArray[2][2]) =='O') ? '3':'0';
		temp= ((MainApp.childArray[0][2])=='O' && (MainApp.childArray[2][2]) =='O') ? '6':'0';
		return temp;
	}
	public static char findPossibleBlock(){
		temp= ((MainApp.childArray[0][0])=='X' && (MainApp.childArray[0][1]) =='X') ? '3':'0';
		temp= ((MainApp.childArray[1][0])=='X' && (MainApp.childArray[1][1]) =='X') ? '6':'0';
		temp= ((MainApp.childArray[2][0])=='X' && (MainApp.childArray[1][1]) =='X') ? '9':'0';
		temp= ((MainApp.childArray[0][1])=='X' && (MainApp.childArray[0][2]) =='X') ? '1':'0';
		temp= ((MainApp.childArray[1][1])=='X' && (MainApp.childArray[1][2]) =='X') ? '4':'0';
		temp= ((MainApp.childArray[2][1])=='X' && (MainApp.childArray[2][2]) =='X') ? '7':'0';
		temp= ((MainApp.childArray[0][0])=='X' && (MainApp.childArray[1][0]) =='X') ? '7':'0';
		temp= ((MainApp.childArray[1][0])=='X' && (MainApp.childArray[2][0]) =='X') ? '1':'0';
		temp= ((MainApp.childArray[0][0])=='X' && (MainApp.childArray[2][0]) =='X') ? '4':'0';
		temp= ((MainApp.childArray[0][0])=='X' && (MainApp.childArray[1][1]) =='X') ? '9':'0';
		temp= ((MainApp.childArray[0][0])=='X' && (MainApp.childArray[2][2]) =='X') ? '5':'0';
		temp= ((MainApp.childArray[0][2])=='X' && (MainApp.childArray[1][1]) =='X') ? '7':'0';
		temp= ((MainApp.childArray[0][2])=='X' && (MainApp.childArray[2][0]) =='X') ? '5':'0';
		temp= ((MainApp.childArray[0][1])=='X' && (MainApp.childArray[1][1]) =='X') ? '8':'0';
		temp= ((MainApp.childArray[1][1])=='X' && (MainApp.childArray[2][1]) =='X') ? '2':'0';
		temp= ((MainApp.childArray[0][1])=='X' && (MainApp.childArray[2][1]) =='X') ? '5':'0';
		temp= ((MainApp.childArray[0][2])=='X' && (MainApp.childArray[1][2]) =='X') ? '9':'0';
		temp= ((MainApp.childArray[1][2])=='X' && (MainApp.childArray[2][2]) =='X') ? '3':'0';
		temp= ((MainApp.childArray[0][2])=='X' && (MainApp.childArray[2][2]) =='X') ? '6':'0';
		return temp;
	}
	public char getRandomMove(){
		double a =  Math.random() * 9;
		char random = (char) a;
		return random;
	}
	
	public char getPCmoveTemp(){
		temp= findPossibleWin();
		if (temp=='0')
			temp= findPossibleBlock();		
		if (temp=='0')
			temp=getRandomMove();
		return temp;
	}
	
	public void getPCmove (){
		//moves
		getPCmoveTemp();
		if (temp ==1 && MainApp.childArray[0][0] == ' ' ){MainApp.childArray[0][0]= 'O'; MainApp.player = 'X';}
		if (temp ==2 && MainApp.childArray[0][1] == ' ' ){MainApp.childArray[0][1]= 'O'; MainApp.player = 'X';}
		if (temp ==3 && MainApp.childArray[0][2] == ' ' ){MainApp.childArray[0][2]= 'O'; MainApp.player = 'X';}
		if (temp ==4 && MainApp.childArray[1][0] == ' ' ){MainApp.childArray[1][0]= 'O'; MainApp.player = 'X';}
		if (temp ==5 && MainApp.childArray[1][1] == ' ' ){MainApp.childArray[1][1]= 'O'; MainApp.player = 'X';}
		if (temp ==6 && MainApp.childArray[1][2] == ' ' ){MainApp.childArray[1][2]= 'O'; MainApp.player = 'X';}
		if (temp ==7 && MainApp.childArray[2][0] == ' ' ){MainApp.childArray[2][0]= 'O'; MainApp.player = 'X';}
		if (temp ==8 && MainApp.childArray[2][1] == ' ' ){MainApp.childArray[2][1]= 'O'; MainApp.player = 'X';}
		if (temp ==9 && MainApp.childArray[2][2] == ' ' ){MainApp.childArray[2][2]= 'O'; MainApp.player = 'X';}
	}
}
