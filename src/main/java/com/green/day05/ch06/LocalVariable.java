package com.green.day05.ch06;

// 지역 변수
public class LocalVariable {

    static int aaa = 11; //전역변수 //LocalVariable 중괄호 안에 살아있다.

        /*
            Scope(스코프): 변수가 살아있는 범위
                          (변수의 접근 가능 영역)
                          (변수가 소멸되지 않고 존재할 수 있는 영역)
            선언된 변수에서 나를 감싸고 있는 가장 가까이 있는 {} 안에서만 살아있다.
            (물론 선언된 이후)
         */

    public static void main(String[] args) {
        boolean ste = true;
        int num1 = 11; // 스코프 안에 이게 살아있음.
        System.out.println(num1);

        if(ste) {
            //int num1 = 22; 이건 안된다. num1이 살아있어서 같은 이름 안됨.
            int num2 = 22;
            num1++;
            System.out.println(num1);
            System.out.println(num2);
        }
        //System.out.println(num2); num2가 죽어서 이거 안됨, num2의 스코프는 사라졌다.
        {
            int num3 = 33;
            num3++;
            System.out.println(num3);
        }
        //System.out.println(num3); num3가 죽어서 이거 안됨, num3의 스코프는 사라졌다.

        for(int i = 0; i < 10; i++){ //int i=0;을 위로 올리면 넓은 범위로 사용가능. 근데 좁은게 버그 덜 남.

        }
        //System.out.println(i); // i 의 스코프는  for 문 바깥에서는 사라진다.
        // for 문 초기화 공간에서 생성된 변수는 for 문 안에서만 사용가능하다.



    }

    public static void multiply(int n1){ //메소드 안에 있으면 지역변수.
        int num1 = 11;
    }

    public static void sum(int n1){
        int num1 = 11;
        // main 메소드에서 사용한 변수명이지만 main 메소드 중괄호를 벗어나게 되면
        // num1은 scope 가 없기 때문에 num1 을 sum 메소드에서 선언 할 수 있다.
    }

}
