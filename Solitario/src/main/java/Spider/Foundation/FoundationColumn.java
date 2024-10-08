package Spider.Foundation;

import Card.Card;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FoundationColumn implements Serializable {

    // Attributes
    private final List<Card> cards;

    // Constructor
    public FoundationColumn() {
        cards = new LinkedList<>();
    }

    // Methods
    public void assignCards(Card[] cardsArray) {
        cards.addAll(Arrays.asList(cardsArray));
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card peek() {
        return cards.get(cards.size() - 1);
    }
}