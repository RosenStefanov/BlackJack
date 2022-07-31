package com.example.blackjack;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int value = 0;
    private double balance;

    public Player(){}

    public void drawCard(ArrayList<Card> deck){
        hand.add(deck.get(0));
        value += deck.get(0).getRank().rankValue;
        deck.remove(0);
    }

    public int handValue(){
        return value;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
