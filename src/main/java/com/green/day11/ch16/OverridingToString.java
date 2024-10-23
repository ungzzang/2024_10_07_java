package com.green.day11.ch16;

public class OverridingToString {
    public static void main(String[] args) {
        Cake c = new Cake();
        System.out.println(c);
        System.out.println(c.toString()); //바로 윗줄이랑 같은거. toString() 생략가능.

        System.out.println(c.equals(c.toString()));// c랑 c.toString 은 타입이 달라 주소가 다름 . false
        CheeseCake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake);

        Cake c2 = cheeseCake; // cheeseCake 가 갖고있는 주소가 c2 에 저장됨.
        System.out.println(c2); // 실행이 된다면 cheeseCake 나 c2 나 똑같다.


    }
}

//class 앞에 final 키워드가 있으면 상속 금지
//대표적으로 String 클래스는 상속이 불가능
class Cake extends Object{ // 부모가 똑같은 메소드를 가지고 있어야됨. 여기서는 Object 가 toString 을 갖고 있음.
    @Override //오버라이딩 실수 방지용, 오버라이딩이 아닐 시 컴파일 에러
    public String toString() {
        return "My birthday cake";
    }

    final void blowCandle() { // final 을 붙이면 오버라이딩 금지!(컴파일 에러뜸)
        System.out.println("초를 분다.");
    }
}

final class CheeseCake extends Cake {
    @Override
    public String toString() {
        return "My birthday cheese cake";
    }

    //자식에서 blowCandle 오버라이딩을 할 수 없다.
    //부모메소드에 final 키워드가 있기 때문
//     void blowCandle() {
//        System.out.println("초를 분다.");
//    }

}

//상속을 받을 수 없다.
//class chocolateCheeseCake extends CheeseCake {
//
//}
