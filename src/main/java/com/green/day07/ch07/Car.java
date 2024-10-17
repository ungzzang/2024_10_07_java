package com.green.day07.ch07;

public class Car {
    private String color ;
    private String gearType; //auto, manual
    private int door;

    // 정의할 때 생성자와 메소드 다른 점 2가지
    // 1. 이름은 클래스 명과 같다.
    // 2. 리턴타입 안됨.

    /*
        this 사용법은 2가지가 있다.
        1. this.  : 멤버필드, 멤버메소드 사용, this. 을 생략 가능할 때가 있다.
        2. this() : 생성자에서 다른 생성자 호출시 사용 가능.

        this 는 나 자신을 가리키는 상수.
     */

    public Car() {
//        color = "white";
//        gearType = "auto";
//        door = 4;
        this("white", "auto", 4); //this 가 밑에 Car를 호출, "white"가 col, "auto" 가 gear, 4 가 doo 를 호출.

        //this.introduce();
        //introduce(); //this. 생략가능
    }

    public Car(String col, String gear, int doo) {
        this.color = col; //  매개변수명이 멤버필드명과 달랐다면 this. 을 생략할 수 있다.
        this.gearType = gear;
        this.door = doo;

    }

    public Car(String gearType, int door) {
        this("white", gearType, door); // "white" 처럼 계속 이 값만 나오게 하는것: 하드코딩(기본생성자로 객체 생성시 항상 같은 값이다.)
    }

    public void introduce() {
        //this("dd", "ddd", 12);
        //introduce 메소드가 호출이 된다는 말은 이미 객체생성이 끝난 이후다
        //생성자는 객체 생성시에만 호출할 수 있기 때문에 객체 생성 이후에는 호출 불가다.

        System.out.printf("%s 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n"
                            , color, gearType, door);
    }


}

class CarTest{
    public static void main(String[] args) {
        // main 메소드의 내용을 수정하지 않고
        // "white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차" 이 표시될 수 있게 해주세요.
        Car c1 = new Car();
        c1.introduce();

        Car c2 = new Car();
        c2.introduce();

        //"red 컬러의 manual 기어를 가진 5개이 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
        Car c3 = new Car("red", "manual", 5);
        c3.introduce();

        //"white 컬러의 auto 기어를 가진 6개의 문짝이 있는 자동차"가 표시 될 수 있게 해주세요.
        Car c4 = new Car("auto", 6);
        c4.introduce();

    }
}
