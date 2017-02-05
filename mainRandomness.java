// package Dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;


import Dominion.Card.java;
import Dominion.dominion.java;
import Dominion.GameState.java;
import Dominion.mainPlayer.java;
import Dominion.mainCard.java;
import Dominion.Player.java;
import Dominion.Randomness.java;

public class mainRandomness {

	   public  static void main(String args[]){

				Randomness.reset(10);

				for(int i=0;i<=10;i++)
					System.out.print(" rand number is: "+ Randomness.nextRandomInt(10));


			System.exit(0);

	   }


}
