package com.green.day08.ch13;

import java.util.Arrays;

public class ArrayDataSwapping {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        //arr[0] 방의 값과 arr[2]의 값을 swapping 해주세요
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        System.out.println(Arrays.toString(arr)); //주소값이 아니라 배열값이 나옴. toString 은 클래스메소드.
    }
}
