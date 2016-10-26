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
		playerMark[1] = 'Y';
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

	public void drawGameBoard(){
		System.out.println("  " + gameBoard[0][0] + "|" + gameBoard[0][1] + "|" + gameBoard[0][2]);
		System.out.println("---------");
		System.out.println("  " + gameBoard[1][0] + "|" + gameBoard[1][1] + "|" + gameBoard[1][2]);
		System.out.println("---------");
		System.out.println("  " + gameBoard[2][0] + "|" + gameBoard[2][1] + "|" + gameBoard[2][2]);
 	
	}	
}
