package com.green.day04.ch05;
// p. 134
public class LabledBreakPoint {
    public static void main(String[] args) {
        // 구구단에서 곱의 결과가 72인 결과를 딱 하나만 보여라.

        outer: // 이름이 outer 가 됨. 이름은 아무거나 지정가능. name1:, ung: 이런식.
        for(int i = 1; i < 10; i++) {
            sub: // 이렇게 아래 for 문을 지정하는거.
            for(int z = 1; z < 10; z++) {
                if((i * z) == 72) {
                    System.out.printf("%d x %d = %d\n", i, z, (i * z));
                    break outer; // 바깥의 for 문을 박살 낼 때 사용.
                }
            }
        }
        System.out.println("--End--");


        outer: // 위랑 중복된 이름이지만 다른 for 범위라서 괜찮다.
        for(int i = 1; i < 10; i++) {

        }

        int n = 1;
        outer: // while 반복문에도 적용 가능.
        while(true) {

            while(true) {
                if(n == 10) {
                    break outer;
                }
                n++;

                System.out.println("AAAA"); // 안에 while만 부서지면 위에 반복문이 계속 돌아서  얘랑 만나지 않아서 빨간줄생김.
            }
        }

    }
}
