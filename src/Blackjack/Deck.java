package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		stackOfCards = new ArrayList<Card>(52);
                for(int i = 0; i < SUITS.length; i++){
                for(int n = 1; n <= 13; n++){
                     stackOfCards.add(new BlackJackCard(n, SUITS[i]));
                }
                setTCI(size());
            }
		
	}

	//modifiers
        public void setTCI(int i){
            topCardIndex = i;
        }public int getTCI(){
            return topCardIndex;
        }
        public void shuffle ()
	{
		Collections.shuffle(stackOfCards);
                setTCI(size());
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return getTCI();
	}

	public Card nextCard()
	{
                setTCI(topCardIndex-1);
		return stackOfCards.get(getTCI());
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}