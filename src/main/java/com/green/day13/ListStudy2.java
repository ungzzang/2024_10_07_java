package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        //Generic 제네릭
        //<> 라는 제네릭을 사용하면 실행시에 타입이 결정이 된다.(E 부분이 Integer 로 바껴서.)
        //제네릭을 사용된 클래스에 타입을 결정하지 않으면 타입은 Object 가 된다.
        //아래 3가지의 결과는 같다. 맘에드는 것 사용
        List<Integer> list = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<Integer>();
        //list.add(""); //정수형 값만 들어갈 수 있는 ArrayList 객체가 만들어짐
        list.add(10); //0번방
        list.add(20); //1번방
        list.add(30); //2번방
        System.out.println(list);
        System.out.println(list.size()); //방 몇칸인지 길이를 알려줌.

        int n1 = list.get(0); //형변환 하지 않아도 된다.

        list.add(1, 60); //1번방에 60 들어가고 원래있던거는 한칸씩 밀려남. 그래서 10, 60, 20, 30 이됨.
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list); //2번방 값 삭제됨. 그래서 10, 60, 30 이됨.
        System.out.println(list.size());

        //lastIndexOf, indexOf 메소드의 리턴값이 -1이면 해당값이 콜렉션에 없음을 의미
        System.out.println("list.lastIndexOf(30): " + list.lastIndexOf(10)); // 값이 몇번째에 있는지 나타냄.
        System.out.println("list.indexOf(30): " + list.indexOf(60));

        list.clear(); //다지움. 그래서 [] 이렇게만 나옴.
        System.out.println(list);
        System.out.println(list.size());


    }
}
