package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        /*
            2 x 1 = 2   3 x 1 = 3   4 x 1 = 4
            2 x 2 = 4   3 x 2 = 6   4 x 2 = 8
            ...
            2 x 9 = 18  3 x 9 = 27  4 x 9 = 36

         */
        int i, z;

        for(i = 1; i <= 9; i++) {
            for (z = 1; z <= 9; z++) {
                System.out.printf("%d x %d = %d\t", z, i, i * z);
            }
            System.out.println();
        }
    }
}
