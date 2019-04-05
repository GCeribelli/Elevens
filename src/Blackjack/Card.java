package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	
	public Card(int cardRank, String cardSuit) {
		face = cardRank;
		suit = cardSuit;
	}
        public Card() {
		face = 0;
		suit = "";
	}



	// modifiers
        public void setSuit(String s){
            suit = s;
        }
        public void setFace(int f){
            face = f;
        }

 

  	//accessors
        public String suit() {
		return suit;
	}
        public int face() {
		return face;
	}

        

  	public abstract int getValue();

	public boolean equals(Card obj)
	{
            if(obj.suit() == this.suit() && obj.face() == this.face())
                return true;
            else 
                return false;
	}

  	//toString
  	public String toString(){
            return FACES[face] + " of " + suit + "| value = " + getValue();
        }
 }