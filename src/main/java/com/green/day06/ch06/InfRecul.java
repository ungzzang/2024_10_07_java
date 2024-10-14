package com.green.day06.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }

    public static void showHi(int cnt) {
        System.out.println("Hi ~~ ");
        if(cnt == 1){
            return;
        }
        showHi(--cnt);
        //showHi(cnt--); // X ,3이 계속 반복됨, 평행세계의 메소드에 3이 들어가는걸 반복한다고 생각. 뒤에 마이너스 붙어봤자 평행세계랑 상관이없음.
        //showHi(--cnt); // O , 바로 감소 된후 평행세계로 들어가는 거라 3, 2, 1로 들어감.
        //showHi(cnt - 1); // O
    }
}
