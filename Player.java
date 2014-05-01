//Jack Hurley
//CS110
//4-28-14
//Assignment 10
//War Card Game.
//Player class

import java.util.ArrayList;

/**
   This class defines the atributes and methods of a player in the card game of War. The player has 
   serveral stacks. The first will hold the player's deck of cards. The second will hold the cards 
   in play on this players side of the field. The third will hold the discarded cards. 
   
*/

public class Player
{
   //Initialize an arraylist varraible.
   ArrayList<Card> playerDeck;
   
   /**
      Default constructor.
   */
   public Player()
   {
      
      playerDeck = new ArrayList<Card>();
   }
   
   /**
      Accepts the main Deck object and stores the first half of the card objects in it's own arrayList.
      @param gameDeck the  
   */
   public void addCards(Deck gameDeck)
   {
      for (int i=0; i < 26; i++)
      {
         playerDeck.add(gameDeck.dealCard());
      }
   }
   
   public void addCards(Cards warDeck)
   {
      while (!warDeck.isEmpty())
      {
         playerDeck.add(playerDeck.size(), warDeck.dealCard());
      }
   }
   
   
   
}