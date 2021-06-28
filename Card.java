public class Card {
    Suit suit;
    int val;

    enum Suit {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS
    }

    public Card(Suit suit, int val) {
        this.suit = suit;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public Suit getSuit() {
        return suit;
    }

    public void getName() {
        System.out.println("This is a " + );
    }

    
}
