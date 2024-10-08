package com.green.day02.ch04;

public class PrefixPostfixOp {
    public static void main(String[] args) {
        int n = 7;
        System.out.printf("1 - n: %d\n", n);
        n++; //증가 연산자 (n 쓰기만)
        System.out.printf("2 = n: %d\n", n); //n읽기
        ++n;
        System.out.printf("3 - n: %d\n", n);
        n += 1;
        System.out.printf("4 - n: %d\n", n);
        n--; //감소 연산자
        System.out.printf("5 - n: %d\n", n);
        /*
            증가/감소 연산자는 대입 연산자가 없지만 변수의 값인 변경이 된다.
            증가 연산자 사용시 쓰기만 한다면 pre, post 차이가 없다.
            증가 연산자 사용시 쓰기/읽기를 둘 다 해야한다면 pre, post 차이가 생긴다.
         */
        System.out.println("------------");
        int n2 = 10, n3 = 10;
        System.out.printf("n2++: %d\n", n2++); //post 에서 쓰기 읽기 둘다 있으면 읽기 먼저 하고 쓰기
        System.out.printf("n2: %d\n", n2);
        System.out.println();
        System.out.printf("++n3: %d\n", ++n3); //pre 에서 쓰기 읽기 둘다 있으면 쓰기 먼저 하고 읽기
        System.out.printf("n3: %d\n", n3);
    }
}
