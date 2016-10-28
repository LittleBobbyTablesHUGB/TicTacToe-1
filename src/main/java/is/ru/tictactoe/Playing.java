package is.ru.tictactoe;

import java.io.*;
import static java.lang.System.out;
import java.util.*;
import java.util.Scanner;

public class Playing
{

        public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
        startGame();
        }
        public static void play(){

               TicTacToe game = new TicTacToe();

                while(!game.gameBoard.isWinner() && !game.gameBoard.isDraw()){
			game.gameBoard.drawBoardNumbers();
                        game.gameBoard.drawGameBoard();
                        char whoIsPlaying = game.isPlaying();
                        System.out.println("Player " + whoIsPlaying + " is playing, please type in 2 numbers to make a move: ");
                        //Get move from current player

                        int inputRow = sc.nextInt();
                        int inputCol = sc.nextInt();
                        //Make the move for the player
                        game.playerMove(inputRow, inputCol);
                }
                if(game.gameBoard.isDraw())
                {       
                        game.gameBoard.drawGameBoard();
                        System.out.println("There was a draw!");
                }
                else if(game.gameBoard.isWinner())
                {     
                        game.gameBoard.drawGameBoard();
                        System.out.println("The winner is: " + game.gameBoard.winner);
                }
                startGame();
        }


        public static void startGame(){
                System.out.println("Do you want to play TicTacToe? y/ to play or q/ to quit the game");
                char startPlay= sc.next().toLowerCase().charAt(0);
                if (startPlay == 'y'){
                        play();
                }

                else if (startPlay == 'q'){

                    	System.out.println("Thank you and see you soon ");
                }
		else{
			startGame();
		}
        }

}

