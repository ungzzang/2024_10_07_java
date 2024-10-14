package com.green.day06.ch06;

public class Method2Param {

    //Parameter
    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12, 12.5);
        /*
            제 나이는 12세 입니다.
            저의 키는 12.5cm 입니다.
         */

        hiEveryone(13, myHeight);
        /*
             제 나이는 13세 입니다.
             저의 키는 175.9cm 입니다.
         */

        byEveryone();
        //다음에 뵙겠습니다.
    }

    static void hiEveryone(int age, double height){
        System.out.printf("제 나이는 %d세 입니다.\n저의 키는 %.1fcm 입니다.\n", age, height);
        System.out.println();
    }

    static void byEveryone(){
        System.out.println("다음에 뵙겠습니다.");
        System.out.println("그럼 빠이~");
    }

}
