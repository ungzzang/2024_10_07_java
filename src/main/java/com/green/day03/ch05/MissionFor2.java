package com.green.day03.ch05;

public class MissionFor2 {
    public static void main(String[] args) {
        /*
            구구단 5단을 출력하는 프로그램을 for 문을 이용하여 작성.

            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            ...
            5 x 9 = 45

         */
        int dan = 5; // 매직넘버
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d \n", dan, i, dan*i);
        }

        System.out.println("--------------");

        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
        System.out.println("--End--");

    }
}
