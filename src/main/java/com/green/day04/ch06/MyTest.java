package com.green.day04.ch06;
import java.util.Scanner;

public class MyTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("행 수를 입력하세요: ");
            int rows = scanner.nextInt(); // 사용자가 입력한 행 수

            // 상단 삼각형
            for (int i = 1; i <= rows; i++) {
                // 공백 출력
                for (int j = i; j < rows; j++) {
                    System.out.print(" "); // 공백
                }
                // 별 출력
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*"); // 별
                }
                System.out.println(); // 다음 줄로 이동
            }

            // 하단 삼각형
            for (int i = rows - 1; i >= 1; i--) {
                // 공백 출력
                for (int j = rows; j > i; j--) {
                    System.out.print(" "); // 공백
                }
                // 별 출력
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*"); // 별
                }
                System.out.println(); // 다음 줄로 이동
            }

            scanner.close(); // Scanner 종료
        }


}
