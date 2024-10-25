package com.green.day14.ch17;

import java.util.Scanner;

public class MyBaekJoon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] gongbaesu = new int[1000];
        int t;

        System.out.println("테스트 케이스의 개수(1<=T<=1000): ");
        t = scan.nextInt();
        if(t<1 || t>1000 ){
            System.out.println("잘못입력하였습니다.");

        } else {
            for (int i1 = 1; i1 <= t; i1++) {
                System.out.println("숫자 두 개를 입력하세요: ");
                int a1 = scan.nextInt();
                int a2 = scan.nextInt();
                for (int i2 = 1; i2 <= 45000; i2++) {
                    if ((i2 % a1 == 0) && (i2 % a2 == 0)) {
                        gongbaesu[i1] = i2;
                        break;
                    }
                }
            }
            for(int z = 1; z <= t; z++) {
                System.out.println("공배수는: " + gongbaesu[z]);
            }
        }

    }
}
