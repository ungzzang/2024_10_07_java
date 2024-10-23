package com.green.day12.blackjack;

public class Card {
    private final String pattern; //무늬 //상수로 처리하려고 final, 속도빠름.
    private final String denomination; // A, 2 ~ 10, J, Q, K 값 저장

    public Card(final String pattern, final String denomination){
        this.pattern = pattern;

        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() { // 내가 받은 toString 말고 다르게 하려고 오버라이딩 함.
        return String.format("%s(%s)", pattern, denomination); // printf 대신 format 사용한다.
    }


}
