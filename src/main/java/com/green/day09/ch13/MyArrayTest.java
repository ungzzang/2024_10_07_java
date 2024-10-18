package com.green.day09.ch13;

import java.util.Arrays;

public class MyArrayTest { // 두번 세번 보면서 익히자. 별이 되지 못했다.
    public static void main(String[] args) {
        int[] arr = {3, 10, 66, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println(MyArrays.toString(arr));
        System.out.println(MyArrays.toString2(arr));
        System.out.println(MyArrays.toString3(arr));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr == arr2);
        System.out.println(MyArrays.toString(arr2));

        int[] arr3 = MyArrays.copyOf(arr);
        System.out.println(arr == arr3); //false
        System.out.println(MyArrays.toString(arr3)); //[3, 10, 66, 7]

        int[] arr4 = MyArrays.copyOf(arr, 2);
        System.out.println(MyArrays.toString(arr4)); //[3, 10] // 아래와 사실상 같다.

        int[] arr5 = MyArrays.copyOf(arr, 3);
        System.out.println(MyArrays.toString(arr5)); //[3, 10, 66]


    }
}
