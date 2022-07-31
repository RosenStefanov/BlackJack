package com.example.blackjack;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game();
    }

    protected void game() {
        ArrayList<Card> deck = setDeck();
        Collections.shuffle(deck);

        int cntr = 0;
        Dealer dealer = new Dealer();
        Player player = new Player();
        player.drawCard(deck);
        dealer.drawCard(deck);
        dealer.handValue();
        player.drawCard(deck);
        player.handValue();
        LinearLayout playerHandLayout = findViewById(R.id.playerhand);
        LinearLayout dealerHandLayout = findViewById(R.id.dealerhand);

        for (Card card: player.getHand()
             ) {
            if (cntr == 0){
            showCards(playerHandLayout, card, 100);
            cntr++;}
            else{
                showCards(playerHandLayout, card, -100);
            }
        }
            cntr = 0;
        for (Card card: dealer.getHand()
        ) {
            if (cntr == 0){
                showCards(dealerHandLayout, card, 100);
                cntr++;}
            else{
                showCards(dealerHandLayout, card, -100);
            }
        }
        TextView playerHandCount = findViewById(R.id.playerHandCount);
        TextView dealerHandCount = findViewById(R.id.dealerHandCount);

        playerHandCount.setText(String.valueOf(player.handValue()));
        dealerHandCount.setText(String.valueOf(dealer.handValue()));
    }

    public ArrayList<Card> setDeck() {
        ArrayList<Card> deck = new ArrayList<Card>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }


    public int getCardRes(Card card){
        String str;
        str = card.getSuit().suitName+ "_" + card.getRank().rankName;
        return getResources().getIdentifier(str, "drawable", getPackageName());
    }

    public void showCards(LinearLayout linearLayout, Card card, int margin){

        int width = 200;
        int height = 400;

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, height);
                params.leftMargin = margin;
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(params);
                imageView.setImageResource(getCardRes(card));
                linearLayout.addView(imageView);
    }
}