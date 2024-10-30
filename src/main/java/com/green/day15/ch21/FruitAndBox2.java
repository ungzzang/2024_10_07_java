package com.green.day15.ch21;

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox = new FruitBox(new Apple());
        FruitBox orangeBox = new FruitBox(new Orange());
        Apple apple = (Apple)appleBox.getFruit(); //형변환 하는 불편함.
        Orange orange = (Orange)orangeBox.getFruit();

        FruitBox orangeBox2 = new FruitBox("오렌지"); //문자열도 담겨서 단점.
        Orange orange2 = (Orange)orangeBox2.getFruit();

        System.out.println("--End--");

    }
}

class FruitBox {
    private Object fruit;

    FruitBox(Object fruit){
        this.fruit = fruit;
    }

    Object getFruit(){
        return fruit;
    }
}

