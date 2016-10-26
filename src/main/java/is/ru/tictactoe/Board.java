package is.ru.tictactoe;

public class Board{
   
	public char[][] board;

	public Board(){

		initialize();  
 	}

	private void initialize() {
                //Create and empty game board
                board = new char[3][3];
                for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                                board[i][j] = ' ';
                        }
                }
        }

	public boolean isLegal(int col, int row){
	if((col < 0 || col > 2) || (row > 2 || row < 0) || (board[row][col] != ' ')){
		return false;
	}
		return true;
	}
 }

 
