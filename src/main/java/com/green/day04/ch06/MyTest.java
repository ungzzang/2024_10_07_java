package com.green.day04.ch06;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {

        int star = (int)(Math.random()*6+2);
        System.out.println("star = " + star);

        int i, z;

        for(i = star; i >0; i--) {
            for(z = 1; z <= star; z++){
                if(i > z) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
