package is.ru.tictactoe;

import static java.lang.System.out;
import java.util.*;

public class TicTacToe {
	public Board gameBoard;
	public char[] playerMark;
	public int currentPlayer;
	public GameState gameState;

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
		gameState = GameState.isPlaying;
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

        //See who is playing
	public char isPlaying(){
		return playerMark[currentPlayer];
	}
	
	public void play(){
		
		//Check if we have a winner and change the gameState
		if(gameBoard.isWinner()){
			if(gameBoard.winner == 'X'){
				gameState = GameState.x_winner;
			}
			else if(gameBoard.winner == 'Y'){
				gameState = GameState.o_winner;
			}
		}
	} 
}
