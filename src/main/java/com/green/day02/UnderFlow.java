package com.green.day02;

public class UnderFlow {
    public static void main(String[] args) {
        byte var1 = -128;
        System.out.printf("var1: %d\n", var1);

        byte var2 = (byte)-129; //-128까지 담는데 -1 언더플로우 일어나서 최댓값인 127이 출력.
        System.out.printf("var2: %d\n", var2);

    }
}
