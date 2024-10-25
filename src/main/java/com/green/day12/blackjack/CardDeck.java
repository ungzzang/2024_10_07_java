package com.green.day12.blackjack;

import java.util.Arrays;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards; // cards 는 52칸을 가진 배열 주소값만 담을 수 있다. final 이라서 주소값 변경안됨.
    private final String[] patterns;
    private int selectedIdx = 0; //외부에 줘야할 카드의 index 값

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{"♦", "♥", "♣", "♠"};

        //미션1
        // "", "" 값을 가지고 있는 Card 객체를 52개를 만들어 주시고
        //cards 배열에 하나씩 넣어주세요.
        /*for(int i = 0; i<cards.length; i++) {//반복문 안에서 new 만들어야 다 다른 주소값이 만들어짐.
            cards[i] = new Card("A", "B"); //A(B)
        }*/

        //미션2
        //모두 다른값을 가지고 있는 Card 객체 만들어서 card 에 순차적으로 넣어주세요.
        int idx = 0; //뻘로 있는거 아님.
        for(int i = 0; i < patterns.length; i++){ //0, 1, 2, 3
            String pattern = patterns[i];
            for(int z = 1; z <= 13; z++){ // 1~13
                String denomination = getDenomination(z);
                cards[idx++] = new Card(pattern, denomination);

                //cards[idx++] = new Card(patterns[i], getDenomination(z)); 이렇게 줄일 수 있다.
            }
        }

        //섞어주세요. (랜덤, 스와핑)
        //shuffle();  메소드 만들어서 이렇게 호출해도 됨.
        for(int i = 0; i < cards.length; i++){
            int rIdx = (int)(Math.random() * cards.length);

            Card temp = cards[rIdx];
            cards[rIdx] = cards[i];
            cards[i] = temp;
        }

       /* //enhanced-for 문으로 card 객체 주소값 전부 출력
        for(Card c : cards) {
            System.out.println(c); //println 은 문자열을 출력한다. Object 에 있는 toString 메소드로 문자열을 받아서.
            //Card 객체 주소값을 찍고 있어서 Card 에 가서 바꿔야함.
        }*/
    }

   /* public void shuffle() {
        for(int i = 0; i < cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length); //0~51
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp;
        }
    } *///셔플용 메스드 만든거. 이 메소드 안 만들고 위에서 바로 해도 작동됨.


    //n:1 > "A"
    //n:2~10 > 그대로 문자열로 만들어서 2 > "2", 3 > "3", 10 > "10"
    //n:11 > "J"
    //n:12 > "Q"
    //n:13 > "K"
    //나머지값 > ""
    public String getDenomination(int n) {
        if(n < 1 || n > 13) {
            return "";
        }

        switch(n){
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(n);
        }
    }

    //주소값 하나씩 리턴, 리턴 주소값 지워야되고, selectedIdx 이용하여 해결
    public Card draw(){
        if(selectedIdx == 52) {
            return null;
        }
        Card tmp = cards[selectedIdx]; //tmp 에 잠시 옮겨놓고.
        cards[selectedIdx] = null;
        selectedIdx++;
        return tmp;
    }

    public void checkCard() {
        //enhanced-for 문으로 card 객체 주소값 전부 출력
        for(Card c : cards) {
            System.out.println(c); //println 은 문자열을 출력한다. Object 에 있는 toString 메소드로 문자열을 받아서.
            //Card 객체 주소값을 찍고 있어서 Card 에 가서 바꿔야함.
        }
    }

}
/*
public Card draw() {
        if(selectedIdx == 52) {
            return null;
        }
        Card tmp = cards[selectedIdx];
        cards[selectedIdx] = null;
        selectedIdx++;
        return tmp;
    }
 */