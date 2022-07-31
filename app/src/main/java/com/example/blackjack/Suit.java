package com.example.blackjack;

public enum Suit {
    CLUB("clubs"),
    DIAMOND("diamonds"),
    HEART("hearts"),
    SPADE("spades");

    String suitName;

    Suit(String suitName) {
        this.suitName = suitName;
    }

    public String toString(){
        return suitName;
    }
}
