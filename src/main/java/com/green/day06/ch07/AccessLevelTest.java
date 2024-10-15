package com.green.day06.ch07;

//import com.green.day06.ch09.Circle2; // 디폴트 지시어는 다를 패키지에서는 접근 불가능하다.
import com.green.day06.ch09.InfoHideCircle; //다를 패키지에 있는 클래스면 import 를 하여 사용한다.

public class AccessLevelTest {
    public static void main(String[] args) {
       InfoHideCircle ihc = new InfoHideCircle();
       //InfoHideCircle 은 public 이기 때문에 다른 패키지에서 접근가능하다.

        String str = "String 은 워낙 자주 사용하기 때문에 자동으로 import 가 된다.";

        //Circle2 c = new Circle2();


    }
}
/*
    class 키워드 앞에 public 을 붙일 수 있는 경우는
    java파일명과 class명이 일치할 때만 붙일 수 있다.
    나머지는 불가능
    주로 1 class 랑 1 file 만든다.
 */

//public class AccessLevel {
class AccessLevel {

}