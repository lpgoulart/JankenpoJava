//package projectjavadoc;

/** 
*	@author Leonardo Goulart
*	@version 1.0
*/

public class Main {
	static public void main ( String args[] ) {
		Player player = new Player ();
		Jankenpo game = new Jankenpo ();
		MachineAI ai = new MachineAI ();

		game.startGame ( player.getPlayerName(), ai.getMachineName() );

		while ( game.getMatchCount() <= game.getNumberOfMatches() ) {
			
			game.updateGame ( game.getMatchCount (), player, ai );

			game.setMatchCount (1);
		}

		game.endGame ( player, ai );
	}
}