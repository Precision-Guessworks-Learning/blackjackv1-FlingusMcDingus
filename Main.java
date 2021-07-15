import java.util.*;
public class Main{
    String[] args;
    public static void main(String[] args) {
        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        Deck newDeck = new Deck(deckOfCards);
        Card newCard;
        newDeck.shuffle();
        Hand newHand = new Hand();
        Boolean gameOn = true;
        Scanner hitOrStay = new Scanner(System.in);
        
        System.out.println("Game Start.");
        System.out.println("You draw two cards to start");

        newCard = newDeck.drawCard();
        System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
        int firstVal = checkForBigNum(newCard);
        //firstVal = checkForAce(firstVal);
        
        newCard = newDeck.drawCard();
        System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
        int newVal = checkForBigNum(newCard);

        System.out.println("Your total is " + (firstVal + newVal));
        firstVal = firstVal + newVal;
        System.out.println(firstVal);

        while (gameOn == true) {
            System.out.println("Hit?\n\n1)Hit me\n2)Stay");
            int hit = hitOrStay.nextInt();
            switch (hit) {
                case 1:
                newCard = newDeck.drawCard();
                System.out.println(newCard.getName(newCard.getVal(), newCard.getSuit()));
                int newValTwo = checkForBigNum(newCard);
                System.out.println("Your total is " + (firstVal + newValTwo));
                firstVal = firstVal + newValTwo;
            }
        }
        
    }

    public static int checkForBigNum(Card checkCard) {
        int cardVal = checkCard.getVal();
        if (cardVal > 10) {
            return 10;
        } else {
            return cardVal;
        }
    }

    /*public static int checkForAce(int checkCard) {
        Scanner k = new Scanner(System.in);
        if (checkCard == 1) {
            System.out.println("You got an Ace. Is it worth one, or ten?");
            int val = k.nextInt();
            while (val != 1 || val != 10) {
                System.out.println("");
            }
            return val;
        }
    }*/
}