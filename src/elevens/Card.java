package elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
        private int face;
        private String suit;
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

        public Card(String s, int f){
            face = f;
            suit = s;
        }
        
        public void setSuit(String s){
            suit = s;
        }
        public void setFace(int f){
            face = f;
        }
        
        public String getFace(){
            return FACES[face];
        }
        public String getSuit(){
            return suit;
        }
        
        public String toString(){
            return FACES[face] + " of " + suit;
        }
 }