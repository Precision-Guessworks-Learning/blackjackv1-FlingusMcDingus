# BlackjackV1
A Template for Blackjack creation

## This is a test commit of this repo

## Card Object
When a card object is created it is assigned a value and a suit. Once the program understands what both of those are, it can give back a name for it. For example, a card with the value of 1 and the Diamonds suit would return as an Ace of Diamonds.

## Deck Object
Functions:

    drawCard function: Removes one unique card from the deck to be used elsewhere.

    replaceCard function: Gives back a card to the deck. Possibly to be drawn again.

    shuffleDeck function: Randomizes the order that cards may appear from the drawCard funtion.

Stems from an ArrayList of 52 unique cards.

## Hand Object
Needs to be able to contain any number of cards.
Needs to be able to get the value of its hand.
Needs to be able to accept cards.
Needs to be able to return all cards at once.