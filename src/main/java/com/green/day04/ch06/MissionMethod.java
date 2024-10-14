package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {

        printstar(5); // *****

        printstar(2); // **

        System.out.println("--------");

        printStarSquare(4);
        System.out.println();

        //printstar2(3,4);

        printStarTriangle(4);
        //*
        //**
        //***
        //****


    }


    static void printstar(int star) {
        for(int i = 1; i <= star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printstar2(int n1, int n2) {
        for(int i = 0; i < n1; i++) {
            for(int z = 0; z < n2; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

   /* static void printStarSquare(int n) {
        for(int i = 0; i < n; i++) {
            for(int z = 0; z < n; z++) {
                System.out.print("*");
            }
            System.out.println();
        } // 내가한거

        ****
        ****
        ****
        ****

    */


    static void printStarSquare(int star) {
        for(int i = 0; i < star; i++){
            printstar(star);
        }
    }


   /* static void printStarTriangle(int star) {
        for(int i =0; i< star; i++){
            for(int z = 0; z<= i; z++){
                System.out.print("*");
            }
            System.out.println();
        } //내가한거
    }*/

    static void printStarTriangle(int star) {
        for (int i = 1; i <= star; i++) {
            printstar(i);
            }
        System.out.println();

    }

}
