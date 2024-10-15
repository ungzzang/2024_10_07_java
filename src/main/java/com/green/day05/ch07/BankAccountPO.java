package com.green.day05.ch07;

public class BankAccountPO {
    static int balance = 0; // static 전역변수 (멤버필드) // 인스턴스 멤버필드는 static 사용안됨.
    // static 전역변수, 선언된 이후부터 중괄호 안에서 끝까지.
    // static 이 붙으면 살아있음. 객체화 작업이 필요없음. 근데 객체는 아님.


    static int deposit(int amount) { // 입금을 담당하는 메소드
        balance = balance + amount;
        //balance += amount; 위와 같음.복합식.
        return balance; // 속성의 값을 리턴할 수 있다.
    }

    static int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }

    static int checkMyBalance(){
        System.out.println("잔액: " + balance);
        return balance;
    }


    /*
    public static void main(String[] args) {
        System.out.println("balance: " + balance);
        int deposit = BankAccountPO.deposit(2000); //static 이라 다이렉트로 호출가능한거.

        System.out.println("balance: " + balance);

        System.out.println("deposit: " + deposit);

    } // 같은 공간에서 하면 BankAccountPO 는 빼도 됨.

    */


}
