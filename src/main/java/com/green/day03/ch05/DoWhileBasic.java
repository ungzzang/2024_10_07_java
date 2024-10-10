package com.green.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] args) {
        /*
            while 문은 () 안의 결과가 true 인지 체크 먼저 한다.
            체크 후에 true 면 반복 시작

            do-while 문은 실행 1번 먼저하고 ()안의 결과가 true 인지 체크한다.
            체크 후에 true 면 반복 시작
         */
        int n = 4;

        while(n < 5) {
            System.out.println("I like Java" + n++);
        }

        System.out.println("------------");

        int n2 = 4;

        do{
            System.out.println("I like Java" + (n2++));
        } while(n2 < 5);
        System.out.println("--End--");

    }
}
