/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:32:21 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Card;
import dominion.GameState;
import dominion.Player;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((GameState) null, ";*S2i8O82)");
      LinkedList<Card> linkedList0 = player0.deck;
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      gameState0.addPlayer(player0);
      GameState gameState1 = gameState0.clone();
      gameState1.addPlayer(player0);
      player0.hand = (List<Card>) linkedList0;
      // Undeclared exception!
      try { 
        gameState1.initializeGame();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      Integer integer0 = new Integer(3242);
      hashMap0.put((Card) null, integer0);
      gameState0.gameBoard = hashMap0;
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Card.Type.values();
      gameState0.toString();
      Player player0 = new Player(gameState0, "The board game is empty you need to intialize the game!!!!");
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      gameState0.cards = (List<Card>) arrayList0;
      gameState0.addPlayer((Player) null);
      gameState0.isGameOver();
      Player player0 = new Player(gameState0, "");
      player0.hand = gameState0.cards;
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.getWinners();
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap0;
      gameState0.cards = null;
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      gameState0.getWinners();
      gameState0.initializeGame();
      gameState0.players = null;
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        gameState0.addPlayer(player0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>();
      ArrayList<Card> arrayList0 = new ArrayList<Card>((Collection<? extends Card>) priorityQueue0);
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list0 = Card.filter(arrayList0, card_Type0);
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      Vector<Player> vector0 = new Vector<Player>(10);
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      Integer integer0 = new Integer(10);
      hashMap0.put((Card) null, integer0);
      player0.buyCard();
      hashMap0.put((Card) null, integer0);
      gameState0.players = (List<Player>) vector0;
      gameState0.isGameOver();
      gameState0.play();
      Card.Type.values();
      gameState0.initializeGame();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card card0 = Card.getCard(list0, card_CardName0);
      Integer integer0 = new Integer(3);
      hashMap0.put(card0, integer0);
      gameState0.getWinners();
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, ":)otr0W0L|vh0@,-h");
      // Undeclared exception!
      try { 
        gameState0.toString();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState0.isGameOver();
      Player player0 = new Player(gameState1, "Millisecond");
      gameState1.addPlayer(player0);
      gameState1.toString();
      player0.drawCard();
      gameState1.addPlayer(player0);
      gameState1.addPlayer(player0);
      gameState1.addPlayer(player0);
      gameState0.toString();
      // Undeclared exception!
      try { 
        gameState1.initializeGame();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.Type[] card_TypeArray0 = Card.Type.values();
      assertNotNull(card_TypeArray0);
  }
}
