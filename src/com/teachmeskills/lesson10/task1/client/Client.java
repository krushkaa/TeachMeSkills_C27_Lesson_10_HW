package com.teachmeskills.lesson10.task1.client;

import com.teachmeskills.lesson10.task1.card.Card;

public class Client {
    private String name;
    private Card[] cards;

    public Client(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}