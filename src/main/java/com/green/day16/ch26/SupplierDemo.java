package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int)(Math.random() * 50.0); //0~49, () 는 파라미터 없는거
        Supplier<Integer> supRandom2 = () -> (int)(Math.random() * 31 + 20);

        System.out.println(supRandom.get()); //리턴으로 공급만 함, get()은 값을 가져온다.

        //랜덤 정수값 (0~49) 5개를 가지고 있는 ArrayList 를 리턴
        List<Integer> list = makeIntList(supRandom, 5);
        System.out.println(list);

        //랜덤 정수값(20~50) 8개를 가지고 있는 ArrayList 를 리턴
        List<Integer> list2 = makeIntList(supRandom2, 8);
        //List<Integer> list2 = makeIntList(() -> (int)(Math.random() * 31 +20), 8); 이렇게 바로 적어도 됨.

        System.out.println(list2);

    }
    static List<Integer> makeIntList(Supplier<Integer> sup, int len){
        List<Integer> list = new ArrayList<>(len); //(len)처럼 근사치 값 넣어높으면 성능 좋아짐.
        //ArrayList ar = new ArrayList();
        for(int i = 0 ; i < len; i++){
            list.add(sup.get());
        }
        return list;
    }

}
