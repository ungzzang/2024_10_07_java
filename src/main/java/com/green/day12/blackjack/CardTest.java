package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //cd.shuffle();

        Card c = cd.draw();
        System.out.println("-------------------");
        cd.checkCard();
        Card c2 = cd.draw();
        System.out.println("-------------------");
        cd.checkCard();







       /* System.out.println(cardDeck.getDenomination(1));  //1
        System.out.println(cardDeck.getDenomination(2));    //2
        System.out.println(cardDeck.getDenomination(3));    //3
        System.out.println(cardDeck.getDenomination(12));   //Q
        System.out.println(cardDeck.getDenomination(13));   //K
        System.out.println(cardDeck.getDenomination(14));*/ //""


    }
}