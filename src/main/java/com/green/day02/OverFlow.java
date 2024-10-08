package com.green.day02;

public class OverFlow {
    public static void main(String[] args) {
        /*
            5리터 컵에 5리터 이상의 물을 넣었을 때, 물이 넘치게 된다.
            이 현상을 오버플로우
            100까지 저장할 수 있는 곳에 101이상을 저장하게 되면 오버플로우
            현상이 나타난다. 다만 현실과는 다르다.
            byte: -128 ~ 127
         */

        byte var1 = 127;
        System.out.printf("var1: %d\n", var1);

        byte var2 = (byte)128; //127까지 저장가능한데 1이 넘쳐서 다시 제일 작은값인 -128로 돌아간다.
        System.out.printf("var2: %d\n", var2); //만약 2가 넘치면 -127이 된다.
    }
}
