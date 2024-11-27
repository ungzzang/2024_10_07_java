package com.green.bochung1;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        //0: 100
        //1: 200
        //2: 300
        //...
        //9: 1000

        for(int i = 0; i < arr.length; i++){
            arr[i] = (i * 100) + 100;
            //arr[i] = (i + 1) * 100;
        }
        System.out.println(Arrays.toString(arr));

        //0번 값과 9번방 값 스와핑
        int temp = arr[9];
        arr[9] = arr[0];
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
