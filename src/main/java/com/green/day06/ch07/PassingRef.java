package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.deposit(1000);
        ba1.deposit(2000);

        BankAccount ba2 = ba1;
        ba2.checkMyBalance();
        ba1.checkMyBalance();

        ba2 = null; // null 의 의미는 아무런 객체를 가르키고 있지 않다.(주소값이 없다.) 위에서 주소 저장된걸 해제하고 싶을때 사용.
        if(ba2 != null){ // null 체크
            ba2.checkMyBalance();
        }
        // null 상태에서 메소드 호출을 하면 NullPointException 이 발생한다.
        // 지금 ba2는 객체를 몰라서 런타임 에러뜸. 이런 에러 잘뜨니까 null 체크해야함.


        // null = new BankAccount(); 이렇게 안된다. null 자체는 리터럴, 값 그 자체라서 저장안됨.
        // ba2 = new BankAccount(); // 새롭게 주소값 저장할 수 있다. 왜? 변수기 때문 // 이렇게 다시 설정 가능.


        check(ba1);

        // 만약 아래처럼 적었다면 check 메소드는 non-static 메소드이다.
        // non-static 으로 밑에 check 메소드 만들었을때 이렇게 객체화 필요.
        /*
        PassingRef pf = new PassingRef();
        pf.check(ba);
        */

        // 1. void, return: void 답
        // 2. static, non - static: check(ba)로 다이렉트로 써서 static 이 답

    }

    static void check(BankAccount ba) {
        ba.checkMyBalance(); // balance: 1000

    }
}
