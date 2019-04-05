package Blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack {
    //add in Player instance variable
    //add in Dealer instance variable

    private Player player = new Player();
    private Dealer dealer = new Dealer();

    public BlackJack() {
        dealer.shuffle();
        player.setWinCount(0);
        dealer.setWinCount(0);
        player.resetHand();
        dealer.resetHand();
    }
    public void print(int playerTotal, int dealerTotal){
        out.println("\nPLAYER ");
        if(aceTest())
            out.println("Hand Value :: " + acePrint());
        else
            out.println("Hand Value :: " + player.getHandValue());
        out.println("Hand Size :: " + player.getHandSize());
        out.println("Cards in Hand :: " + player.toString());
        out.println("\nDEALER ");
        out.println("Hand Value :: " + dealerTotal);
        out.println("Hand Size :: " + dealer.getHandSize());
        out.println("Cards in Hand :: " + dealer.toString());
    }
    public void playGame() {
        Scanner keyboard = new Scanner(System.in);
        String z = "";
        while(!(z.equals("no"))){
        dealer.shuffle();
        player.addCardToHand(dealer.deal());
        player.addCardToHand(dealer.deal());
        dealer.addCardToHand(dealer.deal());
        Card dealerCard2 = dealer.deal();
        
        char choice = 0;
        boolean hs = true;
        boolean bust = false;
        int playerTotal = player.getHandValue();
        int dealerTotal = dealer.getHandValue();
        do {
            print(playerTotal, dealerTotal);
            out.println("The dealer has one more hidden card.");

            out.println("Do you wish to hit or stay? (h/s)");
            String a = keyboard.next().substring(0, 1);
            keyboard.nextLine();
            while (!(a.equals("h")) && !(a.equals("s"))) {
                out.println(a);
                out.println("Please type h or s");
                out.println("Do you wish to hit or stay? (h/s)");
                a = keyboard.next().substring(0, 1);
                keyboard.nextLine();
            }
            if (a.equals("h")) {
                player.addCardToHand(dealer.deal());
                if (player.getHandValue() > 21) {
                    hs = false;
                }
            } else {
                hs = false;
            }
            playerTotal = player.getHandValue();
        } while (hs);
        if (player.getHandValue() > 21) {
            bust = true;
        }
        dealer.addCardToHand(dealerCard2);
        dealerTotal = dealer.getHandValue();
        print(playerTotal, dealerTotal);
        while (dealerTotal < 17 && !(bust)) {
            dealer.addCardToHand(dealer.deal());
            dealerTotal = dealer.getHandValue();
            print(playerTotal, dealerTotal);
        }
        if (bust) {
            out.println("You bust and you LOSE!");
            dealer.setWinCount(dealer.getWinCount() + 1);
        }else if (dealer.getHandValue() > 21) {
            out.println("Dealer busts and you WIN!");
            player.setWinCount(player.getWinCount() + 1);
        }else if(dealer.getHandValue() == player.getHandValue() || (dealer.getHandValue() == player.getHandValue() + 10 && player.getHandValue() + 10 < 21)){
            out.println("You DRAW!");
        }else if (dealer.getHandValue() < player.getHandValue() || (dealer.getHandValue() < player.getHandValue() + 10 && player.getHandValue() + 10 < 21)) {
            out.println("You have a better hand than the dealer so you WIN!");
            player.setWinCount(player.getWinCount() + 1);
        }else if (dealer.getHandValue() > player.getHandValue() || (dealer.getHandValue() > player.getHandValue() + 10 && player.getHandValue() + 10 < 21)) {
            out.println("The dealer has a better hand than you so you LOSE!");
            dealer.setWinCount(dealer.getWinCount() + 1);
        }else{}
        out.print("\nDo you wish to play again? ");
        z = keyboard.next();
        player.resetHand();
        dealer.resetHand();
        }

    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BlackJack game = new BlackJack();
        game.playGame();
    }
    public String acePrint(){
        int aceHand = player.getHandValue() + 10;
        return player.getHandValue() + " or " + aceHand;
    }
    public boolean aceTest(){
        return player.toString().contains("ACE");
    }
}
