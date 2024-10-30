package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args)  {
        //만약 BufferedWriter writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이 문장이 반드시 실행이 되어야 한다.
        try {
            Path path = Paths.get("D:/Simple.txt");
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            writer.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FinallyCase2 {
    /*
        write.close(); 이 문장이 무조건 실행이 될 수 있도록 코드 작성
     */
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return; // finally 부터 실행되고 리턴실행됨.
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {

        }
        System.out.println("-- 끝 --");
    }
}
