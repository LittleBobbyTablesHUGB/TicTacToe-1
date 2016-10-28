package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToeWeb {
	public static void main(String args[]) {
		TicTacToe game = new TicTacToe();
		get("/random", (req, res) -> "hi");//game.gameBoard.drawGameBoard());
	}
}
