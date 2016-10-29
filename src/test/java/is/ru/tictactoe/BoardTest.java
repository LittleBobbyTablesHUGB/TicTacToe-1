package is.ru.tictactoe;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static java.lang.System.out;

public class BoardTest{
	/**
 	* Test if a move is legal
 	* @result Should get that the move (3,3) is not legal
 	*/
	@Test
        public void IsTestFalse(){
		TicTacToe game = new TicTacToe();
		assertEquals(false,game.gameBoard.isLegal(3,3));
        } 
	/**
        * Test if a move is legal
        * @result Should get that the move (2,2) is legal since it is within the board
        */
	@Test
        public void testIslegal(){
                TicTacToe game = new TicTacToe();
                assertEquals(true,game.gameBoard.isLegal(2,2));
        }
	/**
        * Test if a move is legal
        * @result Should get that the move (5,3) is not legal
        */
	@Test
        public void Islegal(){
                TicTacToe game = new TicTacToe();
                assertEquals(false,game.gameBoard.isLegal(5,3));
      	}
	/**
        * Test if a there is a winner just after a game has been initialized
        * @result Should return that there is no winner since no move have been made on the board
        */
	@Test
	public void TestWinner() {
		TicTacToe game = new TicTacToe();
		assertEquals(false,game.gameBoard.isWinner());
	}
	/**
        * Test if there is a winner when X has made 3 moves that should result in a win
        * @result Should return that there is in fact a winner
        */
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
	/**
        * Test if there is a winner when X has made 3 moves that should result in a win
        * @result Should return that there is in fact a winner
        */
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
	/**
        * Test if there is a winner when X has made 3 moves that should result in a win
        * @result Should return that there is in fact a winner
        */
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
	/**
        * Test if there is a winner when X has made 3 moves that should result in a win
        * @result Should return that there is in fact a winner
        */
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
	/**
        * Test if there is a winner when O has made 3 moves that should result in a win
        * @result Should return that there is in fact a winner
        */
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
	/**
        * Test if there is a draw in the game
        * @result Should return that there is a draw in the game since the board is full and neither had a winning game
        */
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
	/**
        * Test if there is a draw in the game
        * @result Should return that there is not a draw
        */
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
