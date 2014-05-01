//Jack Hurley
//CS110
//4-28-14
//Assignment 10
//War Card Game.
//War class

import java.util.*;
import java.random.*;
import javex.swing.JOptionPane;

public class War
{
   public static void main(String[] args)
   {
      //Variables
      Card card1;
      Card card2;
      Deck winner;
      boolean play=true;
      
      //Create the starting deck of 52 cards
      Deck gameDeck = new Deck();
      
      //warDeck ArrayList
      ArrayList<Card> warArray = new ArrayList<Card>();
      
      //Create two player decks
      Player player1 = new Player();
      Player player2 = new Player();
      
      //Spilt the deck into two player decks
      player1.addCards(gameDeck);
      player2.addCards(gameDeck);
      
            
      //LET'S PLAY WAR! So long as all these conditions hold true.
      while (play == true && !player1.isEmpty() && !player2.isEmpty())
      {
         //Get user input.
         UserChoice = JOptionPane.ShowMessageDialoge(null, "Woul you like to play? (Enter 'y' to play " +
                                    "or enter 'n' to exit): ")
         
         //Each player draws a card.
         card1 = player1.dealCard();
         card2 = player2.dealCard();

         //If statement: compares the drawn cards to see who wins the
         
         //If card1 is greater, player1 wins the round & gets the war deck.
         if (card1.getRank() > card2.getRank())
         {
            warArray.add(card1);
            warArray.add(card2);
            
            player1.addCards(warArray);
         }
         //If card2 is greater, player2 wins the round & gets the war deck.
         else if (card1.getRank() < card2.getRink())
         {  
            warArray.add(card1);
            warArray.add(card2);
            
            player2.addCards(warArray);
         }
         
         else if (card1.getRank() == card2.getRank()))
         {
            warArray.add(card1);
            warArray.add(card2);
            
            warArray.add(player1.drawCard());
            warArray.add(player2.drawCard());
         }
         
      }
   }
}