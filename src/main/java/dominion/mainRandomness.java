package dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;


// import dominion.Card.java;
// import dominion.dominion.java;
// import dominion.GameState.java;
// import dominion.mainPlayer.java;
// import dominion.mainCard.java;
// import dominion.Player.java;
// import dominion.Randomness.java;

public class mainRandomness {

	   public  static void main(String args[]){

				Randomness.reset(10);

				for(int i=0;i<=10;i++)
					System.out.print(" rand number is: "+ Randomness.nextRandomInt(10));


			System.exit(0);

	   }


}
