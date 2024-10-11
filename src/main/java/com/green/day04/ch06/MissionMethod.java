package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {

        printstar(5); // *****
        System.out.println();
        printstar(2); // **
        System.out.println();
        System.out.println("--------");

        printstar2(3,4);


    }


    static void printstar(int n) {
        for(int i = 1; i<=n; i++) {
            System.out.print("*");
        }

    }

    static void printstar2(int n1, int n2) {
        for(int i = 0; i < n1; i++) {
            for(int z = 0; z < n2; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
