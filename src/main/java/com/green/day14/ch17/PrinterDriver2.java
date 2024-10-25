package com.green.day14.ch17;

public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        Printable prn1 = new Prn204Drv();
        Printable prn2 = new Prn731Drv();
        //Prn204Drv d1 = new Prn731Drv(); 부모만 같고 수평관계라서 주소값 저장 안됨.

        prn1.print(myDoc);
        System.out.println();
        prn2.print(myDoc);
    }
}

class Prn204Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("FROM MD-204 printer");
        System.out.println(doc);
    }
}

class Prn731Drv implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("FROM MD-731 printer");
        System.out.println(doc);
    }
}
