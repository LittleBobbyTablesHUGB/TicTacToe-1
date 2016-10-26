package is.ru.tictactoe;

import java.io.*;
import static java.lang.System.out;
import java.util.*;

public class Playing
{
	public Playing()
	{
		
	}
		
	public void startGame(){
		try{
			System.out.println("Ready to play TicTacToe ?");
			char input = (char) System.in.read();
		
		if (input == 'Y' || input == 'y'){
			throw new Exception();
			//TODO:playing();
		}

		else{
			startGame();
		}
		}	
		catch (Exception e){
			System.out.println("Eception has been caught");
		} 
	}

}

