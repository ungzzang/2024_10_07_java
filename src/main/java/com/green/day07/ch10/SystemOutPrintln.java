package com.green.day07.ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {
        //System.abc.kkk().ggg      // .앞에는 객체의 주소값이 저장되어 있다고 생각하면된다. 물론 대문자인 친구 말고(System 같은애)

        //System.abc 의 결과물을 "A" 지칭하자.
        //A.kkk().ggg

        //A.kkk() 의 결과물을 "B" 지칭하자

        //B.ggg

        //System: 클래스
        //abc: 참조변수, 멤버필드 //뒤에 붙은 점으로 알수 있다. 왜냐면 기능이 없다면 . 이 못붙음.
        //kkk(): abc가 가리키고 있는 객체의 메소드, 리턴 메소드 , 리턴타입은 참조타입. // 리턴메소드인 이유는 뒤에 .ggg가 붙어있어서, 참조인 이유는 또 점이있어서
        //ggg: kkk()메소드가 리턴하는 멤버필드, 더이상의 정보 없음.

        System.out.println();

        PrintStream fff = System.out; //out에 담겨있는 주소값이 fff 라는 지역변수에 똑같이 저장
        fff.println();

        System.out.println();
        //System: 클래스
        //out: static final 멤버필드, PrintStream 객체의 주소값을 담을 수 있다.
        //println(): 메소드

        /*
            PrintStream 은 println(int i), println(char c), println(String str) 등의
            메소드를 가지고 있고 이것은 오버로딩이다.
            만약 오버로딩이 없다면
            printlnInt(int i), printlnChar(char c), printlnString(String str)
            이런식으로 메소드를 만들어야만 한다.

         */
    }
}
