package com.green.day15.ch18;

public class ExceptionCase2 {
    /*
        try-catch 문 (예외 처리)
        try 문에 에러가 날 가능성이 있는 코드를 위치한다.
        만약에 예외가 발생이 된다면 catch 부분이 실행이 된다.
        예외가 발생되지 않는다면 catch 부분이 실행이 되지 않는다.
        if 문과 유사함.
     */
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 2;

        try{
            System.out.printf("%d / %d = %d\n",n1, n2, (n1 / n2));
        } catch (ArithmeticException e) { //e 에 에러에 대한 주소가 담김
            e.printStackTrace(); //try-catch 문이 없었다면 콘솔에서 봤을 내용을 찍는다.
            System.out.println(e.getMessage()); // 에러메세지를 가져와서 출력.
        }
        System.out.println("--종료--");
    }
}
