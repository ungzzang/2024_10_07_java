package com.green.day04.ch05;

public class MissionForInFor5 {
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
        int i, z;

        for (i = 1; i <= star; i++) {
                for (z = 1; z <= (star - i); z++) {
                    System.out.print("-");
                }
                for (z = 1; z <= i; z++) {
                    System.out.print("*");
                }

            System.out.println();
        }

//        for(i=star;i>0;i--) {
//            for(z=0;z<star;z++){
//                if(i>z) {
//                    System.out.print("-");
//                } else {
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//        }





    }
}

