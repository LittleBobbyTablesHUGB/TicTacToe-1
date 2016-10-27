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
	
	@Test
	public void TestWinner() {
		TicTacToe game = new TicTacToe();
		assertEquals(false,game.gameBoard.isWinner());
	}
	
	@Test
	public void TestWinner1() {
		TicTacToe game = new TicTacToe();
		game.playerMove(0,0);
		game.playerMove(1,1);
		game.playerMove(0,1);
		game.playerMove(2,2);
		game.playerMove(0,2);
		assertEquals(true,game.gameBoard.isWinner());	
	}
        @Test
        public void TestWinner2() {
                TicTacToe game = new TicTacToe();
                game.playerMove(0,0);
                game.playerMove(1,0);
                game.playerMove(1,1);
                game.playerMove(1,2);
                game.playerMove(2,2);
                assertEquals(true,game.gameBoard.isWinner());
        }

	@Test
        public void TestWinner3() {
                TicTacToe game = new TicTacToe();
                game.playerMove(0,0);
                game.playerMove(1,0);
                game.playerMove(1,1);
                game.playerMove(1,2);
                game.playerMove(2,2);
                assertEquals(true,game.gameBoard.isWinner());
        }

    	@Test
        public void TestWinner4() {
                TicTacToe game = new TicTacToe();
		game.playerMove(2,0);
                game.playerMove(1,0);
                game.playerMove(2,1);
                game.playerMove(1,1);
                game.playerMove(2,2);
                assertEquals(true,game.gameBoard.isWinner());
	}

   	@Test
        public void TestWinner5() {
                TicTacToe game = new TicTacToe();
                game.playerMove(0,1);
                game.playerMove(0,2);
                game.playerMove(2,1);
                game.playerMove(1,1);
                game.playerMove(1,2);
		game.playerMove(2,0);
		assertEquals(true,game.gameBoard.isWinner());
        }

	@Test
        public void testIsDrawTrue() {
                TicTacToe game = new TicTacToe();

                game.playerMove(1,0);
                game.playerMove(2,1);
                game.playerMove(2,2);
                game.playerMove(0,2);
                game.playerMove(2,0);
                game.playerMove(1,2);
                game.playerMove(0,1);
                game.playerMove(0,0);
                game.playerMove(1,1);

                assertEquals(true, game.gameBoard.isDraw());
        }

         @Test
        public void testIsDrawFalse() {
                TicTacToe game = new TicTacToe();

                game.playerMove(0,0);
                game.playerMove(0,1);
                game.playerMove(2,2);
                game.playerMove(0,2);
                game.playerMove(1,0);
                game.playerMove(2,0);
                game.playerMove(1,2);
                game.playerMove(2,1);           
                assertEquals(false, game.gameBoard.isDraw());
        }	

}
