package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {
        //레퍼런스 타입은 객체의 주소 저장.

        // BankAccount.deposit(4000);
        // ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수이다.
        BankAccount ba = new BankAccount(); // 객체 생성. //주소값이 저장. 객체는 new 무조건 있어야 됨.
        // new 로 객체를 만들고 메모리에 올라가서 주소값이 리턴되서 복사되고 ba로 저장.

        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();

        BankAccount ba3 = new BankAccount(); // ba 와 ba3 은 다른 공간. 이렇게 다른 값을 원할때 static 대신 씀.
        ba3.checkMyBalance(); //balance: 0
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance(); //balance: 39000

        ba.checkMyBalance(); //balance: 3000

        //BankAccount ba2 = new String("안녕"); //ba2는 BankAccount 객체 주소값만 담을 수 있다., ba2는 String 객체 주소값을 담을 수 없다.
        String str = new String("안녕");


    }
}
