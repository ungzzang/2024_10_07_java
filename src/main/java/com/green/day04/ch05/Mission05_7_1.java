package com.green.day04.ch05;

//p.135
public class Mission05_7_1 {
    public static void main(String[] args) {

      /*
        1번. 구구단의 짝수 단인 2, 4, 6, 8 단만 출력하는 프로그램을 작성하되
        2단은 2 x 2 까지,
        4단은 4 x 4 까지,
        6단은 6 x 6 까지,
        8단은 8 x 8 까지
        출력하도록 작성하라.
       */

        int dan , z ;


        for(dan = 2; dan < 9; dan += 2 ) {
            for(z = 1; z <= dan; z++) {
                System.out.printf("%d x %d = %d\n", dan, z, dan * z);
            }
            System.out.println("-----------");

        }
        System.out.println();
    }
}
