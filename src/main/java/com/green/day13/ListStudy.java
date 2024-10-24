package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    /*
        List 인터페이스, Interface(인터페이스)는 객체화 불가능하다.

        인터페이스는 부모역할만 한다.
        List 를 상속받은 class(LinkedList, ArrayList) 가 있다.
        둘 class 는 결과는 똑같은데 처리방식이 다르다.

        LinkedList 는 Node 방식으로 데이터를 다루고,
        ArrayList 는 Array(배열) 방식으로 데이터를 다룬다.

        LinkedList 는 수정 위주의 작업이 많으면 유리하고,
        ArrayList 읽기 위주의 작업이 많으면 유리하다.

        List 변수명 = new ArrayList();
        List 변수명 = new LinkedList();
        이렇게 작성이 가능하다. 자식 객체 주소값은 부모 타입에 저장 가능함을 보인다.
     */

    public static void main(String[] args) {
        List list = new ArrayList();
        //new 옆에는 클래스만 적을 수 있어서 ArrayList 는 클래스다. ArrayList 에는 toString 이 오버라이딩 되어있음.
        list.add(10); // 0번방에 10값이 주입
        list.add(20); // 1번방에 20값이 주입

        ArrayList list2 = (ArrayList) list;
        list2.add(30); // 2번방에 30값이 주입
        list2.add("하하"); // 3번방에 "하하" 주입

        // int[] arr = new int[3];
        //arr[0] = "하하"; int 타입에 스트링 타입이 못들어가는데
        Object[] arr2 = new Object[4]; //Object 타입은 다양한 타입 다 들어갈 수 있음.
        arr2[0] = 10;
        arr2[1] = "하하";

        int val0 = (int)list.get(0); //Object 로 리턴 되었기때문에 (int)로 형변환해서 받는다.
        System.out.println("var0: " + val0);

        //val3 = ??; // 3번 방에 있는 값 읽기
        String val3 = (String)list.get(3);
        System.out.println("var3: " + val3);



        System.out.println(list);
        System.out.println(list2);
    }

}
