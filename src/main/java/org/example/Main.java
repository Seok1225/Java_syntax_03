package org.example;
// name , isMarried 또한 this를 활용해서 객체 내부의 데이터를 introduce가 쓸 수 있도록

class Main {
    public static void main(String[] args) {

        사람 a = new 사람();
        a.age = 23;
        a.name = "김철수";
        a.isMarried = false;
        a.introduce();

        사람 b = new 사람();
        b.age = 24;
        b.name = "박영수";
        b.isMarried = true;
        b.introduce();
    }
}
class 사람{
    int age;
    String name;
    boolean isMarried;

    void introduce()
    {
        int age = this.age;
        String name = this.name;
        boolean isMarried = this.isMarried;
        System.out.println("==자기소개==");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("결혼여부 : %b\n", isMarried);
    }
}