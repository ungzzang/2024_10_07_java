package com.green.day11.ch14;

public class SuperSubStatic { //파일명과 클래스명이 같을때 public 붙는거 가능, 보통 하나의 파일의 하나의 public, 안붙여도됨.
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount(); // 3
    }
}

class SuperCLS {
    protected static int count;// protected 는 다른패키지라도 상속이면 접근 가능.

    SuperCLS() {
        count++;
    }
}

class SubCLS extends SuperCLS {
    SubCLS(){ //얘가 자동으로 들어간다. //상속되면서 자식의 기본생성자 호출하면서 부모의 기본생성자도 호출한다.
        super();
    }
    void showCount() {
        System.out.println("count: " + count);
    }
}
