package com.green.day03.ch05;

public class InfinityLoop {
    public static void main(String[] args) {
        int n = 1;
        while(true) { // 항상 true 이고 if break 조합으로 do-while 안써도 됨. 쌤 픽
            if((n % 6) == 0 && (n % 14) == 0) {
                break;
            }
            n++;
        }
        System.out.printf("n: %d\n", n); //  멈추는 조건 없으며 실행안됨. 접근안됨.
    }
}
