package com.green.day06.ch07;

public class BankAccountPOTest {
    public static void main(String[] args) {
        System.out.println("balance: " + BankAccountPO.balance);

        int deposit = BankAccountPO.deposit(4000); //static 이라 다이렉트로 호출가능한거.
        deposit = BankAccountPO.deposit(4000);

        System.out.println("balance: " + BankAccountPO.balance);

        System.out.println("deposit: " + deposit);

        deposit = BankAccountPO.withdraw(2000);
        System.out.println("deposti: " + deposit);

        BankAccountPO.checkMyBalance(); // 별로 좋지 않은 코드. 리턴필요없는데 리턴해서.

        deposit = BankAccountPO.checkMyBalance();
        System.out.println("잔액2: " + deposit);

    }
}
