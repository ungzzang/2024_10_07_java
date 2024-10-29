package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase3 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return; //이게 있어도 밑에 finally 는 무조건 실행함.
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //예외가 발생해도 안해도 "무조건" 실행되는 부분(실행보장)
            System.out.println("이게 실행이 되나 안되나 ㅋㅋㅋㅋ(2)"); //이거 실행되더라.
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {

            }
        }

        System.out.println("-- 끝 --");
    }
}

class FinallyCase02 {
    /*
        write.close(); 이 문장이 무조건 실행이 될 수 있도록 코드 작성
     */
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("이게 실행이 되나 안되난 ㅋㅋㅋㅋㅋ"); // 이거 실행안되더라.

        try {
            writer.close();
        } catch (IOException e) {

        }
        System.out.println("-- 끝 --");
    }
}

