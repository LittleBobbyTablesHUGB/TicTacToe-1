package is.ru.tictactoe;

public class Board{
   
	public char[][] board;
	public char [][] table;
	public char winner;

	public Board(){

		initialize();
		initializeBoard();
		winner = ' ';  
 	}
	private void initializeBoard(){
		//Create board with input
		table=new char[3][3];
		for(int i =0; i<3; i++){
			for(int j=0;j<3; j++){
				table[i][j]=' ';
			}
		}



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

	public boolean isLegal(int row, int col){
		if((col < 0 || col > 2) || (row > 2 || row < 0) || (board[row][col] != ' ')){
			return false;
		}
		return true;
	}
    

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

	 public void drawGameBoard(){
                System.out.println("               ");
		System.out.println("  " + board[0][0] + " |  " + board[0][1] + " |  " + board[0][2]);
                System.out.println("--------------");
                System.out.println("  " + board[1][0] + " |  " + board[1][1] + " |  " + board[1][2]);
                System.out.println("--------------");
                System.out.println("  " + board[2][0] + " |  " + board[2][1] + " |  " + board[2][2]);
		System.out.println("               ");
        }
	public void drawBoardNumbers(){
		System.out.println("               ");
		System.out.println("0 0" + table[0][0] + "|0 1" + table[0][1] + "|0 2" + table[0][2]);
                System.out.println("--------------");
                System.out.println("1 0" + table[1][0] + "|1 1" + table[1][1] + "|1 2" + table[1][2]);
                System.out.println("--------------");
                System.out.println("2 0" + table[2][0] + "|2 1" + table[2][1] + "|2 2" + table[2][2]);
		System.out.println("               ");

	}
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

