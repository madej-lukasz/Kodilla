package com.kodilla;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

public class Hand {
    private int total;
    private int soft;
    private List<Card> hand = new ArrayList<>();

    public void addCard(Card card) {
        total += card.getValue();
        if (card.getRank() == Rank.ACE) {
            soft += 1;
        }
        if (soft > 0 && total > 21) {
            total -= 10;
            soft -= 1;
        }
        hand.add(card);
    }

    public void discardHand() {
        hand.clear();
        total = 0;
        soft = 0;
    }

    public int getSoft() {
        return soft;
    }

    public int evaluateHand() {
        return total;
    }

    @Override
    public String toString() {
        return hand.toString();
    }
}