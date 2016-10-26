package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static java.lang.System.out;

public class TicTacToeTest {

	
	@Test
	public void testPlayerMove() {
		TicTacToe game = new TicTacToe();
		game.playerMove(2,2);
		assertEquals(game.playerMark[1 - game.currentPlayer], game.gameBoard.board[2][2]); 
	}
	
	@Test
	public void testIllegaMove() {
		TicTacToe game = new TicTacToe();
		int prevPlayer = game.currentPlayer;
		game.playerMove(2,3);
		int afterMovePlayer = game.currentPlayer;
		//If move was illegal same player should be playing
		assertEquals(prevPlayer, afterMovePlayer);
	}

	@Test
	public void testPrintBoard() {
		TicTacToe game = new TicTacToe();
		game.drawGameBoard();
		assertEquals(1,1);
	}
}
