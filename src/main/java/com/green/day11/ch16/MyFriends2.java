package com.green.day11.ch16;

public class MyFriends2 {
    public static void main(String[] args) {
        UnivFriend2[] arr1 = new UnivFriend2[3];
        CompFriend2[] arr2 = new CompFriend2[3];


        //다형성: 다양한 형태가 될 수 있는 성질 >> 변수타입과 객체는 다른데 저장할 수 있다.
        UnivFriend2 obj1 = new UnivFriend2("Lee", "010-1111-1111", "Computer");
        Friend f1 = obj1; //상속관계에서만 다형성이 가능
        Friend f2 = new UnivFriend2("SEO", "010-2222-2222", "Electronics");
        //Friend f2 가 의미하는 바는 Friend 객체 주소값을 담을 수 있는 f2 레퍼런스 변수
        //이제는 + Friend 를 상속받은 객체의 주소값도 담을 수 있다.

        Friend[] arr3 = new Friend[10]; //arr3 의 각 방의 타입: Friend //부모타입으로 자식의 객체 주소값을 담을 수 있다.(반대는 안됨)
        // UnivFriend2, CompFriend2, Friend 객체 주소값 모두 담을 수 있는 배열
        arr3[0] = obj1;
        arr3[1] = f2;
        arr3[2] = new CompFriend2("YOON", "02-123-9999", "R&D 1");
        arr3[3] = new CompFriend2("PARK", "02-333-5555", "R&D 2");

        arr3[0].showInfo();
        // arr3[4].showInfo(); //null point exception 발생!!! null 은 출력하지 말것.

        System.out.println("---------------------");
        //반복문으로 arr3 에 객체주소값이 있는 친구들만 showInfo() 메소드 호출
        for(int i = 0; i < arr3.length; i++) {
            if (arr3[i] != null) {
                arr3[i].showInfo();
                System.out.println();
            }
        }

//        for(int i = 0; i < arr3.length; i++){
//            Friend item = arr3[i];
//            if(item == null) {
//                continue;
//            }
//            item.showInfo();
//            System.out.println();
//        } 다르게 한거.

//        for(Friend item : arr3){
//            if(item != null){
//                item.showInfo();
//            }
//        } //enhanced for 문 사용한거.


        //main 메소드는 수정 금지!!!
        //이름, 전화번호 + 대학친구는 전공도 출력, 직장동료는 부서 출력

    }

}

//생성자를 통해 멤버필드 초기화 가능하게 작성
class Friend {
    protected String name;
    protected String phone;

    Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String getName(){
        return name;
    }

    String getPhone(){
        return phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);


    }
}

//이름, 전화, 전공값을 초기화 할 수 있는 생성자 작성
class UnivFriend2 extends Friend {
    private String major;

    UnivFriend2(String name, String phone, String major) {
        super(name, phone);
        this.major = major;

    }

    public String getMajor() {
        return major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("전공: " + major);
    }

}

//CompFriend 와 같은 능력이 있는 2를 만들어주세요.
class CompFriend2 extends Friend {
    private String department;

    CompFriend2(String name, String phone, String department) {
        super(name, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + department);
    }
}

