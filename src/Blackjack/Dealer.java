package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Dealer extends AbstractPlayer{

//define Dealer class here
	
	
	
	Deck deck = new Deck();
	//instance variable - Deck 
        public Dealer(){ super();}

        public void shuffle(){
            deck.shuffle();
        }

        public Card deal(){
            return deck.nextCard();
        }

        public boolean hit(){
            return true;
        }   
}