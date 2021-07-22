import java.util.*;
public class Main{
    String[] args;
    public static void main(String[] args) {
        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        Deck newDeck = new Deck(deckOfCards);
        Card newCard;
        newDeck.shuffle();
        Hand newHand = new Hand();
        Hand dealerHand = new Hand();
        Boolean gameOn = true;
        Scanner hitOrStay = new Scanner(System.in);
        int total;
        int dealerTotal;
        
        System.out.println("Game Start.");
        System.out.println("You and the dealer draw two cards to start");

        newCard = newDeck.drawCard();
        System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
        newHand.addToHand(newCard);

        newCard = newDeck.drawCard();
        System.out.println("The dealer gets: " + newCard.getName(newCard.getVal(), newCard.getSuit()));
        dealerHand.addToHand(newCard);

        newCard = newDeck.drawCard();
        System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
        newHand.addToHand(newCard);

        newCard = newDeck.drawCard();
        System.out.println("The dealer gets: " + newCard.getName(newCard.getVal(), newCard.getSuit()));
        dealerHand.addToHand(newCard);

        total = (checkForBigNum(newHand.getCard(0).getVal()) + checkForBigNum(newHand.getCard(1).getVal()));
        System.out.println("Your total is " + total);

        dealerTotal = (checkForBigNum(dealerHand.getCard(0).getVal()) + checkForBigNum(dealerHand.getCard(1).getVal()));
        System.out.println("The dealer's total is: " + dealerTotal);

        while (gameOn == true) {
            System.out.println("Hit?\n\n1)Hit me\n2)Stay");
            int hit = hitOrStay.nextInt();
            switch (hit) {
                case 1:
                newCard = newDeck.drawCard();
                System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
                newHand.addToHand(newCard);

                if (dealerTotal <= 16) {
                    newCard = newDeck.drawCard();
                    System.out.println("The dealer gets: " + newCard.getName(newCard.getVal(), newCard.getSuit()));
                    dealerHand.addToHand(newCard);
                    dealerTotal = dealerTotal + checkForBigNum(newHand.getCard(dealerHand.getSize() - 1).getVal());
                }

                total = total + checkForBigNum(newHand.getCard(newHand.getSize() - 1).getVal());
                System.out.println("Your total is " + total);

                
                System.out.println("The dealer's total is " + dealerTotal);
                if (total > 21) {
                    System.out.println("You bust. Sorry 'bout your luck.");
                    gameOn = false;
                } else  if (dealerTotal > 21) {
                    System.out.println("The dealer busts, you win by default!");
                }

               
                break;

                case 2:
                
            }
        }
        
    }

    public static int checkForBigNum(int cardVal) {
        if (cardVal > 10) {
            return 10;
        } else {
            return cardVal;
        }
    }

    
}