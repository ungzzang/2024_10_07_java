package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    /*
        다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의
        크기만큼 전부 증가시킨다.

        public static void addOneDArr(int[] arr, int add) {

        }
     */
    public static void main(String[] args) { //github 올려진거 따오기.
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]


        // 여기 코드있음.
        // 위의 2개 for 문은 배열이 가지고 있는 값을 다른데서 복사로 하고 다른데를 고친
        //배열의 각 방을 고쳐야 하는데 다른곳을 고쳤다.


        addOneDArr(arr, 3); // 두번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 7, 8]
        System.out.println("-------------------------");

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        addTwoDArr(arr2, 2); //메소드 재활용성을 극대화 시킨다.
        System.out.println(Arrays.deepToString(arr2));

    }

    public static void addOneDArr(int[] arr, int add) {
        for(int i = 0; i < arr.length; i++) {
          arr[i] +=  add;
        }
    //배열의 각 방의 값을 바꾸려면 arr[?] = 10; 이런식으로 해야 바뀐다.
    }

    //int[] 객체의 각 방의 타입: int
    //int[][] 객체의 각 방의 타입: int[]
    public static void addTwoDArr(int[][] arr2, int add2) {
        for(int i = 0; i < arr2.length; i++) {
            addOneDArr(arr2[i], add2);
        }

//        for(int z=0; z < arr.length; z++){
//            for(int i = 0; i<arr[z].length; i++) {
//                arr[z][i] = arr[z][i] + add;
//            }
//        } 이렇게 for 문 두개를 써도 된다. 파라미터 이름 바꿔주면 됨.
    }

}
