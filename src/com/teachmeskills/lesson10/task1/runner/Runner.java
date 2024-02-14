package com.teachmeskills.lesson10.task1.runner;

import com.teachmeskills.lesson10.task1.card.CardFabric;
import com.teachmeskills.lesson10.task1.client.Client;
import com.teachmeskills.lesson10.task1.service.CheckCard;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client("Name", CardFabric.createCard());
        CheckCard.checkSameCards(client.getCards());
    }
}