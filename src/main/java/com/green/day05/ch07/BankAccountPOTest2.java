package com.green.day05.ch07;

public class BankAccountPOTest2 {
    public static void main(String[] args) { //static은 객체화 해서 사용안함. new 붙은건 static 없을때 씀
       // static 은 묻지도 않고 메모리에 올라감. static 은 객체화랑 상관이 없음.
        BankAccountPO po1 = new BankAccountPO();
        po1.deposit(1000);
        po1.checkMyBalance();

        BankAccountPO po2 = new BankAccountPO();
        po2.checkMyBalance();

        BankAccountPO.checkMyBalance(); //객체화 없이 클래스명으로도 사용가능한게 static. static 은 이렇게 쓰는거.
    }
}
