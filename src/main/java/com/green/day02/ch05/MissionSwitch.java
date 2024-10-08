package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        // 남성은 172cm, 여성은 159cm 평균
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (w/m) >> ");
        String gender = scan.next();
        System.out.print("키를 정수값으로 입력해 주세요 (cm) >>  ");
        int height = scan.nextInt();


        //당신은 평균입니다.
        //당신은 평균보다 큽니다.
        //당신은 평균보다 작습니다.

        //만약 성별: "남", 키: 162 >> 당신은 평균입니다.
        //만약 성별: "여", 키: 160 >> 당신은 평균보다 큽니다.

        switch(gender){
            case "w":
                gender = "여";
                if(height > 159) {
                    System.out.println("당신은 평균보다 큽니다.");
                } if(height < 159) {
                System.out.println("당신은 평균보다 작습니다.");
            } else {
                System.out.println("당신은 평균입니다.");
            }
                break;

            case "m":
                gender = "남";
                if(height > 172) {
                    System.out.println("당신은 평균보다 큽니다.");
                } if(height<172) {
                System.out.println("당신은 평균보다 작습니다.");
            } else {
                System.out.println("당신은 평균입니다.");
            }
        }
        System.out.printf("성별: %s, 키: %d\n", gender, height);

    }
}
