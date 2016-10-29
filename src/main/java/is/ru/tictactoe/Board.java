package is.ru.tictactoe;

public class Board{
   
	public char[][] board;
	public char [][] table;
	public char winner;
	
	/**
	* Contructor for Board class
	*/
	public Board(){

		initialize();
		winner = ' ';  
 	}

	/**
	* Initialises the Board so a game can be started with the board
	*/
	private void initialize() {
                //Create and empty game board
                board = new char[3][3];
                for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                                board[i][j] = ' ';
                        }
                }
        }

	/**
	* Returns if a move on the board is legal
	*
	* @param row the row number for the move
	* @param col the column number for the move
	* @return if a move is legal or not
	*/	
	public boolean isLegal(int row, int col){
		if((col < 0 || col > 2) || (row > 2 || row < 0) || (board[row][col] != ' ')){
			return false;
		}
		return true;
	}
    
	/**
	* Returns if there is a winner on the board that is been playing.
	*
	* @return true or false if there is a winner on the board 
	*/
	public boolean isWinner(){
		if( board[0][0]==board[1][0] && board[1][0] == board[2][0] && (board[0][0]=='X' || board[0][0]=='O')){
         		winner = board[0][0];
			return true;
		}
		else if( board[0][1]==board[1][1] && board[1][1] == board[2][1] && (board[0][1]=='X' || board[0][1]=='O')){
                	winner = board[0][1];
			return true;
		}
		else if(board[0][2]==board[1][2] && board[1][2] == board[2][2] && (board[0][2]=='X' || board[0][2]=='O')){
                	winner = board[0][2];
			return true;
		}
    		else if( board[0][0]==board[0][1] && board[0][1] == board[0][2] && (board[0][0]=='X' || board[0][0]=='O')){
                	winner = board[0][0];
			return true;
		}
    		else if( board[1][0]==board[1][1] && board[1][1] == board[1][2] && (board[1][0]=='X' || board [1][0]=='O')){
                	winner = board[1][0];
			return true;
		}
    		else if( board[2][0]==board[2][1] && board[2][1] == board[2][2] && (board[2][0]=='X' || board[2][0]=='O')){
                	winner = board[2][0];
			return true;
		}
    		else if( board[0][0]==board[1][1] && board[1][1] == board[2][2] && (board[0][0]=='X' || board[0][0]=='O')){
                	winner = board[0][0];
			return true;
		}
    		else if( board[2][0]==board[1][1] && board[1][1] == board[0][2] && (board[2][0]=='X' || board[2][0]=='O')){
                	winner = board[2][0];
			return true;
		}
    		else{
                	return false;
		}
	}
	
	/**
	* Draws the game board in console
	*/
	public void drawGameBoard(){
                System.out.println("               ");
		System.out.println("  " + board[0][0] + " |  " + board[0][1] + " |  " + board[0][2]);
                System.out.println("--------------");
                System.out.println("  " + board[1][0] + " |  " + board[1][1] + " |  " + board[1][2]);
                System.out.println("--------------");
                System.out.println("  " + board[2][0] + " |  " + board[2][1] + " |  " + board[2][2]);
		System.out.println("               ");
        }
	
	/**
	* Returns if there is a draw in the game that is beeing played on the board
	*
	* @return true or false if there is a draw on the board
	*/
	public boolean isDraw(){

                if(!isWinner()){
                        for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                        if (board[i][j] != 'X' && board[i][j] != 'O') {
                                                return false;
                                        }
                                }
                        }
                        return true;
                }
                else{
                        return false;
                }
        }


}

