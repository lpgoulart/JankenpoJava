//package projectjavadoc;

/** 
*	@author Leonardo Goulart
*	@version 1.0
*/

import java.util.Scanner;

public class Player {

	private Scanner scan = new Scanner ( System.in );
	private String playerName;
	private int playerChoice;
	private int matchesWon;

//---------------------------------------------------------------------
	Player () {
		System.out.println ( "Enter your name:" );
		this.playerName = scan.nextLine();
		this.playerChoice = 0;
		this.matchesWon = 0;
	}
//---------------------------------------------------------------------
	public void setPlayerChoice () {
		this.playerChoice = scan.nextInt();
	}
	public int getPlayerChoice () {
		return playerChoice;
	}

//---------------------------------------------------------------------
	public void setMatchesWon ( int victory ) {
		this.matchesWon += victory;
	}
	public int getMatchesWon () {
		return this.matchesWon;
	}

//---------------------------------------------------------------------

	public String getPlayerName () {
		return this.playerName; 
	}


}