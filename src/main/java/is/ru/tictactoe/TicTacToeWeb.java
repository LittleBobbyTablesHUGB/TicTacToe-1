package is.ru.tictactoe;
import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import is.ru.tictactoe.TicTacToe;

public class TicTacToeWeb implements SparkApplication{
	public static void main(String args[]) {
		staticFileLocation("/public");
		SparkApplication ttt = new TicTacToeWeb();
		String port = System.getenv("PORT");
		if(port != null){
			setPort(Integer.valueOf(port));
		}
		ttt.init();	
		//get("/random", (req, res) -> game.gameBoard.drawGameBoard());
	}

	private TicTacToe game;

	public void init(){
		if(game == null){
			game = new TicTacToe();
		}
		
		//get("/playTicTacToe", (req, res) -> "Player X:" + game.isPlaying());

		post("/playTicTacToe",new Route(){
			@Override
			public Object handle(Request request, Response response) {
				game = new TicTacToe();
				return true;
			}
		});

		/*post(new Route("/id"){
			@Override
			public Object handle(Request request, Response response) {
				Integer number = Integer.valueOf(request.queryParams("id"));

				if(game.gameBoard.isDraw()){
					return 2; //TODO change
				}
				else if(game.gameBoard.isWinner()){
					return 1; //TOdo change
				}
			}
		});*/

	}
}
