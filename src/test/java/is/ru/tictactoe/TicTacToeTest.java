package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static java.lang.System.out;

public class TicTacToeTest {
	/**
        * Make a valid move
        * @result Move on the gameBoard will be made without any errors
        */
	@Test
	public void testPlayerMove() {
		TicTacToe game = new TicTacToe();
		game.playerMove(2,2);
		assertEquals(game.playerMark[1 - game.currentPlayer], game.gameBoard.board[2][2]); 
	}
	/**
        * Make an invalid move
        * @result Move on the gameBoard will not be made and the same player should be playing before and after the move
        */
	@Test
	public void testIllegaMove() {
		TicTacToe game = new TicTacToe();
		int prevPlayer = game.currentPlayer;
		game.playerMove(2,3);
		int afterMovePlayer = game.currentPlayer;
		assertEquals(prevPlayer, afterMovePlayer);
	}
	/**
        * Make a valid move and check who is playing
        * @result Move on the gameBoard will be made without any errors and now player O should be the current player
        */
	@Test
	public void testIfOneIsPlaying(){
		TicTacToe game = new TicTacToe();
		game.playerMove(1,1);
		assertEquals('O', game.isPlaying());
	}
	/**
        * Make 2 valid moves and check who is playing.
        * @result 2 moves on the gameBoard will be made without any errors and now player X should be the current player
        */
        @Test
        public void testIfTwoMoves(){
                TicTacToe game = new TicTacToe();
                game.playerMove(1,1);
		game.playerMove(2,2);
                assertEquals('X', game.isPlaying());
        }
        /**
        * Make no move and check who is playing
        * @result New game is constructed and X should be the first player
        */
	@Test
        public void testNoMovePlaying(){
                TicTacToe game = new TicTacToe();
                assertEquals('X', game.isPlaying());
        }
	/**
        * Make a winning game for X
        * @result Moves on the gameBoard will be made without any errors and it should result in X winning.
        */
	@Test
	public void testWhoWon(){
		TicTacToe game = new TicTacToe();
		game.playerMove(0,0);
		game.playerMove(1,1);
		game.playerMove(0,1);
		game.playerMove(1,2);
		game.playerMove(0,2);
		game.gameBoard.isWinner();
		assertEquals('X', game.gameBoard.winner);
	}
	
}	
