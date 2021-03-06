import java.util.*;
public class Hand{

    ArrayList<Card> cardsInHand;

    public Hand() {
        cardsInHand = new ArrayList<Card>();
    }

    public void addToHand(Card newCard) {
        cardsInHand.add(newCard);
    }

    public Card getCard(int newCard) {
        return cardsInHand.get(newCard);
    }

    public int getSize() {
        return cardsInHand.size();
    }

    public void returnAllCardsToDeck(Deck newDeck) {
        for (int i = cardsInHand.size(); i>0; i--) {
            newDeck.replaceCard(cardsInHand.get(i));
            cardsInHand.remove(cardsInHand.get(i));
        }
    }
}