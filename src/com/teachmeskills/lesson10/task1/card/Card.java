package com.teachmeskills.lesson10.task1.card;

import java.util.Objects;

public class Card {
    private int cvv;
    private long cardNumber;
    private double cardBalance;

    public Card(int cvv, long cardNumber, double cardBalance) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return getCardNumber() == card.getCardNumber() && getCvv() == card.getCvv();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCardNumber(), getCvv());
    }
}
