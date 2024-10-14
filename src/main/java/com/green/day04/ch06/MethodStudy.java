package com.green.day04.ch06;

public class MethodStudy {
    /*
        아래 메소드를 main 메소드라고 부른다.
        메소드를 만드는 행위는 '메소드를 정의했다.'라고 표현한다.
        만든 메소드를 사용하는 행위를 '메소드를 호출했다.'라고 표현한다.
        public, static 는 나중에 설명

        아래 4가지가 메소드 구성요소
        void: 리턴타입 = 메소드가 호출된 후 결과값.
        main: 메소드명
        (String[] args): 파라미터, 매개변수 = 메소드 호출할 때 메소드에 보내는 데이터
        {}: 구현부 = 호출되었을 때 실행되는 부분

        (리턴타입 + 메소드명 + 파라미터): 선언부

        메소드를 크게 두 분류
        - void 메소드: 리턴하는 값이 없다. (결과값이 없다.) 실행커서가 단독으로 호출한 곳으로 돌아간다.
        - return 메소드 (비void 메소드): 리턴하는 값이 있다. (결과값이 있다.)

     */
    public static void main(String[] args) {
        sum(5, 7); //sum 메소드 호출(사용) // 5는 n1, 7은 n2 로 들어감 // 2개 받기로 했으니 무조건 2개만 적을 수 있다.  //메소드에 보내는 값은 아규먼트(인자)
        sum(15, 17); // 데이터 타입이 int 이므로 int 타입인 15, 17은 적을 수 있다.
        int result = returnSum(5, 7); // 결과 타입이 int 인 것을 알 수 있다. 리턴해서 왔기때문에 12라는 값을 갖고 있다.
        System.out.println("result: " + result);
        System.out.println("result2: " + returnSum(15, 17));
        System.out.println("result2: " + 32);
    }

    //void 메소드는 데이터 데리고 가지 않는다. 호출한 곳으로.

    //sum 이라는 이름의 static 메소드를 정의(파라미터 2개)   //메소드는 같은 class 안에 적는다.
    static void sum(int n1, int n2) { //변수마다 타입을 적어줘야 한다. //이름은 내 맘대로.
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        return; // void 에서는 return; 생략가능.
    }

    static int returnSum(int n1, int n2) { // 변수 선언할때 쓴 타입들은 다 여기 앞에 int 자리에 넣을 수 있다.
        return n1 + n2; // 이 결과값이 위로 리턴함.
    }

}
