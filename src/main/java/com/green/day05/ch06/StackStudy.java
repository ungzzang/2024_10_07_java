package com.green.day05.ch06;

public class StackStudy {
    /*
        Stack: FILO (First In Last Out)
                가장 먼저 들어온 것이 가장 늦게 나간다.

                |   |
                |   |
                |   | 이런 형태.

        111
        kkk
        !!!
        iii 간격이 일정함.

     */


    public static void main(String[] args) { //제일 먼저 스택 쌓임.
        System.out.println("-- main [start] --");
        methodA();
        System.out.println("-- main [end] --");


    }

    static void methodA(){
        System.out.println("---- methodA [start] ----");
        methodB();
        System.out.println("---- methodA [end] ----");
    }

    static void methodB(){
        System.out.println("------ methodB [start] ------");
        // methodB(); 이거는 계속 반복 되기때문에 잘못됨. 끝나는 조건을 넣든가 해야함.
        System.out.println("------ methodB [end] ------");
    }

}
