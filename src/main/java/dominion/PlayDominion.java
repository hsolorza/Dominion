package dominion;

import java.util.ArrayList;
import java.util.HashMap;
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
// import dominion.mainRandomness.java;


public class PlayDominion {

	   public  static void main(String args[]){

		    List<Card> cards;
		    GameState state;
			Randomness.reset(10);


			//the cards  are achieved by each element/constant in the enum class
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
//			 System.out.println("Initialization dominionBoard:\n " + state.toString());

		      Player player = new Player(state, "player-1");
//		      player.printStateGame();
		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		      state.addPlayer(player);
		       player = new Player(state, "player-2");
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		         player.hand.add(Card.getCard(cards,Card.CardName.Village));
		      state.addPlayer(player);
		      //Initialize the game!
		      state.initializeGame();

		      System.out.println("Initialization dominionBoard:\n " + state.toString());

		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");

		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+winners.get(p) + " , Score: "+ winners.get(p) );
		      }

	//	      player.printStateGame();


			System.exit(0);

	   }


}
