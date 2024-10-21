package com.green.day09.ch13;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

    }

    public static String toString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        int lastIdx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i == lastIdx) {
                break; // for 문 빠져나옴
            }
            sb.append(", ");
        }
        return sb.append("]").toString(); // 스트링으로 변환된 값이 리턴.
        //return "[" + sb + "]"; 이런느낌으로 할꺼면 가장 처음에 new StringBuilder(); 로 비워두면 됨.
    }

    public static String toString2(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        return "[" + sb + "]"; //문자열 덧셈 이라 sb 가 자동 문자열이 되어 리턴됨
        // return "[" + sb.toString() + "]"; 문자열 만났을때 이렇게 된거처럼 된다.
    }

    public static String toString3(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }
        return sb.append("]").toString();
    }

    //deep copy
    public static int[] copyOf(int[] arr) {
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;

        //return copyOf(arr, arr.length); 이렇게 한줄로도 가능하다. 밑에 오버로딩 메소드를 호출한다.
    }

    public static int[] copyOf(int[] arr, int length) {
        int[] arrCopy = new int[length];
        for (int i = 0; i < length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }

}
