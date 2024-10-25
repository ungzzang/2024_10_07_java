package com.green.day14.ch17;
/*
    class 가 class 를 상속받을 때 키워드: extends
    interface 가 interface 를 상속받을 때 키워드: extends

    class 가 interface 를 상속받을 때 키워드: implements
    interface 는 class 를 상속받을 수 없다.
 */
public class PrinterDriver3 {
    public static void main(String[] args) {
        //자식타입에 부모객체 주소값 담은 경우
        //Prn204Drv 가 상속을 어디까지 받았는지 확인하면 Printable 까지 상속받았고
        //Printable 은 ColorPrintable 보다 부모타입이기 때문에 담을 수 없다.
        //ColorPrintable cp = (ColorPrintable)new Prn204Drv(); //ColorPrintable 이 Prn204Drv 보다 자식 타입쪽이다.
        //cp.printCMYK("ddd");
    }
}

interface ColorPrintable extends Printable { // 인터페이스의 상속은 코드 복사 개념.
    void printCMYK(String doc);
}

//Prn909Drv 객체의 주소값 담을 수 있는 타입
//Printable, ColorPrintable, Prn909Drv
//Prn909Drv 타입으로 호출할 수 있는 메소드: printCMYK, print
//ColorPrintable 타입으로 호출할 수 있는 메소드: printCMYK, print
//Printable 타입으로 호출할 수 있는 메소드: print
class Prn909Drv implements ColorPrintable {
    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("From MD-090 black & white ver");
        System.out.println(doc);
    }
}

//빛의 3원소 (RGB) - Red, Green, Blue
//CMYK: 인쇄를 위한 색상 모드

//이미지 표현방식: bitmap, vector 방식
//이미지 포맷: jpg, jpeg, png