package com.green.bochung1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";
        String str3 = "C";
        String str4 = "D";
        String str5 = "E";

        //<String> 실행될때 제네릭이 설정됨.
        List<String> list = new ArrayList<>(4);
        list.add(str1); //0
        list.add(str2); //1
        list.add(str3); //2
        list.add(str4); //3

        System.out.println(list); //[A, B, C, D]
        System.out.println(list.get(1)); //B
        //System.out.println(list.remove(1)); //B, 삭제된것도 리턴해준다.
        //System.out.println(list);
        //index로 삭제
        System.out.println(list.remove(1));  //remove 타입은 <E>이고 위에 List<String>이라서 E는 String이됨.
        System.out.println(list);
        //data로 삭제
        System.out.println(list.remove(str3)); //여기 remove는 str3인 String을 삭제한다고 하면 불린타입됨
        //data로 삭제 시도 (없으면 return false)
        System.out.println(list.remove(str5));
        System.out.println(list);
    }
}
