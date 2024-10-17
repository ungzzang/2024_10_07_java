package com.green.day07.ch10;

import static java.lang.Math.*; // *은 all(전부) 의 의미가 있다.
//Math 클래스 아래에 있는 static 멤버필드, 멤버메소드 전부 import 하라는 의미
//TDD 하게 되면 사용한다.

public class StaticImport {
    public static void main(String[] args) {
        /*
        원래는 아래처럼 작성을 히야하지만
        System.out.println( Math.E ); // E가 소괄호 안갖고 있으므로 멤버필드임, 객체화 없었으므로 static이다
        System.out.println( Math.random() ); // random 소괄호 있으므로 메소드이다, 소괄호에 감싸졌으므로 리턴타입의 double이다.

        static import 선언을 하면
        */
        System.out.println(E);
        System.out.println(random());
    }

}
