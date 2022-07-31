package com.example.blackjack;

public enum Rank {
    ACE("ace", 11),
    TWO("two", 2),
    THREE("three", 3),
    FOUR("four",4),
    FIVE("five",5),
    SIX("six",6),
    SEVEN("seven",7),
    EIGHT("eight",8),
    NINE("nine",9),
    TEN("ten",10),
    JACK("jack",10),
    QUEEN("queen",10),
    KING("king",10);

    String rankName;
    int rankValue;

    Rank(String rankName, int rankValue){
        this.rankName = rankName;
        this.rankValue = rankValue;
    }

    public String toString(){
        return rankName;
    }
}
