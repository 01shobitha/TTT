package game;
//import javax.swing.*;

public class TTT {
	
	public static final int PLAYER_1 = 1; 
	public static final int PLAYER_2 = 2;
	public static final int EMPTY = 0;
	public static int MOVES =0;
	private char user;
	private int board[][];
	
	public TTT() {
			user = PLAYER_1;
			board = new int[3][3];
		 }

	


	public int Check() {
		
		int whoWonR = rowDone();
		int whoWonC = ColumnDone();
		int whoWonD = DiagonalDone();
		
		if(whoWonR == 1 || whoWonC == 1 || whoWonD == 1) {
			
			System.out.println("player 1 wins");
			return PLAYER_1;
		}

		if(whoWonC == 2 || whoWonD == 2 || whoWonR == 2) {
			
			System.out.println("player 2 wins");
			return PLAYER_2;
		}
		 
		else { 
			if(MOVES>=5) {
			System.out.println("its a draw");
		 	return EMPTY;
		}
			return EMPTY;
			
			
		}
	}

	public void setVal(int i,int j) {
	 
		if(user == PLAYER_1) {
			
			board[i][j] = PLAYER_1;
			user = PLAYER_2;
			return;
		}
		if(user == PLAYER_2){
			
			board[i][j] = PLAYER_2;
			user = PLAYER_1;
			return;
		}
		MOVES++;
	}
 
	public int rowDone(){
		
		for(int i = 0; i < 3; ++i){
			
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == PLAYER_1)
				return PLAYER_1;
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == PLAYER_2)
				return PLAYER_2;
		}
		return EMPTY;
	}
 
	public int ColumnDone() {
		
		for(int i = 0; i < 3; ++i) {
			
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] == PLAYER_1)
				return PLAYER_1;
			
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] == PLAYER_2)
				return PLAYER_2;
		 }
		return EMPTY;
	}
 
	public int DiagonalDone() {
		
		 if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == PLAYER_1)
			 return PLAYER_1;
		 if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == PLAYER_2)
			 return PLAYER_2;
		 
		 if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == PLAYER_1)
			 return PLAYER_1;
		 if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == PLAYER_2)
			 return PLAYER_2;
		 
		return EMPTY;	 
	}
 
	public void StartGame() {
		new TTT();
	}
	
	public int WhichPlayer() {
		
		if(user==PLAYER_1)
			return PLAYER_1;
		else 
			return PLAYER_2;
	}
	
	public boolean EndGame() {
		if(MOVES==9) 
			return true;
		else 
			return false;
		
	}
 
}
