package is.ru.tictactoe;

import static java.lang.System.out;
import java.util.*;

public class TicTacToe {
	public char[][] gameBoard;
	public char[] playerMark;
	public int currentPlayer;

	public TicTacToe() {
		//Initialize the game
		initializeGame();
	}

	private void initializeGame() {
		//Set the players marks to X and O
		playerMark = new char[2];
		playerMark[0] = 'X';
		playerMark[1] = 'Y';
		//Set the current player as 0(X)
		currentPlayer = 0;
		//Create and empty game board
		gameBoard = new char[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				gameBoard[i][j] = ' ';
			}
		}
	}

	public void playerMove(int row, int col){
		//check if the move that the player move is legal
		if(col < 0 || col > 2 || row > 2 || row < 0 || gameBoard[row][col] != ' '){
			System.out.println("Illegal move please try again!");
		}
		else{
			//Mark the player symbol on the board
			gameBoard[row][col] = playerMark[currentPlayer];
			//Switch players
			currentPlayer = 1-currentPlayer;
		}
	}	
}
