package com.green.day07.ch11;

public class StringInst {
    public static void main(String[] args) {
        String str1 = new String("Simple String"); // 개발자들도 이렇게 잘안씀. 잊어도 됨.
        String str2 = "The Best String"; //주로 이렇게 씀 , 이렇게 해도 객체가 생성된거다.

        System.out.println(str1);
        System.out.println(str1.length()); // 문자열의 갯수값.길이.
        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String");
    }

    public static void showString(String str) {
        System.out.println(str);
        System.out.println(str.length());
    }
}
