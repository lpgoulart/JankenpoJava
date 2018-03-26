//package projectjavadoc;

/** 
*	@author Leonardo Goulart
*	@version 1.0
*/

import java.util.Random;

public class MachineAI {
	 
	private String name;
	private int machineChoice;
	private int matchesWon;

//---------------------------------------------------------------------
	 MachineAI () {
	 	this.name = "Janken Machine";
		this.machineChoice = 0;	 
		this.matchesWon = 0;
	}


//---------------------------------------------------------------------
	public void setMachineChoice () {
		Random rand = new Random ();
		do {
			this.machineChoice = rand.nextInt (4);
		}while (this.machineChoice == 0 );
	}
	public int getMachineChoice () {
		return this.machineChoice;
	}

	public void setMatchesWon ( int victory ) {
		this.matchesWon += victory;
	}
	public int getMatchesWon () {
		return this.matchesWon;
	}
//---------------------------------------------------------------------


	public String getMachineName () {
	 	return this.name;
	}

//---------------------------------------------------------------------

}