package com.green.day02.ch05;

import java.util.Scanner;

public class SwitchStudy {
    public static void main(String[] args) {
        String name = new String("홍길동");
        String name2 = new String("홍길동");

        System.out.printf("name: %s\n", name);
        System.out.printf("name2: %s\n", name2);
        System.out.printf("name == name2: %b\n", name == name2);
        System.out.printf("name.equals(name2): %b\n", name.equals(name2));

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 >> ");
        String input = scan.next();

        if("abc".equals(input)) { // if 사용했을때
            System.out.println("def");
        }

        switch(input) { // switch 사용했을때
            case "abc":
                System.out.println("switch-def");
                break;
        }
        System.out.println("--End--");


    }
}
