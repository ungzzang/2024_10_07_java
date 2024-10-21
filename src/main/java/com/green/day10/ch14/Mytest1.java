package com.green.day10.ch14;

import java.util.Scanner;

public class Mytest1 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        Scanner scan = new Scanner(System.in);


        int max = 0;
        int hang = 0;
        int yull = 0;
        for(int i =0; i < arr.length; i++){
            for(int z = 0; z < arr.length; z++){
                arr[i][z] = scan.nextInt();
                if(max < arr[i][z]){
                    max = arr[i][z];
                    hang = i;
                    yull = z;
                }
            }

        }
        System.out.println(max);
        System.out.println(hang+1);
        System.out.println(yull+1);
    }


}
