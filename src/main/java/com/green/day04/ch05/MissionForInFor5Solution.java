package com.green.day04.ch05;

public class MissionForInFor5Solution {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0 + 3); // 3 ~ 8 사이의 랜덤 숫자
        /*
            star =  4
           ---*
           --**
           -***
           ****
         */

        System.out.println("star = " + star);


        for (int i = 1; i <= star; i++) { // for 문 3개 사용한거.
            for (int z = star; z > i; z--) {
                System.out.print("-");
            }
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("---------------");

        for(int i=star; i>0; i--) { // for 문 2개 사용한거.
            for(int z=1; z<=star; z++) {
                System.out.print(z<i ? "-": "*");
            }
            System.out.println();
        }
    }
}

