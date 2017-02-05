// package Dominion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import Dominion.Card.java;
import Dominion.dominion.java;
import Dominion.GameState.java;
import Dominion.mainPlayer.java;
import Dominion.Player.java;
import Dominion.Randomness.java;
import Dominion.mainRandomness.java;

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
