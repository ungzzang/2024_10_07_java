package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        //점의 위치값으로 리터럴 사용 금지
        //fileNm 에서 jpg 문자열을 뽑아내 주세요.
        String fileNm = "nice_v.ery.Nice.jpg";

        String ext = fileNm.substring(fileNm.lastIndexOf(".")+1); //fileNm.lastIndexOf("j") 넣어도 됨.

        System.out.println(ext); //jpg

    }
}
