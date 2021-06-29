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

    public Card(int suit, int val) {
        switch (suit) {
            case 0: 
            this.suit = Suit.HEARTS;
            break;

            case 1:
            this.suit = Suit.DIAMONDS;
            break;

            case 2:
            this.suit = Suit.SPADES;
            break;

            case 3:
            this.suit = Suit.CLUBS;
            break;
        }
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getName(int val, Suit suit) {
        if (val == 1) {
            return ("Ace of " + suit);
        } else if (val == 11) {
            return ("Jack of " + suit);
        } else if (val == 12) {
            return ("Queen of " + suit);
        } else if (val == 13) {
            return ("King of " + suit);
        } else {
            return (val + " of " + suit);
        }
    }

    
}
