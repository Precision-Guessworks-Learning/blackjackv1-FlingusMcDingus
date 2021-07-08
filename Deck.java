import java.util.ArrayList;
import java.util.*;

public class Deck {

    Card newCard;
    static ArrayList<Card> newDeck = new ArrayList<Card>();

    public Deck(ArrayList<Card> fillDeck) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                newCard = new Card(i, j);
                newDeck.add(newCard);
            }
        }
    }

    public Card drawCard() {
        if (newDeck.size() != 0) {
            Card drawnCard = newDeck.get(0);
            newDeck.remove(0);
            return drawnCard;
        }
        return null;
    }

    public void replaceCard(Card replacementCard) {
        newDeck.add(replacementCard);
    }

    public void shuffle() {
        Random rand = new Random();
        Collections.shuffle(newDeck, rand);
    }
}
