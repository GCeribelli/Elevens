package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import Blackjack.Card;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand = new ArrayList<Card>();
   private int winCount;

   //constructors
   public AbstractPlayer(){}
   public  void addCardToHand( Card temp )
   {
       hand.add(temp);

   }

   public  void resetHand( )
   {
       /*int i = getHandSize();
       for(int n = 0; n < i; n++)
           hand.remove(n);
               */
       hand.clear();
   }

   public  void setWinCount( int numwins )
   {
       winCount = numwins;

   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
		//great example of polymorphism
      int total=0;
      for(Card c : hand)
          total += c.getValue();
      return total;
   }

   public String toString()
   {
      return "hand = " + hand.toString() + " \n-  # wins " + getWinCount();
   }
}