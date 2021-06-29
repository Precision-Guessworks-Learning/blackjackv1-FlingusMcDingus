import java.util.ArrayList;

public class Deck {

    Card newCard;
    ArrayList<Card> newDeck;

    public Deck() {
        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                newCard = new Card(0, j);
                newDeck.add(newCard);
            }

            for (int j=0; j<13; j++) {
                newCard = new Card(1, j);
                newDeck.add(newCard);
            }

            for (int j=0; j<13; j++) {
                newCard = new Card(2, j);
                newDeck.add(newCard);
            }

            for (int j=0; j<13; j++) {
                newCard = new Card(3, j);
                newDeck.add(newCard);
            }
        }
    }
}