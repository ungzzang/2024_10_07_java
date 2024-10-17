package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArrayMytest {
    public static void main(String[] args) {
        int[] arr = new int[20];
        //1 ~ 20순차적으로 값을 넣어주세요.

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        //0 ~ 19 랜덤값
        //rIdx 가 가리키는 공간과 i 가 가리키는 공간의 값을 swapping 해주세요.

        /*for(int i = 0; i < arr.length; i++) {
            int rIdx = ((int) (Math.random() * arr.length)+1);
            arr[i] = rIdx;

            for(int z = 0; z < i; z++){
                int temp = arr[z];
                if(temp == rIdx) {
                    i--;

                }
            }
        }*/ //이것도 됨.


        for (int i = 0; i<arr.length; i++) {
            int temp;
            int random = (int)(Math.random()*arr.length);
            if (arr[i]-1 != random) {
                temp = arr[i];
                arr[i] = arr[random];
                arr[random] = temp;
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
