package com.green.day06.ch07;

public class BankAccount {
    int balance = 0; //객체에 밸런스라는 공간이 생김.

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() { // 내가 가지고 있는 밸런스값 출력.
        System.out.printf("balance: %d\n", balance);
    }


}
