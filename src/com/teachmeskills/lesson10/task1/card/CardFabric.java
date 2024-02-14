package com.teachmeskills.lesson10.task1.card;

public class CardFabric {
    public static Card[] createCard(){
        Card card1 = new Card(111,111_222_333, 100.00);
        Card card2 = new Card(222,222_333_444, 123.53);
        Card card3 = new Card(111,111_222_333, 1000.50);
        Card card4 = new Card(333,111_222_333, 0);
        Card card5 = new Card(123,123_123_123, 500.00);
        Card[] cards = new Card[5];
        cards[0] = card1;
        cards[1] = card2;
        cards[2] = card3;
        cards[3] = card4;
        cards[4] = card5;
        return cards;
    }
}
