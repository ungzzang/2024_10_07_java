package com.green.day12.blackjack;

import com.green.day07.ch07.Car;

public class Rule {
    public void getWinner(Dealer dealer, Gamer gamer) {
        //1. 각 게이머(게이머, 딜러) 의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다.

        //비겼는 경우: 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우

//        dealer.point = 17;
//        gamer.point  = 18; 검증할 때 쓴거.


        /*
            if: 비기는 경우의 수를 전부 잡아냄. 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우
            남은 경우의 수: 둘 중의 하나가 21을 넘은 경우 or 둘 다 21을 안 넘은 경우

            else if: 딜러가 이긴 경우의 수를 전부 잡아냄.
                    딜러가 21을 안 넘으면서 게이머보다 점수가 많은 경우 >> 둘 다 21을 안 넘은 경우인데 딜러가 점수가 더 높음
                    게이머가 21을 넘었다면 >> 딜러는 21을 안 넘었을꺼다.
            남은 경우의 수: 게이머가 이기는 경우의 수만 남았음.

            else: 게이머가 이기는 경우이다.
         */

        if((gamer.point == dealer.point) || ((gamer.point > 21)&&(dealer.point > 21))) {
            System.out.println("비김");
        } else if((dealer.point <= 21 && dealer.point > gamer.point) || gamer.point > 21) {
            System.out.println("딜러 승");
        } else {
            System.out.println("게이머 승");
        } //쌤이 더 간결하게 짠 코드


        /*if((gamer.point > dealer.point) && ((gamer.point < 21) &&(dealer.point < 21))) {
            System.out.println("Gamer Win!!");
        } else if((gamer.point < dealer.point) && ((gamer.point < 21) &&(dealer.point < 21))) {
            System.out.println("Dealer Win!!");
        } else if((gamer.point == dealer.point) || ((gamer.point > 21)&&(dealer.point > 21))) {
            System.out.println("Draw!!");
        } else if(gamer.point > 21) {
            System.out.println("Dealer Win!!");
        } else if(dealer.point > 21) {
            System.out.println("Gamer Win!!");
        }*/ //내가 짠 코드


        /*if((gamer.point == dealer.point) || ((gamer.point > 21)&&(dealer.point > 21))) {
            System.out.println("비김");
        } else if((dealer.point <= 21 && gamer.point <= 21)) {
            if(dealer.point > gamer.point) {
                System.out.println("딜러 승");
            } else {
                System.out.println("게이머 승");
            }
        }*/ //쌤이 짠 코드.







    }
}
