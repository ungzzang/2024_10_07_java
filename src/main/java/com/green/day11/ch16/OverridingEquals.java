package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        String s1 = new String("10");
        String s2 = new String("10");
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);
        NumBox n3 = new NumBox(13);

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(n1): " + s1.equals(n1));


        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);



        //레퍼런스 변수끼리의 == 비교는 주소값 비교 (동일성 비교)
        //n1, n2 는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다.
        //즉 2개의 NumBox 객체가 만들어졌다.
        System.out.println("n1 == n2: " + (n1 == n2)); //false
        //NumBox 객체가 서로 같은 값을 가지고 있으면 true 가 뜨도록 해주세요.
        System.out.println("n1.equals(n2): " + n1.equals(n2)); //false >> true
        System.out.println("n1.equals(n3): " + n1.equals(n3)); //false
        System.out.println("n1.equals(s1): " + n1.equals(s1)); //false

//        System.out.println("n1.equals2(n2): " + n1.equals2(n2)); //false >> true
//        System.out.println("n1.equals2(n3): " + n1.equals2(n3)); //false
//        System.out.println("n1.equals2(s1): " + n1.equals2(s1)); //false 결과는 똑같이 나옴. 일을 더해서 비추천


    }
}

class NumBox {
    private int num;

    NumBox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof NumBox)) { // NumBox 와 다른타입 이면 return false
            return false;
        }
        NumBox nb = (NumBox)object;
        return this.num == nb.getNum();
        //return this.num == nb.num; 이거 작동은 된다. 잘은 모르지만 된다.
    }

    //문자열로도 해결할 수 있으나 퍼포먼스(성능)가 좋지 않기 때문에 비추천
//    public boolean equals2(Object object) {
//        if(!(object instanceof NumBox)) { // NumBox 와 다른타입 이면 return false
//            return false;
//        }
//        return toString().equals(object.toString());
//    } 결과는 똑같이 나오는데 일을 더한다.

    public int getNum() {
        return num;
    }

    @Override
    public String toString() { // 이거 없으면 오브젝트 클래스의 스트링 주소가 출력됨.
        return String.valueOf(num);
        // 메소드 ()소괄호가 보이기 때문에
        // static 메소드
        // 리턴타입이 String
        // 파라미터는 int 타입
    }


}
