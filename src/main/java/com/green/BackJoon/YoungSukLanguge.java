package com.green.BackJoon;

import java.util.Scanner;

public class YoungSukLanguge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            String str1 = scan.next();
            String str2 = scan.next();
            String str3 = scan.next();
            String str4 = scan.next();
            String str5 = scan.next();



            for(int i = 0; i <= 15; i++) {
                if(i < str1.length()) {
                    System.out.print(str1.substring(i, i + 1));
                }
                if(i < str2.length()) {
                    System.out.print(str2.substring(i, i + 1));
                }
                if(i < str3.length()) {
                    System.out.print(str3.substring(i, i + 1));
                }
                if(i < str4.length()) {
                    System.out.print(str4.substring(i, i + 1));
                }
                if(i < str5.length()) {
                    System.out.print(str5.substring(i, i + 1));
                }


            }

    }
}

/*String[] str = new String[15];

        String[][] tmp = new String[5][15];

        char[][] ch = new char[5][15];


        for(int i = 0; i < 5; i++){
            for(int z = 0; z < 15; z++){
                ch[i][z] = scan.next().charAt(0);

               if (ch[i][z]==('')) {
                    break;
                }
            }
        }

                //tmp[i][z] = str[z].charAt(z);

        for(int i = 0; i < 15; i++) {
            for (int z = 0; z < 5; z++) {
                System.out.print(tmp[z][i]);
            }
        }*/