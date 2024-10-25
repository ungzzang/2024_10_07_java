package com.green.day12.blackjack;

import java.util.List;

/*public class CardTest {
    public static void main(String[] args) {
//        CardDeck cd = new CardDeck();
        //cd.shuffle();

//        cd.checkCard();
//        System.out.println("-------------------");
//        Card c = cd.draw();
//        System.out.println(c);
//        System.out.println("-------------------");
//        cd.checkCard();

//        Card c2 = cd.draw();
//        cd.checkCard();



       *//* System.out.println(cardDeck.getDenomination(1));  //1
        System.out.println(cardDeck.getDenomination(2));    //2
        System.out.println(cardDeck.getDenomination(3));    //3
        System.out.println(cardDeck.getDenomination(12));   //Q
        System.out.println(cardDeck.getDenomination(13));   //K
        System.out.println(cardDeck.getDenomination(14));*//* //""


    }
}

class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); // 카드를 저장한다.
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        System.out.println("-------------------------------------");

        gamer.showYourCards();
        System.out.println("합계: " + gamer.getPoint()); //point 값이 출력될 수 있도록

        List<Card> list = gamer.openCards();
        //System.out.println("open: " + list);
    }
}

class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.needMoreCard(cd);
        System.out.println("----------------------------");

        //dealer.showYourCards();

    }
}*/

class CardTest4 {
    public static void main(String[] args) {
        Rule rule = new Rule();
        Dealer dealer11 = new Dealer();
        Gamer gamer11 = new Gamer();

        rule.getWinner(dealer11, gamer11);
    }
}
