package com.green.day08.ch13;

public class ArrayInstance {
    public static void main(String[] args) {
        //길이가 5인 int 형 1차원 배열의 생성 (변수는 ar1)
        int[] ar1 = new int[5];

        //길이가 7인 double 형 1차원 배열의 생성 (변수는 ar2)
        double[] ar2 = new double[7];

        //배열의 참조변수와 인스턴스 생성 분리 가능
        float[] ar3;
        ar3 = new float[9];

       /* Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        System.out.println("i3 == i4: " + (i3 == i4)); // 객체가 각각 만들어져서 주소가 다름.

        Integer i = Integer.valueOf(10); // Integer 따로 한거라서 나중에 한대요.
        Integer i2 = Integer.valueOf(10);
        i2 = i2 +2;

        Integer i5 = Integer.valueOf(12);

        System.out.println("i2 == i5: " + (i2 == i5));
        System.out.println(i == i2);*/


        System.out.printf("ar1.length: %d\n", ar1.length);
        System.out.printf("ar1.length: %d\n", ar2.length);
        System.out.printf("ar1.length: %d\n", ar3.length);
    }
}
