package com.green.day08.ch11;

//p.264~269
public class BuildString {
    public static void main(String[] args) {
        //문자열 "123" 이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        sb.append(45678); // 123 뒤에 붙이고 싶을때 사용 //12345678

        System.out.println(sb);

        sb.delete(0, 2); // 0번째 부터 2번째 전까지 지움.
        System.out.println(sb); //345678


        //미니 미션
        //모든 문자열을 지우는 방법 (치사하게 하지 말고)
        sb.delete(0, sb.lastIndexOf("")); // 성능은 좀 느리지만 되긴 됨.
        System.out.println("sb = " + sb);

        sb.delete(0,sb.length());
        System.out.println("sb = " + sb);


        sb.append(345678);
        System.out.println("sb = " + sb);

        sb.replace(0, 3, "AB"); // 0번째 부터 3번째 전까지 인덱스를 AB로 교체.
        String str = sb.toString(); //StringBuilder 에서 String 타입으로 변경 -> 파싱한다.

        System.out.println("sb: " + sb); //AB678
        System.out.println("str: " + str);

        StringBuilder sb2 = sb.reverse().replace(0, 2, "kk"); //체이닝 기법, return this; 가 핵심이다. (메소드.메소드호출.메소드호출 이런느낌)
//        sb.reverse();
//        sb.replace(0,2,"kk"); 이렇게 두줄 적은게 위에 한줄과 같은거다.

        System.out.println("sb: " + sb); //876BA
        System.out.println("sb == sb2: " + (sb == sb2));
    }
}
