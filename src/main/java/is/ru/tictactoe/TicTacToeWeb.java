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
	}

	private TicTacToe game;

	public void init(){
		if(game == null){
			game = new TicTacToe();
		}
		

		post("/id",new Route(){
			@Override
			public Object handle(Request request, Response response) {
				Integer number = Integer.valueOf(request.queryParams("id"));

				if(number == 1){
					game.playerMove(0,0);
				}
				else if(number == 2){
					game.playerMove(0,1);
				}
				else if(number == 3){
					game.playerMove(0,2);
				}
				else if(number == 4){
					game.playerMove(1,0);				
				}
				else if(number == 5){
					game.playerMove(1,1);
				}
				else if(number == 6){
					game.playerMove(1,2);
				}
				else if(number == 7){
					game.playerMove(2,0);	
				}
				else if(number == 8){
					game.playerMove(2,1);	
				}
				else if(number == 9){
					game.playerMove(2,2);
				}
				return game.isPlaying();
			}
		});

	}
}
