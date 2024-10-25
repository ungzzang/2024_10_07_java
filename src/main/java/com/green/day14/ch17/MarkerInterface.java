package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
        //Report0~3 까지 객체화 해주세요.

        Report0 re0 = new Report0("Simple Funny News");
        Report1 re1 = new Report1();
        Report2 re2 = new Report2();
        Report3 re3 = new Report3();

        //Printer 클래스 아래에 있는 printContents 메소드 호출하고 싶어요.
        //호출할 때 r0의 주소값을 보내주세요.
        Printer pri = new Printer();
        pri.printContents(re0);
        pri.printContents(re1);
        pri.printContents(re2);
        pri.printContents(re3);
    }
}

interface Printable2 {
    String getContents(); //자식들은 이걸 무조건 구현해야함. 타입도 맞춰야함.
}
interface Upper {}
interface Lower {}

class Report0 extends Object implements Printable2 {
    private String contents;

    Report0(String contents) {
        this.contents = contents;
    }

    @Override
    public String getContents() {
        return contents;
    }
}

class Report1 implements Printable2, Lower {
    public String getContents() {
        return "Simple Funny News";
    }
}

class Report2 implements Printable2, Upper {
    public String getContents() {
        return "Simple Funny News";
    }
}

class Report3 implements Printable2, Upper, Lower {
    public String getContents() {
        return "Simple Funny News";
    }
}


class Printer {
    public void printContents(Printable2 doc) {
        if(doc instanceof Upper) {
            System.out.println(doc.getContents().toUpperCase()); //contents 가 대문자로 나오게.
        }else if(doc instanceof Lower) {
            //아래 두 줄은 68번 라인과 같은 내용이다.
//            String str = doc.getContents();
//            System.out.println(str.toLowerCase());
            System.out.println(doc.getContents().toLowerCase()); //contents 가 소문자로 나오게.
        } else {
            System.out.println(doc.getContents());
        }
    }
}
