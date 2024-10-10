package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 때) 1,000을
            넘어서는지, 그리고 1,000을 넘어선 값은 얼마가
            되는지 계산하여 출력
         */

        int i = 1;
        int sum = 0;
        int count = 0;

        while(true) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.printf("%d: %d\n",count, sum);
                count++;

                if (sum >= 1000) {
                    System.out.println("더한값: " + i);
                    System.out.println("넘은값: " + sum);
                    break;
                }
            }
            i++;
        }
        System.out.println("conut: " + (count-1));
    }
}

/*
    int i = 1;
    int odd = 0;
    while(odd <1000) {
        i++;
        if(i % 2 == 1) { //i 값을 2로 나눴을 때 나머지값이 1이면 >> 홀수
                            //odd = odd + i;
           System.out.println("i: " + i);
           odd += i;
       }
    }
    System.out.println("마지막 더한값: %d\n", i);
    System.out.println("odd: " + odd);

 */
