package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {

        //0이상 100이하의 랜덥값 나올 수 있도록 세팅
        int score = (int)(Math.random() * 101.0); //101을 101.0으로 형변환 하면 좋다.
        System.out.printf("score: %d\n", score);


        /*
             score 값이  90이상이면 A 출력
                        80이상이면 B 출력
                        70이상이면 C 츌력
                        나머지는 D 출력
         */


        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }


    }
}
