package com.green.day02.ch05;

public class MissionIf4Result2 {
    public static void main(String[] args) {

        int score = (int)(Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        char grade = 'D', opt = '0'; // grade 랑 opt 를 디폴트 값으로 정하고 시작하면 줄을 줄일 수 있다.

        if(score >= 90) {
            grade = 'A';
            if(score >=98) {
                opt = '+';
            } else if(score < 94) {
                opt = '-';
            }

        } else if(score >= 80) {
            grade = 'B';
            if(score >=88) {
                opt = '+';
            } else if(score < 84) {
                opt = '-';
            }

        } else if(score >= 70) {
            grade = 'C';
            if(score >=78) {
                opt = '+';
            } else if(score < 74) {
                opt = '-';
            } else {
                opt = ' ';
            }
        }
        System.out.printf("%c%c\n", grade, opt);

        /*
            100점이면 A+
            98이상이면 A+
            94이상 97이하 A0
            90이상 93이하 A-

            88이상 89이하 B+
            84이상 87이하 B0
            80이상 83이하 B-

            78이상 79이하 C+
            74이상 77이하 C0
            70이상 73이하 C-

            나머지 D
         */

        if(score>=98) {
            System.out.println("A+");
        } else if(score >=94 ) {
            System.out.println("A0");
        } else if(score >=90 ) {
            System.out.println("A-");
        } else if(score >=88 ) {
            System.out.println("B+");
        }  else if(score >=84 ) {
            System.out.println("B0");
        }  else if(score >=80 ) {
            System.out.println("B-");
        } else if (score >=78 ) {
            System.out.println("C+");
        } else if (score >=74 ) {
            System.out.println("C0");
        } else if (score >=70 ) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }


        if (score - 98 >= 0){
            System.out.println("A+");
        } else if(score - 94 >= 0){
            System.out.println("A0");
        } else if(score - 90 >= 0) {
            System.out.println("A-");
        } else if(score - 88 >= 0){
            System.out.println("B+");
        } else if(score - 84 >= 0){
            System.out.println("B0");
        } else if(score - 80 >= 0){
            System.out.println("B-");
        } else if(score - 78 >= 0){
            System.out.println("C+");
        } else if(score - 74 >= 0){
            System.out.println("C0");
        } else if(score - 70 >= 0){
            System.out.println("C-");
        } else{
            System.out.println("D");
        }

    }
}
