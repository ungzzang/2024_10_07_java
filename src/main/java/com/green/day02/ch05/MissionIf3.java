package com.green.day02.ch05;

import java.util.Scanner; //다시 공부.

//11는(은) 홀수입니다.

//14는(은) 짝수입니다.

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner 라는 객체를 만들 때 new 붙인다.
        System.out.print("숫자를 하나 입력하세요 >> ");
        int input = scan.nextInt();
        System.out.printf("input: %d\n", input);

        System.out.printf("%d는(은) %c 입니다.\n", input, input % 2 == 0 ? '짝' : '홀'); //%c는 캐릭터 타입

        char result = (input % 2 == 0 ? '짝' : '홀');
        System.out.printf("%d는(은) %c 입니다.\n", input, result);

        String result2 = (input % 2 == 0 ? "짝" : "홀"); //String 처럼 대문자로 시작하는건 레퍼런스 변수. 객체 주소값 저장함.
        System.out.printf("%d는(은) %s 입니다.\n", input, result2);



        System.out.println("--End--");

    }
}
