package com.green.day16.ch23;

import java.util.*;

public class HashMapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //key 와 value
        map.put("홍길동", "시계");
        map.put("권혜지", "자바책");
        map.put("이정민", "빈 캔");
        map.put("1", "ㅋㅋㅋ");
        map.put("홍길동", "두번째 시계");

        String v =  map.get("홍길동");
        System.out.println("v: " + v);

        System.out.println(map.keySet());

        System.out.println(map.get("김수지"));
        System.out.println(map.get("권혜지"));
        System.out.println(map.get("이정민"));
        System.out.println(map.get(1));
    }
}
