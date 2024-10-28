package com.green.BackJoon;

import java.util.Scanner;

public class YoungSukLanguge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

          String[] str = new String[15];

        String[][] tmp = new String[5][15];

        char[][] ch = new char[5][15];


        for(int i = 0; i < 5; i++){
            for(int z = 0; z < 15; z++){
                ch[i][z] = scan.nextLine().charAt(z);


            }
        }

                //tmp[i][z] = str[z].charAt(z);

        for(int i = 0; i < 15; i++) {
            for (int z = 0; z < 5; z++) {
                System.out.print(ch[z][i]);
            }

        }
    }
}

