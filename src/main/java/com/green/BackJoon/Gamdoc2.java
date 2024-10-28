package com.green.BackJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Gamdoc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("방 갯수를 입력하세요");
        double classNumber = scan.nextInt(); //classNumber 는 방의 갯수.


        List<Double> students = new ArrayList<>();

        System.out.println("각 방의 학생 수를 입력하세요");
        for (double i = 0; i < classNumber; i++) {
            double studentNumber = scan.nextInt(); //studentNumber 는 각 방의 학생수.
            students.add(studentNumber);

        }


        System.out.println("총감독관이 맡을 수 있는 학생 수와 부감독관이 맡을 수 있는 학생수를 입력하세요");
        double studentsChong = scan.nextInt(); //총감독관 보는
        double studentsBboo = scan.nextInt(); //부감독관 보는


        double sumBboo = 0; //부감독관
        double sumChong = 0; //총감독관
        double n1 ;
        for (double stu : students) {
            double bboo = stu - studentsChong;
            if (bboo > 0) {
                n1 = bboo / studentsBboo;
                if(bboo % studentsBboo != 0) {
                    sumBboo = n1 + 1;
                } else if(bboo % studentsBboo == 0){
                    sumBboo = n1;
                }
            }  else {
                    sumBboo = 0;
                }


        }
        for(int i = 0; i < classNumber; i++) {
            sumChong += sumChong + 1;
        }
        System.out.println(Math.ceil(sumBboo + sumChong));
    }
}
