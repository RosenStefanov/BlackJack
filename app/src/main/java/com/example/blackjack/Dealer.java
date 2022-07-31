package com.example.blackjack;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import java.util.ArrayList;

public class Dealer {
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int value = 0;
    private int x;
    private int y;
    private Bitmap bmp;

    public Dealer(){}

    public void drawCard(ArrayList<Card> deck){
        hand.add(deck.get(0));
        value+= deck.get(0).getRank().rankValue;
        deck.remove(0);
    }

    public int handValue(){
        return value;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
