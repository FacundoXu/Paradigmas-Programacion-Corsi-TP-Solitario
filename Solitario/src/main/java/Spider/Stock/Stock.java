package Spider.Stock;

import Card.Card;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock implements Serializable {

    // Attributes
    private final List<Card> cards;
    private int size;

    // Constructor
    public Stock(Card[] cardsArray) {
        cards = new ArrayList<>(Arrays.asList(cardsArray));
        size = cards.size();
    }

    // Methods
    public Card drawCard() {
        if (cards.isEmpty())
            return null;
        size--;
        return cards.remove(size);
    }

    public int size() {
        return size;
    }
}