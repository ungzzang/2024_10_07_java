package com.green.day16.ch26;
//p.653
//익명 클래스
public class UseAnonymousInner {
    public static void main(String[] args) {
        //익명클래스
        /*
            익명 클래스는 interface 를 implements 한 클래스를 만들지 않고
            다이렉트로 interface 를 implements 한 클래스를 객체화 할 때 사용할 수 있다.
            즉, 코드 작성을 많이 생략할 수 있다.
            익명 클래스 작성보다 더 많이 생략할 수 있는게 람다식이다.
            람다식을 작성할 수 있는 interface 는 오로지 추상메소드 하나만 가지고 있는 경우만
            가능하다. 그래서 보통 람다식을 사용하는 interface 는 @FunctionalInterface
            애노테이션이 붙어있다. 이 애노테이션은 2개의 추상메소드가 있으면 컴파일 에러를
            터트린다.
         */
        Printable p = new Printable() { //1회용. 익명클래스.  이름없음.
            @Override
            public void print() {
                System.out.println("익명클래스 print") ;
            }
        };
        /*
            () 파라미터 부분
            -> 람다식 시작부분
            {} : 중괄호 생략 가능한 경우는 명령이 한줄인 경우 생략 가능하다.
         */

        //적는거 줄일려고 람다사용.
        //람다식은 추상메소드 하나만 갖고있는 애만 사용가능
        //람다식 만들때 추상메소드 이름 안중요, 파라미터는 중요.
        Printable p2 = () -> {  //print() 괄호 비어서 () 사용,
            System.out.println("람다 print"); //위에 "익명클래스 print" 처럼 같은 효과.
            //Printable p2 = () -> System.out.println("람다 print"); 로 한 줄일때는 줄일수 있음.
        };
        p.print();
        p2.print();
    }
}
//인터페이스는 객체화 불가능.
//추상메소드 하나만 가지고 있는 interface 만 람다식을 사용할 수 있다.
@FunctionalInterface //추상메소드 하나만 가질 수 있게 한다.
interface Printable {
    void print();
    //void print2();
}
