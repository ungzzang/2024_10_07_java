package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[5];
        /*
            0: 10 >> arr[0] = 10   >> arr[0] = 1
            1: 20 >> arr[1] = 20   >> arr[1] = 2
            2: 30
            3: 40
            4: 50
         */


        for(int i = 0; i < arr.length; i++){
            arr[i] = (i + 1) * 10 ;
        }

        /*
        for(int i = 1; i <= arr.length; i++){  //이렇게도 가능
            arr[i-1] = i * 10 ;
        }
        */

        //건드리지 마시오.
        for(int i = 0; i < arr.length; i++) {
            //arr[i] = (i + 1) * 10; 따로 분리하자. 읽는거 따로 넣는거 따로 하는게 관리가 잘됨.
            System.out.printf("arr[%d]: %d\n",i,arr[i]);
        }
    }
}
