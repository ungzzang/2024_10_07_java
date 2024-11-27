package com.green.bochung1;

import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 11, 18, 22 };
        //arr에 들어있는 값은 변화가 없는데
        //arr의 각 방의 값보다 +1이 된 새로운 배열(arr2)을 만들어 주세요.
        //2, 5, 8, 11, 18, 22 리터럴은 사용하지 않는데 배열에 들어있는 값을 이용하여 해결

        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i] + 1;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        // [3, 6, 9, 12, 19, 23]
    }
}
