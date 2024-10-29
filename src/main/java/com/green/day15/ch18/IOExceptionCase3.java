package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;//대문자이면서 마지막에 오는건 클래스명이다. 그 앞까지는 패키지 명이다.
import java.nio.file.*; //사용하는 import 그때그때 불러서 사용하는거.


//p.402 예제
/*
    D 드라이브에 Simple.txt 파일을 만든다.
 */
public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-- End --");
    }
    public static void md1() throws IOException {
        md2();
    }

    public static void md2() throws IOException {
        Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
        BufferedWriter writer = Files.newBufferedWriter(path);
        //1. newBufferedWriter 는 멤버필드, 메소드인가? 메소드
        //2. static 메소드
        //3. 리턴메소드 - 리턴타입은? BufferedWriter
        //4. 파라미터 타입은 Path 이다.
        //5. throws 메소드이다.
        writer.write('A');
        writer.write('멘');
        writer.write("\n");
        writer.write("반갑다");
        writer.close();
    }
}
