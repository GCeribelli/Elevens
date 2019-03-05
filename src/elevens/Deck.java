package elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Deck{
    
//make a Deck class

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

        public Deck(){
            cards = new ArrayList<Card>(52);
            for(int i = 0; i < SUITS.length; i++){
                for(int n = 1; n <= 13; n++){
                     cards.add(new BlackJackCard(SUITS[i], n));
                }
            }
        }
//make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   public String dealCard(){
       String a;
            a = cards.get(0).toString();
       cards.add(cards.get(0));
       cards.remove(0);
       return a;
   }
   public void shuffle(){
       Collections.shuffle(cards);
       //top = cards.get(0).toString();
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 

}