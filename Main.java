import java.util.*;
public class Main{
    String[] args;
    public static void main(String[] args) {
        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        Deck newDeck = new Deck(deckOfCards);
        newDeck.shuffle();

        for (int i =0; i<53; i++) {
            Card drawnCard = newDeck.drawCard();
            if (drawnCard != null) {
                System.out.println(drawnCard.getName(drawnCard.getVal(), drawnCard.getSuit()));
            } else {
                System.out.println("There are no cards to draw");
            }
        }
    }
}