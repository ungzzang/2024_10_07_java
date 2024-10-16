package com.green.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2); // concat 은 왼쪽 들어온 값에 오른쪽 들어온 값을 합쳐서 나타냄. 이건 알고있자.
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        String str5 = str2.concat(str1);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println(str5);


        System.out.println("-----------------");


        String str6 = "abcdefghijklmn";
        System.out.println("str6.substring(3): "
                + str6.substring(3)); //원본은 건들지 않고 새로운 스트링 객체를 만들어 거기에 편집한거 리턴.
        // 0부터 시작이라서 0,1,2 까지 건너띄고 3부터 시작. //defghijklmn 출력 //substring 은 파일명에서 확장자 추출할 때 사용.

        System.out.println("str6.substring(4, 7): "
                + str6.substring(4, 7)); //efg 3개 뽑힘. 4, 5, 6자리의 문자열 리턴. (7-4=3 이니까 3개 뽑힌다고 알자.)

        String fileNm = "nice_V.ery.Nice.jpg";
        System.out.println(".의 위치값: " + fileNm.indexOf("."));
        //왼쪽에서 오른쪽 방향으로 가장 빨리 찾은 index 값을 리턴

        System.out.println(".의 위치값: " + fileNm.lastIndexOf("."));


        System.out.println("------------------");


        String str7 = "LExi";
        String str8 = "Lexi";

        System.out.println(str7.equals(str8)); // 이건 알고있자
        System.out.println(str7.compareTo(str8)); // 별로 안중요함.
        System.out.println(str8.compareTo(str7)); // 별로 안중요함.
        System.out.println(str7.compareTo("LExi")); //0이 나오면 같은 문자열이다.
        System.out.println(str7.equalsIgnoreCase(str8)); // 이건 알고있자 // 대소문자 구분없이 같은지 비교(영어만 의미가 있음)


        System.out.println("--------------------------");


        int n = 10;
        String str9 = n + "";
        String str10 = String.valueOf(n); //모든 타입을 String 으로 변경 할 수 있다.
        System.out.println();

    }
}
