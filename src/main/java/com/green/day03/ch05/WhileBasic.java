package com.green.day03.ch05;

public class WhileBasic {
    public static void main(String[] args) {
        /*
            while 문은 반복문, ()소괄호 안에 식이 true 인
            동안 {} 내용이 반복이 된다.
            ()안의 결과가 false 가 되는 순간 while 문을 빠져나온다.

            몇 번 반복하고싶다. 3가지 요소가 필요함
            1. 인덱스 초기화  ->>  int n = 0;
            2. 비교문(식)  ->>  n < 5
            3. 증감식  ->>  n++
         */
        int n = 0;

        while(n < 5) {
            System.out.println("I like Java" + n);
            n++;
        }

        /*
        while(n < 5) {
            System.out.println("I like Java" + n++);   //이렇게 해도 위와 똑같은 값이 나옴.
       }
        */

        System.out.println("--End--");

    }
}
