package com.green.day02;

public class Mission1 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        // n1/n2 나누셔서 3.33333 나올 수 있도록 해주세요.

        System.out.println(n1/n2); //int / int 결과 타입은 int 이기 때문에 실수값이 날아간다.

        float result = n1/n2;
        System.out.println("result: " + result); //int 결과타입도 int이기 때문에 실수값이 날아간 3이 float에 저장

        float result2 = (float)n1/n2; //하나만 실수타입으로 바꾸면 실수로 결과가 나옴.
        System.out.println("result2: " + result2);  // float/int >> float/float >> 결과타입도  float, 실수값도 살아있다.

        System.out.printf("%.6f \n", (double)(n1)/(n2));
        System.out.println((float)(n1)/(n2));

    }
}
