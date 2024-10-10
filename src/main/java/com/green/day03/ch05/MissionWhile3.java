package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {

    /*
        while 문
        1000이하 자연수 중, 2의 배수이자 7의 배수 모두 출력,
        그 수들의 합을 구해서 출력
        합: 35784
     */
        int n = 1, sum = 0;

        while (n <= 1000) {

            if( (n % 2 == 0) && (n % 7 == 0)) {

                sum += n;
                System.out.println("배수는 " + n);

            }
            n++;
        }
        System.out.println("-------------");
        System.out.println("총합은 " + sum);
    }
}
