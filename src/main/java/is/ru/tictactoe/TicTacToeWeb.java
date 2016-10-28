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
		
		 post("/playGame",new Route() {
            		@Override
            		public Object handle(Request request, Response response) {
                		game = new TicTacToe();
                		return true;
            		}
		});		

		post("/id",new Route(){
			@Override
			public Object handle(Request request, Response response) {
				Integer number = Integer.valueOf(request.queryParams("id"));
				char prevPlayer = game.isPlaying();
				if(!game.gameBoard.isWinner() && !game.gameBoard.isDraw()){
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
				}
				if(game.gameBoard.isDraw()){
					if(game.isPlaying() == 'X'){
						return "0";
					}
					else{
						return "3";
					}
				}
				else if(game.gameBoard.isWinner()){
					if(game.gameBoard.winner == 'X'){
						return "1";
					}
					return 2;
				}
				return prevPlayer;
			}
		});

	}
}
