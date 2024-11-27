package com.green.bochung1;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 11, 18, 22 };

        //레퍼런스 변수 arr + 메소드 조합
        // 1. arrCopy는 메소드인가? () 있으면 메소드라고 생각
        // 2. 인스턴스 메소드인가 클래스 메소드인가? statio 메소드
        // 3. void vs return >> 리턴메소드, 리턴타입은 int[], "=" 있음.
        // 4. 메소드명 arrCopy
        // 5. 파라미터는 2개, 첫번째 파라미터는 int[], arr변수의 타입보고 알수있다
        //      두번째 파라미터 타입은 int이다.
        int[] arr2 = arrCopy(arr, 2);

        //ArrTest3과 결과가 같다.
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = ArrayTest4.arrCopy(arr2);
        System.out.println(arr2==arr3); //false
        System.out.println(Arrays.toString(arr2)); //1.
        System.out.println(Arrays.toString(arr3)); //2. 1번, 2번 출력이 같아야한다.
    }

    public static int[] arrCopy(int[] arr, int num){
        int[] arr2 = new int[arr.length]; //똑같은 크기의 새로운 배열을 만든다.
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i] + num;
        }
        return arr2;
    }

    public static int[] arrCopy(int[] arr2){
        return arrCopy(arr2, 0);
    }
}
