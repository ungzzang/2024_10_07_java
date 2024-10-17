package com.green.day08.ch13;

import java.util.Arrays;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 1, 8, 10, 12};
        int[] copyArr = new int[arr.length]; //arr과 같은 크기의 int 배열을 만들자.

        Arrays.sort(arr); //배열 정렬

        for(int i = 0; i < copyArr.length; i++){
            copyArr[i] = arr[i];
        }

        System.out.println("arr == copyArr: " + (arr == copyArr)); //false //딥 카피는 주소가 같지 않음. 안에 크기나 값은 같지만.
        //참조변수끼리의 == 비교는 동일성(같은 주소값)을 묻는다.

        int[] arr2 = copyArr; // shellow 카피, 얕은 복사(주소값 복사)
        System.out.println("arr2 == copyArr: " + (arr2 == copyArr)); //true


        //copyArr의 각 방은 arr 의 각 방의 값과 같은 값을 가질 수 있도록 해주세요.
        //밑은 절대 건들지 마시오
        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
        System.out.println("---------------");

        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d]: %d\n", i, copyArr[i]);
        }

    }
}
