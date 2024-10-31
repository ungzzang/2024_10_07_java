package com.green.day16.ch26;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> cons = n -> { if( n < 0){ n = -n;
            }System.out.println(n); };
        //System.out.println(n < 0 ? -n : n); 이렇게 적어도 됨.

        cons.accept(10); //콘솔에 "10"
        cons.accept(-20); //콘솔에 "20"
        cons.accept(-30); //콘솔에 "30"
        cons.accept(30); //콘솔에 "30"

        Consumer<String> cons2 = s -> System.out.printf("%s는(은) %d글자입니다.\n", s, s.length());

        cons2.accept("abc"); //콘솔에 "abc는(은) 3글자입니다."
        cons2.accept("dddd"); //콘솔에 "dddd는(은) 4글자입니다."
    }

}
