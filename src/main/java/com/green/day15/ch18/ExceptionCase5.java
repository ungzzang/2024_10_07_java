package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try {
            System.out.println("a/b ... a?");
            int n1 = scan.nextInt();// 에러발생하면 바로 InputMismatcException e 로 직행함.
            System.out.println("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) { //Exception 은 하상 가장 아래 catch 문에 적을 수 있다. //Throwable e 도 가능함.
            e.printStackTrace();
            e.getMessage();
        }//모든예외 다 잡음.

        System.out.println("---------------------(2)");

        try {
            System.out.println("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.println("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("---------------------(3)");

        try {
            System.out.println("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.println("a/b ... b?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch (Exception e) { //모든 예외를 다 잡는다. 예외의 최상위 class.
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("-- 종료 --");
    }

}
