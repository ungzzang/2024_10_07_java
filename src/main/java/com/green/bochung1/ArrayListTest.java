package com.green.bochung1;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
    /*
        배열의 단점을 보완한 것인 ArrayList라고 생각하면 된다.
        - 배열은 길이가 고정이다.(단점)
        - 몇번방(index)를 꼭 지정해주어야 한다. >> 실수할 가능성이 생긴다.
     */

    //제네릭 안에 타입지정 해야함. 안쓰면 오브젝트타입이라 다 들어가서 별로다.
    //타입형 쓰는 장점이 없어짐.
    public static void main(String[] args) {

        //처음에 방 0개로 시작, add할때마다 방만들고 복사후 삭제 반복.
        // List<Integer> list3 = new LinkedList<>(); 읽기느림, 우리 잘안씀
        List<Integer> list = new ArrayList<>();

        //근사치값 넣어주는게 좋다. 복사복사하는 과정 적게 할수 있음.
        // 10개방을 넘지않는한 새로운방을 안만든다.
        List<Integer> list2 = new ArrayList<>(10);

        list2.add(10); //0번방
        list2.add(20); //1번방
        list2.add(30); //2번방
        list2.add(40); //3번방
        list2.add(50); //4번방

        //없는 방 출력하면 indexOutOf
        System.out.println(list2.get(3)); // list2의 3번방 가져오기
        System.out.println("size: " + list2.size()); //배열과 다르게 메소드로한다.

        // N+1이슈 : select 한번했는데 튜플이 만약 5개 넘어오면 셀렉트를 5번 더한다고 해서.
        // 피드 하나에 사진이 몇장씩 있을때 각 피드 들고올때 한번, 피드당 사진 호출 한번씩


        /*
        List<Integer> 일 때만 remove(int index)로만 삭제 가능하다.
        List<Integer> 아닐때는 index가 아니라 넣었는 data로도 삭제 가능하다.
         */
        System.out.println(list2.remove(10));
    }
}
