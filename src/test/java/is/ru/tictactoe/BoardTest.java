package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static java.lang.System.out;

public class BoardTest{
	@Test
        public void IsTestFalse(){
		TicTacToe game = new TicTacToe();
		assertEquals(false,game.gameBoard.isLegal(3,3));
        } 
	@Test
        public void testIslegal(){
                TicTacToe game = new TicTacToe();
                assertEquals(true,game.gameBoard.isLegal(2,2));
        }
	@Test
        public void Islegal(){
                TicTacToe game = new TicTacToe();
                assertEquals(false,game.gameBoard.isLegal(5,3));
        }
	
	@Test
        public void testPrintBoard() {
                TicTacToe game = new TicTacToe();
                game.gameBoard.drawGameBoard();
                assertEquals(1,1);
        }


}
