package com.teachmeskills.lesson10.task1.service;

import com.teachmeskills.lesson10.task1.card.Card;

public class CheckCard {
    public static void checkSameCards(Card[] cards) {
        if (cards.length == 0) {
            System.out.println("Client do not have cards.");
            return;
        }

        int sameCardCounter = 0;
        int sameCards = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].equals(cards[j])) {
                    sameCardCounter++;
                    Card cardSwap = null;
                    int k = i + sameCardCounter;
                    cardSwap = cards[j];
                    cards[j] = cards[k];
                    cards[k] = cardSwap;
                }
            }
            i += sameCardCounter;
            sameCards += sameCardCounter;

            if (sameCardCounter != 0) {
                System.out.println("Client have " + (sameCardCounter + 1) + " same cards with number " +
                        cards[i - sameCardCounter].getCardNumber() + ".");
                return;
            }
        }
        if (sameCards == 0) {
            System.out.println("Client do not have same cards.");
        } else {
            System.out.println("Client have " + (sameCards * 2) + " same cards");
        }
    }
}



