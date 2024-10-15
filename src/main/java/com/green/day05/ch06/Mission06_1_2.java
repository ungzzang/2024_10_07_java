package com.green.day05.ch06;

public class Mission06_1_2 {
    public static void main(String[] args) {
        /*
            정수 둘을 인자로 전달받아서, 두 수 의 '차의 절댓값'을 계산하여 출력하는
            메소드와 이 메소드를 호출하는 main 메소드를 정의 해보자. 단 메소드 호출시 전달되는
            값의 순서에 상관없이 절댓값이 계산되고 출력되어야 한다.
         */

        AbsolVal(15,19);
        AbsolVal(19,15);
        System.out.println("----------------");
        AbsolVal(42,196);
        AbsolVal(196,42);
    }

    static void AbsolVal(int n1, int n2){
        System.out.printf("|%d - %d| = %d\n", n1, n2, (n1>=n2? n1-n2 : n2-n1));
    }

}
