package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        /*
            1~100까지 출력,
            100~1까지 출력,

            do-while, while 각 1번씩 사용하여 해결해주세요.

         */
        int n = 1;

        while(n < 101) {
            System.out.println(n++);
        }
        // n = 101까지 올라간 상태.

        System.out.println("------------");

        do{
            System.out.println(--n); // n = 101 상태라서 먼저 --로 빼고 시작.
        } while(n > 1);
    }
}
