package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        /*
            while 문을 활용하여 1~99까지 합을 구하는 프로그램을 작성하시오.
            result = 4950;
            1. 1~99의 값을 만들 수 있어야 한다.
         */

        int result = 0, n = 1;

        while(n < 100) {
            result = result + (n++);
        }
        System.out.println("result = " + result);

        System.out.println("--End--");

        /* 솔루션.
            int n = 1;
            int sum = 0;
            while(n < 100) {
                 //sum = sum + (n++);
                 sum += n++;
             }
            System.out.println("result = " + sum)

         */

    }
}


