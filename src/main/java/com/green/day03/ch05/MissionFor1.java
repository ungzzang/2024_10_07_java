package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /*
            1~10까지의 곱의 결과 출력하는 프로그램을 for 문을 이용하여 작성
            결과는 3,628,800
         */

        int result  = 1;

        for(int num = 1; num <= 10; num++) {
            result *= num;
        }

        System.out.printf("result = %,d\n", result);

    }
}
