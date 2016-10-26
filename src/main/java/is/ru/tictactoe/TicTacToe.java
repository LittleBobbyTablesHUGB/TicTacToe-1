package is.ru.tictactoe;

import static java.lang.System.out;
import java.util.*;

public class TicTacToe {
	public Board gameBoard;
	public char[] playerMark;
	public int currentPlayer;

	public TicTacToe() {
		//Initialize the game
		initializeGame();
	}
	private void initializeGame() {
		//Initialize the board
		gameBoard = new Board();
		//Set the players marks to X and O
		playerMark = new char[2];
		playerMark[0] = 'X';
		playerMark[1] = 'O';
		//Set the current player as 0(X)
		currentPlayer = 0;
	}

	public void playerMove(int row, int col){
		//check if the move that the player move is legal
		if(!gameBoard.isLegal(row, col)){
			System.out.println("Illegal move please try again!");
		}
		else{
			//Mark the player symbol on the board
			gameBoard.board[row][col] = playerMark[currentPlayer];
			//Switch players
			currentPlayer = 1-currentPlayer;
		}
	}

        // Change player to see who is playing
	public char isPlaying(){
		return playerMark[currentPlayer];
	}
}
