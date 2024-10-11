package com.green.day04.ch05;

public class MyTest {
    public static void main(String[] args) {

        for(int i = 0; i <= 9; i++) {
            for(int z = 0; z <= 9; z ++) {
                if(i + z == 9)
                System.out.printf("%d%d + %d%d = 99 \n", i, z, z, i);
            }
        }
    }
}
