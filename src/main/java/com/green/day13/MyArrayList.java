package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        //arr = new int[0];
        arr = new int[0]; //clear(); 밑에 메소드 만들어서 이렇게 중복되면 호출해도됨.
       /* arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;*/ //넣어서 미션했었음.

    }

    @Override
    public String toString() {
        if(arr.length == 0) {
            return"[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }
        sb.append("]");

        return sb.toString()  ;
    }

    public void add(int num){
        int[] tmp = new int[arr.length + 1]; //공간 하나 늘림.
        tmp[arr.length] = num;

        for(int i = 0; i < arr.length; i++){ // 값 복사 작업. arr.length 가 0일때는 for 문 안돈다.
            tmp[i] = arr[i];
        }

        arr = tmp; // 전역변수 arr 은 객체가 있는 동안 계속 살아있음.
                    // tmp 는 지역변수라서 죽음.
    }

    public int size(){
        return arr.length;
    }

    public int remove() {
        int[] tmp = new int[arr.length-1];
        int removeVal = arr[tmp.length];
        for(int i = 0; i < arr.length-1; i++ ) {
           tmp[i] =  arr[i];
        }
        arr = tmp;
        return removeVal;
    }

    public void remove(int n1){
        int[] tmp = new int[arr.length-1];

        for(int i = 0; i < arr.length-1; i++){
            if(i<n1){
                tmp[i] = arr[i];
            } else if(i>=n1) {
                tmp[i] = arr[i+1];
            }
        }
        arr = tmp;
    }

    public void clear() {
        arr = new int[0];
    }

}

