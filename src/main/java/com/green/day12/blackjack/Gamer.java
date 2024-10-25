package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gamer {

    //card 객체 주소값 여러개 저장할 수 있어야 합니다.
    //ArrayList 사용할꺼임
    //멤버필드 선언. 변수명은 cards


    protected final List<Card> cards;
    protected int point;

    public Gamer() {
        cards = new ArrayList<>();

    }

    public void receiveCard(Card c1) {
        //switch expression(스위치 표현)
         int point = switch(c1.getDenomination()){
            case "A" -> 1; //옆의 값이 리턴됨.
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(c1.getDenomination());
            //스트링에 들어있는 숫자들을 정수타입으로 바꿔줌.
        };

        //val 변수에 10 정수값이 주입된다.
        String str = "10";
        int val = Integer.parseInt(str);

         cards.add(c1);

         this.point += point;
    }

    public void showYourCards() {
//        for(int i = 0 ; i < cards.size(); i++) {
//            System.out.println(cards.get(i));
//        } 이렇게 하던가

        for(int i = 0; i < cards.size(); i++) {
            Card item = cards.get(i);
            System.out.println(item);
         } //이렇게 길게 쓰던가

//        for(Card item : cards) { //간결해서 좋음.
//            System.out.println(item);
//        }
        //System.out.println("합: " + point);
    }

    public List<Card> openCards() {
        return cards;
    }

    public int getPoint() {
        return point;
    }


}
