package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 180;

        // 값이 1이상 100 이하라면 true, 아니라면 false
        boolean b = logicalOp(n1);
        System.out.println("b: " + b);

        // 2배수거나 3배수이면 true 아니면 false
        boolean b2 = logicalOp2(n1);
        System.out.println("b2: " + b2);
    }

    static boolean logicalOp(int n) { // 여기서 n 이라는 이름은 main 메소드의 n이랑 다름.
        return ((1 <= n) && (n <= 100)) ;

    }

    static boolean logicalOp2(int n) {
        return ((n % 2 == 0) || (n % 3 == 0));
    }

}
