package com.green.day06.ch07;

    /*
        일반 변수(primitive type)
        참조 변수(reference type)
        차이점을 설명하는 예제
    */

public class PrimitivaeVsReferenceTest {

    public static void main(String[] args) {
        int num = 10;

        //Integer num2 = num; num2에 기능이 생김
        //num2. 점 찍으면 메소드들이 나옴, 메소드말고 상수도 나올때가 있다. 다른 멤버필드는 안뜸.

        changeNum(num);
        System.out.println("num: " + num); // 10

        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum(nb); // 얘가 가서 값이 10에서 100으로 변경된 후 밑에 실행됨
        System.out.println("nb.num: " + nb.num); //100

    }

    /*
        main 메소드에 있는 num 변수(main-num)와 changeNum 메소드에 있는 num 메개변수 (m-num)는
        다른 공간이다. main-num 이 가지고 있는 값을 복사하여 m-num 에 저장했다.
        m0num 값을 변경한다고 하여 main-num 값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문(스코프 다름.)
    */
    public static void changeNum(int num) {
        num = 100; // 10을 받았었는데 100으로 바꿈, 그리고 죽음.
    }


    /*
        main 메소드에 있는 nb 변수(main-nm)와 changeNum 메소드에 있는 nb 매개변수(m-nb)는
        다른 공간이다. 다만 같은 값(주소값)을 가지고 있다. 그로인해 같은 객체에 접근할 수 있다.
        m-nb 를 통해 객체의 num 값을 변경을 했다면 main-nb를 통해 접근했을 때 변경된 값을 얻게 된다.
     */
    public static void changeNum(NumberBox nb) {
        nb = new NumberBox(); // 새로운 객체가 생성돼서 주소값이 바뀜 // 얘가 추가 되면서 위의 nb.num = 10이 출력이된다. 이거 없으면 100출력됨
        nb.num = 100; // nb가 가진 주소로 가서 num 값이 변하고 nb는 죽음.

    }

}

class NumberBox {
    int num = 100; // 100이라 지정안하면 디폴트 값은 0
}
