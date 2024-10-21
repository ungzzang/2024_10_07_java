package com.green.day10.ch13;

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학, 사회
                {100, 90, 80, 10}, //영수
                {90, 90, 80, 20}, //상철
                {80, 70, 60, 30}, //광수
                {90, 75, 66, 40}, //민우
        };
        /*
            영수: 합계점수, 평균점수
            상철: 합계점수, 평균점수
            광수: 합계점수, 평균점수
            국어: 합계점수, 평균점수
            영어: 합계점수, 평균점수
            수학: 합계점수, 평균점수
            학급: 합계점수, 평균점수
         */

        /* //내가 작성한거
        int[] youngSU = score[0];
        int[] sangChul = score[1];
        int[] gwangSu = score[2];

        double sum1 = 0;
        for(int i = 0; i < youngSU.length; i++){
            sum1 += youngSU[i];
        }
        System.out.printf("영수의 합계점수: %.1f,\t", sum1);
        System.out.printf("평균점수: %.1f\n", sum1/youngSU.length);
        System.out.println();

        double sum2 = 0;
        for(int i = 0; i < sangChul.length; i++){
            sum2 += sangChul[i];
        }
        System.out.printf("상철의 합계점수: %.1f,\t", sum2);
        System.out.printf("평균점수: %.1f\n", sum2/sangChul.length);
        System.out.println();

        double sum3 = 0;
        for(int i = 0; i < gwangSu.length; i++){
            sum3 += gwangSu[i];
        }

        System.out.printf("광수의 합계점수: %.1f,\t", sum3);
        System.out.printf("평균점수: %.1f\n", sum3/gwangSu.length);
        System.out.println();

        double koreanSum = youngSU[0] + sangChul[0] + gwangSu[0];
        System.out.printf("국어의 합계점수: %.1f,\t", koreanSum);
        System.out.printf("평균점수: %.1f\n", koreanSum/score.length);
        System.out.println();


        double englishSum = youngSU[1] + sangChul[1] + gwangSu[1];
        System.out.printf("영어의 합계점수: %.1f,\t", englishSum);
        System.out.printf("평균점수: %.1f\n", englishSum/score.length);
        System.out.println();

        double mathSum = youngSU[2] + sangChul[2] + gwangSu[2];
        System.out.printf("수학의 합계점수: %.1f,\t", mathSum);
        System.out.printf("평균점수: %.1f\n", mathSum/score.length);
        System.out.println();

        double sum4 = 0;
        for(int i = 0; i< youngSU.length; i++) {
            sum4 += youngSU[i] + sangChul[i] + gwangSu[i];
        }
        System.out.printf("학급의 합계점수: %.1f,\t", sum4);
        System.out.printf("평균점수: %.1f\n", sum4/(score.length * youngSU.length));
        */


        String[] names = {"영수", "상철", "광수", "민우"};
        int[] namesScore = new int[names.length];

        String[] subjects = {"국어", "영어", "수학", "사회"};
        int[] subjectsScore = new int[subjects.length];

        //각 이름별, 과목별 합계값 구하는 부분
        for (int i = 0; i < score.length; i++) {
            for (int i2 = 0; i2 < score[i].length; i2++) {
                namesScore[i] += score[i][i2]; //학생별 합계 점수 정리
                subjectsScore[i2] += score[i][i2]; //과목별 합계 점수 정리
            }
        } //totalScore 를 여기 for 문에 넣어도 된다. 근데 밑에 하는게 퍼포먼스가 좋다고 한다.

        int totalScore = 0;
        //학생 별 합계점수, 평균점수 출력하는 부분
        for (int i = 0; i < names.length; i++) {
            totalScore += namesScore[i];
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , names[i], namesScore[i], (float) namesScore[i] / subjects.length);
        }
        System.out.println();
        //과목 별 합계점수, 평균점수
        for (int i = 0; i < subjectsScore.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , subjects[i], subjectsScore[i], (float) subjectsScore[i] / names.length);
        }
        System.out.println();

        System.out.printf("학급: 합계점수: %d, 평균점수: %.1f\n"
                , totalScore, (float) totalScore / (names.length * subjects.length));


    }
}
