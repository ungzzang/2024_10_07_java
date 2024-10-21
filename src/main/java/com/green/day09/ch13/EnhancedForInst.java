package com.green.day09.ch13;

import java.util.Arrays;

public class EnhancedForInst {
    // main 메소드 수정 금지
    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffee", 5000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);

        //미니 미션 , 아래 포맷처럼 출력 되도록 해주세요.
        System.out.println(arr[0]); //제품명: Coffee, 가격: 5000원  //println 은 문자를 출력하려고 함.
        System.out.println(arr[0].toString()); //toString 은 스트링타입.
        System.out.println("--------------");
        /*
            enhanced-for 문을 사용하여 제품명, 가격을 콘솔에 출력하고
            모든 제품의 가격을 더한값을 출력해 주세요.
         */

//        for(Product item : arr) {
//            System.out.printf("제품명: %s, 가격: %d\n", item.getName(), item.getPrice());
//        }

        int sum = 0;
        for(Product item : arr){
            System.out.println(item);
         }

        for(Product item : arr){
            sum += item.getPrice();
        }
        System.out.printf("합계 : %d\n", sum);
        System.out.println("-------------------------------");


        // 배열에서 제품명이 Apple 인 것만 찾아서 콘솔에 출력
        for(Product item : arr) {
           if(item.getName().equals("Apple")) {
               System.out.println(item);
           }
        }

    }
}


class Product {
    private String name;
    private int price;


    Product(String name, int price){// 클래스 앞에 범위랑 똑같이 생성자도 하면됨.
        this.name = name;
        this.price = price;
    } // 이것때문에 기본생성자 없음. product 앞에 private 붙이면 있지만 쓸수 없는 생성자다.

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //오버라이딩 (Overriding)
    @Override //애노테이션, 오버라이드 애노테이션을 작성하면 실수방지 기능이 있다.(만약 메소드명을 다르게 적었을 때 빨간줄로 잘못됨을 알려줌)
    public String toString(){
        //return "제품명: " +name+ ", " + "가격: " + price + "원";//이렇게도 되고 아래처럼 해도 됨.
        return String.format("제품명: %s, 가격: %,d원", name, price);
    }
}
