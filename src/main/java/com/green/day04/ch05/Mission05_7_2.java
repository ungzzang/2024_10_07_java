package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
        /*
            다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하라.

                A B
            +   B A
            -------
                9 9
         */

        int i, z;

        for(i = 0; i <= 9; i++) {
            for (z = 0; z <= 9; z++) {
                if (i + z == 9) {
                    System.out.printf("%d%d + %d%d = 99 \n", i, z, z, i);
                    System.out.printf("A = %d, B = %d\n", i, z);
                }
            } System.out.println();
        }

    }
}
