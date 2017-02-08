package dominion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// import dominion.Card.java;
// import dominion.dominion.java;
// import dominion.GameState.java;
// import dominion.mainPlayer.java;
// import dominion.Player.java;
// import dominion.Randomness.java;
// import dominion.mainRandomness.java;

public class mainCard {
	public  static void main(String args[]){

		List<Card> cards=new LinkedList<Card>();
		//the cards  are achieved by each element/constant in the enum class
		cards = new ArrayList<Card>(Card.createCards());

		for(Card card:cards)
			System.out.println(card.toString());

		for(Card card:cards)
			card.play(null,null);
		System.exit(0);
	}

}
