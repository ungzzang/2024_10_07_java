package com.green.BackJoon;

import java.util.Scanner;

public class MinGongBaeSu2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//        Viewer v = new Viewer();
            int input = sc.nextInt();
            int[] n = new int[input];
            int cnt = 0;
            int viewer;
            int viewer2;
            for(int i = 0; i < input; i++){
                n[i] = sc.nextInt();
            }
            viewer = sc.nextInt();
            viewer2 = sc.nextInt();
            for(int i = 0; i < input; i++){
                n[i] -= viewer;
                cnt++;
                while (true){
                    if(n[i] <= 0){
                        break;
                    }
                    cnt++;
                    n[i] -= viewer2;
                }
            }
            System.out.print(cnt);

    }
}
