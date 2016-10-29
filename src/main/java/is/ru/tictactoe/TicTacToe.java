package is.ru.tictactoe;

import static java.lang.System.out;
import java.util.*;

public class TicTacToe {
	public Board gameBoard;
	public char[] playerMark;
	public int currentPlayer;
	public GameState gameState;

	/**
	* Constructor for the TicTacToe class
	*/
	public TicTacToe() {
		//Initialize the game
		initializeGame();
	}

	/**
	* Initializes the game
	*/
	private void initializeGame() {
		//Initialize the board
		gameBoard = new Board();
		//Set the players marks to X and O
		playerMark = new char[2];
		playerMark[0] = 'X';
		playerMark[1] = 'O';
		//Set the current player as 0(X)
		currentPlayer = 0;
		gameState = GameState.isPlaying;
	}
	
	/**
	* Makes the player move on the Board that is beeing played
	* 
	* @param row the row of the move
	* @param col the column of the move
	*/
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

        /**
	* Returns the player that has the next move
	*
	* @return the mark of the player that has the next move
	*/
	public char isPlaying(){
		return playerMark[currentPlayer];
	}

}
