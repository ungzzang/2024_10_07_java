package com.green.day15.ch18;
/*
    자바의 정석 p.429 있는 예제
 */

public class Exception12 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-- End --");
    }
    //throws Exception 은 내가 예외가 발생하면 나를 호출한 곳으로 예외를 던진다는 것.
    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception {
        throw new Exception("하하"); //throw 는 리턴과 비슷한데 이건 예외를 보냄.
        //throws 메소드에서만 사용할 수 있는게 아니고 예외를 일부로 발생시키고 싶을 때
    }
} //throws Exception 으로 같이 던지거나 try-catch 로 감싸기 2가지 방법으로 해결.
