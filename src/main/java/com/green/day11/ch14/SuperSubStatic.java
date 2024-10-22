package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount(); // 3
    }
}

class SuperCLS {
    protected static int count;

    SuperCLS() {
        count++;
    }
}

class SubCLS extends SuperCLS {
    SubCLS(){ //얘가 자동으로 들어간다.
        super();
    }
    void showCount() {
        System.out.println("count: " + count);
    }
}
