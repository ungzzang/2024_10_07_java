package com.green.day03.ch05;

public class ContinueBasic {
    public static void main(String[] args) {

        int n = 0;
        int count = 0;

        while((n++) < 100) {
           if(((n % 5) != 0) || ((n % 7) != 0)) { //처음 실행되는 n 값은 1이다.
             continue; //true 면 밑에 스킵.
            }
            count++;
            System.out.println("n: " + n);
        }
        System.out.println("count: " + count);

    }
}
