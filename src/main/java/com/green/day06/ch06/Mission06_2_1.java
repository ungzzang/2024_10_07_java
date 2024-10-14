package com.green.day06.ch06;

public class Mission06_2_1 {
    public static void main(String[] args) {
        /*
            인자로 원의 반지름 정보를 전달하면, 원으 넓이를 계산하여 반환하는
            메소드와 원의 둘레를 계산하여 반환하는 메소드를 각각 정의하고,
            이 둘을 호출하는 main 메소드를 정의하자
         */
        int radius = 5;
        extent(radius);
        circum(radius);

        System.out.printf("반지름 %d인 원의 넓이는 %.2f\n", radius, extent(radius));
        System.out.printf("반지름 %d인 원의 둘레는 %.2f\n", radius, circum(radius));

    }

    static double extent(double r){ // 넓이
        return (r*r*3.14);

    }

    static double circum(int r){ // 둘레
        return (2*r*3.14);
    }
}
