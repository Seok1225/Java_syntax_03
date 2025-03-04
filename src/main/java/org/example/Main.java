package org.example;

// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요. // 조건 : 숫자와 사칙연산 사용 금지

public class Main {
    public static void main(String[] args) {
        int age = 50;

        System.out.println("당신의 나이 : " + age);
// 당신의 나이 : 50

        if (age >= 20) { // age >= 20 (은)는 결국 실행되면 true 가 된다.
            System.out.println("성년");
        }

        if (age < 20) { // age < 20 (은)는 결국 실행되면 false 가 된다.
            System.out.println("미성년");
        }
    }
}
