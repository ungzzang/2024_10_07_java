package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {

        Student s1 = new Student(); // s1 객체
        s1.setName("홍길동");
        System.out.println(s1.getName());

        s1.setAge(20);
        System.out.println(s1.getAge());

        s1.setHeight(150);
        System.out.println(s1.getHeight());

//        Student s2 = new Student(); // s2 객체
//        s2.setName("신사임당");



    }
}

class Student { // private 라서 못쓰니까 메소드를 통해 넣고 뺄수 잇게 한다. 통로를 좁게해서 잘못된 걸 걸러낼수있다.
    private String name; // 기본적으로 레퍼런스 name 값이 null
    private  int age;
    private float height;

    //this 는 상수이고 나 자신의 주소값이 저장된 공간

    //set 은 무조건 void, get 은 무조건 리턴타입

    //name-setter
    public void setName(String name) { // 여기서 분기문을 통해 잘못된 정보 걸러낼 수 있다. 그러려고 이렇게 함.
        this.name = name; //오른쪽 name 을 왼쪽에 넣고 위의 name 으로 리턴.
        // 여기 있는 name 은 없어지니까 유지하려고 전역변수에 넣는거다.

        /*
            이렇게 하면 새로운 객체에 저장하는 건데 이게 죽어서 없어지기때문에 이렇게는 하지마.
            Student th = new Student();
            th.name = name;
         */
    }

    //name-getter
    public String getName() {
        return name;
    }


    //age-setter
    public void setAge(int age) {
        this.age = age;
    }

    //age-getter
    public int getAge() {
        return age; // 'return this.age' 해도 된다.
    }

    //height-setter
    public void setHeight(float height) {
        this.height = height;
    }

    //height-getter
    public float getHeight() {
        return height;
    }
}

//@setter
//@getter
