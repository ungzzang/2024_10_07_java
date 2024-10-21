package com.green.day10.ch13;

import java.io.StringBufferInputStream;

public class MissionTwoDimenArrayToObject {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("영수", 100, 90, 80);
        arr[1] = new Student("상철", 90, 90, 80);
        arr[2] = new Student("광수", 80, 70, 60);

        Student youngSu = arr[0];
        System.out.println(youngSu.getKorScore() + youngSu.getEngScore());
        System.out.println(youngSu.getAllScore());
        System.out.println("---------------------");

        printStudentsInfo(arr);
        printKorScores(arr); //국어 - 합계점수?, 평균점수? //같은 class, static, void
        printEngScores(arr); //영어
        printMathScores(arr); //수학
        printTotalSubjectScore(arr); //학급 - 합계점수?, 평균점수?

//        for(Student stu : arr) {
//            //System.out.printf("%s - 국어: %3d, 영어: %d, 수학: %d ");
//            System.out.println(stu);
//        }
    }

    public static void printStudentsInfo(Student[] students) {
        for(Student stu : students) {
            System.out.println(stu);
        }
    }

    public static void printKorScores(Student[] students) {
        int totalKorScore = 0;
        for(Student item : students) {
            totalKorScore += item.getKorScore();
        }
        float avgKorScore = (float)totalKorScore / students.length;
        System.out.printf("국어 - 합계점수: %3d, 평균점수: %.1f\n", totalKorScore, avgKorScore);

    }

    public static void printEngScores(Student[] students) {
        int totalEngScore = 0;
        for(Student item : students) {
            totalEngScore += item.getEngScore();
        }
        float avgEngScore = (float)totalEngScore / students.length;
        System.out.printf("영어 - 합계점수: %3d, 평균점수: %.1f\n", totalEngScore, avgEngScore);

    }

    public static void printMathScores(Student[] students) {
        int totalMathScore = 0;
        for(Student item : students) {
            totalMathScore += item.getEngScore();
        }
        float avgMathScore = (float)totalMathScore / students.length;
        System.out.printf("수학 - 합계점수: %3d, 평균점수: %.1f\n", totalMathScore, avgMathScore);

    }

    public static void printTotalSubjectScore(Student[] students) {
        int totalSum = 0;
        for(Student item : students) {
            totalSum += item.getAllScore();
        }
        float totalAvg = (float)totalSum/(students.length * Student.SUBJECT_CNT);
        System.out.printf("학급 - 합계점수: %d, 평균점수: %.1f\n", totalSum, totalAvg);
    }

}

class Student { // Student  처럼 객체 하나를 만들어 묶어서 해결하는방법이 객체지향적으로 하는거.
    public static final int SUBJECT_CNT = 3; //우리가 관리하는 과목의 수.
    private String name; // private 되어 있으므로 getter 무조건 있어야함.
    private int korScore; //국어 점수
    private int engScore; //영어 점수
    private int mathScore; //수학 점수

    Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getKorScore() {
        return korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getAllScore() { //합계는 이렇게 메소드를 만들어 기능 추가를 통해 나타낼수있다.
        return korScore + engScore + mathScore;
    }

    @Override
    public String toString() {
        int totalScore = getAllScore();
        return String.format("%s - 국어: %3d, 영어: %3d, 수학: %3d | 합계점수: %d, 평균점수: %.1f"
                    , name, korScore, engScore, mathScore, getAllScore(), (float)totalScore / SUBJECT_CNT);
    }

}
