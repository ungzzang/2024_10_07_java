package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*
           - ContinueBasic 의 존재하는 while 문을 for 문으로 변경 -

             int n = 0;
        int count = 0;

        while((n++) < 100) {
           if(((n % 5) != 0) || ((n % 7) != 0)) { //처음 실행되는 n 값은 1이다.
             continue; //true 면 밑에 스킵.
            }
            count++;
            System.out.println("n: " + n);
        }
        System.out.println("count: " + count);
         */

        /*
             int n = 0;
        int count = 0;

        while((n++) < 100) {
           if(((n % 5) == 0) && ((n % 7) == 0)) { //처음 실행되는 n 값은 1이다.
               count++;
               System.out.println("n: " + n);
            }
        }
        System.out.println("count: " + count);
         */

        int count = 0;

        for(int n = 1; n < 100; n++) {
            if(((n % 5) != 0) || ((n % 7) != 0)) {
                continue;
            }
            count++;
            System.out.println("n: " + n);
        }
        System.out.println("count: " + count);
    }
}
/*
        int count = 0;

        for(int n = 1; n < 100; n++) {
            if(((n % 5) == 0) && ((n % 7) == 0))  {
               count++;
               System.out.println("n: " + n);
            }
        }
        System.out.println("count: " + count);
    }
 */