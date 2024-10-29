package com.green.day15.ch21;

public class BoxInBox {
    public static void main(String[] args) {
        //BoxGeneric<String> sBox = new BoxGeneric<>("I am so happy♥");
        String str = "I am so happy.";
        BoxGeneric<String> sBox = new BoxGeneric<>(str);

        BoxGeneric<BoxGeneric<String>> wBox = new BoxGeneric<>(sBox);

        BoxGeneric<BoxGeneric<BoxGeneric<String>>> zBox = new BoxGeneric<>(wBox);

        BoxGeneric<BoxGeneric<String>> wBox2 = zBox.getBox(); //zBox 는 wBox 가 들어가 있다.

        BoxGeneric<String> sBox2 = wBox2.getBox();

        String str2 = sBox2.getBox();

        System.out.println("wBox == wBox2: " + (wBox == wBox2)); //true
        System.out.println("str == str2: " + (str == str2)); //true
    }
}
//객체는 안움직임. 주소값을 넣는다.