package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay(); //0 -> 1
        aw.increaseCnt(); // 1 -> 2
        aw.num++; // 2->3
        AccessWay.num++; // 객체화 안해도 쓸수 있는걸 보여주는거. 3->4
        System.out.printf("num: %d\n", AccessWay.num); // 클래스명.static 변수 or 메소드, 이렇게 사용 할 수 있다.
        System.out.printf("num: %d\n", aw.num); // 가능은 하나 static 때문에 객체화를 하지 않기 때문에 쓸일이 없다.
    }
}

class AccessWay {
    static int num = 0;

    AccessWay() {
        increaseCnt();
    }

    void increaseCnt() { // static 이 아닌 메소드에서 static 호출가능. 반대로 static이 non 호출 불가.
        num++;
    }
}
