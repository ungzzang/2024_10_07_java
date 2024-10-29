package com.green.BackJoon;

import java.util.Scanner;

public class BunsuAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numer1, numer2;
        int denom1, denom2;

        numer1 = scan.nextInt();
        denom1 = scan.nextInt();
        numer2 = scan.nextInt();
        denom2 = scan.nextInt();

        int minGongbaesu = 0;
        for(int i = 0; i < 1000000; i++) {
            if((i % denom1 == 0) && (i % denom2 == 0)){
               minGongbaesu = i;
               break;
            }
        }
        int bunja1 = (minGongbaesu/denom1) * numer1;
        int bunja2 = (minGongbaesu/denom2) * numer2;
        int bunjaSum = bunja1 + bunja2;

        int maxGongyaksu=1;
        if(bunjaSum >= minGongbaesu) {
            for(int i = bunjaSum; i > 0; i--){
                if((bunjaSum%i==0) && (minGongbaesu%i==0)){
                    maxGongyaksu = i;
                    break;
                }
            }
        } else if(bunjaSum < minGongbaesu) {
            for(int i = minGongbaesu; i > 0; i--) {
                if((bunjaSum%i==0) && (minGongbaesu%i==0)){
                    maxGongyaksu = i;
                    break;
                }
            }
        }

        System.out.printf("%d/%d + %d/%d = %d/%d\n", numer1, denom1, numer2, denom2, (bunjaSum/maxGongyaksu),(minGongbaesu/maxGongyaksu) );

    }
}
