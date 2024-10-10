package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        /*
            중첩 for 문을 이용하여 구구단 출력

            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            ...
            2 x 9 = 18
            (개행)
            3 x 1 = 3
            3 x 2 = 6
            ...
            9 x 9 = 81

         */

        int i, z, count=0;

        for(i = 1; i <= 9; i++) {
               for(z = 1; z <= 9; z++) {
                   System.out.printf("%d x %d = %d\n", i, z, i * z);
               }

               if(i==9) {
                   i = 1;
                   count++;

                   if (count == 3) {
                       break;
                   }
               }
               System.out.println();
        }
    }
}
