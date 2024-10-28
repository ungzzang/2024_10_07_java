package com.green.BackJoon;

import java.util.Scanner;

public class Gamdoc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.println("시험장의 갯수: ");
        n = scan.nextInt();

        int[] a = new int[n];
        System.out.println("응시자의 수: ");

        for(int i = 0; i < n; i++ ){
            a[i] = scan.nextInt();
        }

        int b, c;
        int[] tmp = new int[n];
        System.out.println("감시 가능한 수: ");
        b = scan.nextInt();
        c = scan.nextInt();
        for(int i = 0; i < n; i++){
            if((a[i]-b) < 0) {
                tmp[i] =  1;
            } else if((a[i]-b)%c == 0) {
                tmp[i] = (a[i]-b)/c + 1;
            }
            else if((a[i]-b)%c != 0){
                tmp[i] = (a[i]-b)/c + 2;
            }
        }

        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum += tmp[i];
        }
        System.out.println("감독관의 최소 수: " + sum);
     }
}

/*
    시험장의 갯수 N   (1 ≤ N ≤ 1,000,000)
    각 시험장에 있는 응시자의 수 Ai     (1 ≤ Ai ≤ 1,000,000)
    총감독관 B  부감독관 C   (1 ≤ B, C ≤ 1,000,000)

    필요한 최소 감독관 수 출력.
 */

/*
    N = 3
    a1, a2, a3 ->> for(int i = 1; i <= N; i++)


    A1 = 5, A2 = 8, A3 = 8

    B = 3, C = 2
 */