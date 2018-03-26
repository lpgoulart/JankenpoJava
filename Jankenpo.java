//package projectjavadoc;

/** 
*	@author Leonardo Goulart
*	@version 1.0
*	@file Jankenpo file
*/

import java.util.Scanner;

public class Jankenpo {

	private Scanner scan = new Scanner ( System.in );
	private int numberOfMatches;
	private int matchCount;

	Jankenpo () {
		System.out.println ( "Number of matches: " );
		numberOfMatches = scan.nextInt();
		this.matchCount = 1;
	}

//---------------------------------------------------------------------
	public void setMatchCount (int newGame ) {
		this.matchCount += newGame;
	}

	public int getNumberOfMatches () {
		return this.numberOfMatches;
	}
	public int getMatchCount () {
		return this.matchCount;
	}

//---------------------------------------------------------------------
	public void startGame ( String player, String machine ) {
		System.out.println ( "New game started: " );
		System.out.println ( player + " vs " + machine );
	}

//---------------------------------------------------------------------

	public void match ( Player player, MachineAI ai ) {
		if ( player.getPlayerChoice() == 1 ) {
			if ( ai.getMachineChoice() == 1 ) {
				System.out.println ( "it's a tie" );
			}
			else if ( ai.getMachineChoice() == 2 ) {
				System.out.println ( "You lost the match" );
				ai.setMatchesWon (1);
			}
			else {
				System.out.println ( "You own the match" );
				player.setMatchesWon (1);
			}
		} 
		else if ( player.getPlayerChoice() == 2 ) {
				if ( ai.getMachineChoice() == 1 ) {
					System.out.println ( "You own the match" );
					player.setMatchesWon (1);
				}
				else if ( ai.getMachineChoice() == 2 ) {
					System.out.println ( "it's a tie" );
				}
				else {
					System.out.println ( "You lost the match" );
					ai.setMatchesWon (1);
				}
		}
		else if ( player.getPlayerChoice() == 3 ) {
				if ( ai.getMachineChoice() == 1 ) {
					System.out.println ( "You lost the match" );
					ai.setMatchesWon (1);
				}
				else if ( ai.getMachineChoice() == 2 ) {
					System.out.println ( "You own the match" );
					player.setMatchesWon (1);
				}
				else {
					System.out.println ( "it's a tie" );
				}
		}
	}


//---------------------------------------------------------------------
	public void updateGame ( int nGame, Player player, MachineAI ai ) {
		System.out.println ( "Match n." + nGame );
		System.out.println ( "Choose:" );
		System.out.println ( "(1) Rock ");
		System.out.println ( "(2) Paper ");
		System.out.println ( "(3) Scissor ");

		player.setPlayerChoice ();
		ai.setMachineChoice ();

		match ( player, ai );
		System.out.println ("\n");
	}

//---------------------------------------------------------------------
	public void endGame ( Player player, MachineAI ai ) {
		if ( player.getMatchesWon() > ai.getMatchesWon() ) {
			System.out.println ( "-------Congrats-------\n---You won the game---" );
			System.out.println ( player.getPlayerName() + " victories: " + player.getMatchesWon() );
		}
		else if ( player.getMatchesWon() < ai.getMatchesWon() ) {
			System.out.println ( "---------Sorry---------\n---You lost the game---" );
			System.out.println ( ai.getMachineName() + " victories: " + ai.getMatchesWon() );
		}
		else  {
			System.out.println ( "---It's a tie---" );
			System.out.println ( player.getPlayerName() + " victories: " + player.getMatchesWon() );
			System.out.println ( ai.getMachineName() + " victories: " + ai.getMatchesWon() );
		}
	}
}