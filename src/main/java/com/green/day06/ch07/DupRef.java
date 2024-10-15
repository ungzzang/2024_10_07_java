package com.green.day06.ch07;

import com.green.day05.ch07.BankAccountPO;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1; //주소값 복사 == == 얕은 복사 Shallow Copy //오른쪽 객체의 주소값이 왼쪽으로 복사됨.

        ba1.deposit(1000);
        //ba2.deposit(1000); 위와 동일. 같은 주소를 가져서.
        ba2.checkMyBalance();

        //BankAccount ba1 가 의미하는 바는
        //참조변수, 변수명 ba1, 주소값 저장
        //BankAccount 객체 주소값만 저장가능

    }
}
