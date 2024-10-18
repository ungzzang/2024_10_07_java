package com.green.day08.ch13;

public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box[] arr = new Box[5]; //대괄호 있으면 박스 배열 객체 주소가 담김
        System.out.println(arr.length);

        //Box b0, b1, b2, b3, b4;

        Box b1 = new Box("안녕"); //대괄호 없으면 박스 객체의 주소가 담김, 대괄호 있는것과는 다르다.
        System.out.println(b1);
        System.out.println(b1.toString());

        arr[0] = b1;
        arr[1] = new Box("하세요");
        arr[2] = new Box("반갑습니다.");
        //arr[3] = new String("ddd"); Box 타입만 가능

        System.out.println("-------------");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

//모든 클래스는 무조건 Object 를 상속받는다.
class Box {
    private String conts;

    Box(String conts) {
        this.conts = conts;
    }

    // 오버라이딩 Overriding, @Override
    public String toString() {
        return conts ;
    }
}
