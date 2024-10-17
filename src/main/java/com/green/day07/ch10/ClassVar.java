package com.green.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt.instNum = 10; //static 이라서 클래스명으로 한거임.
        InstCnt ic1 = new InstCnt(); // 객체 3개 생성.
        InstCnt.instNum = 5;
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }

}

class InstCnt {
    static int instNum ; // 공간이 하나생성. static 이 붙으면 한 공간이라고 생각하자.
    int value; //3개의 객체안에 value 가 각각 들어있음.

    InstCnt() {
        instNum++; //한 공간의 instNum 이 총 3번 ++ 된거.
        value++; //3개의 각 공간의 value 가 하나씩 ++ 된거.
        System.out.println("인스턴스 생성: " + InstCnt.instNum); //InstCnt. 은 같은 공간이라 생략가능. 원래는 적어야 함.
        System.out.println("value: " + value);
    }

}
