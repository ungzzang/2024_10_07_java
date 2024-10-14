package com.green.day06.ch06;

public class StackStudy {
    public static void main(String[] args) {
        System.out.println("-- main [start] --");
        methodA();
        System.out.println("-- main [end] --");


    }

    static void methodA(){
        System.out.println("---- main [start] ----");
        methodB();
        System.out.println("---- main [end] ----");
    }

    static void methodB(){
        System.out.println("------ main [start] ------");
        // methodB(); 이거는 계속 반복 되기때문에 잘못됨. 끝나는 조건을 넣든가 해야함.
        System.out.println("------ main [end] ------");
    }

}
