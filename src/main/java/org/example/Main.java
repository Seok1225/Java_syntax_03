package org.example;

// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요. // 조건 : 숫자와 사칙연산 사용 금지

public class Main {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("x"); // 출력 : x
        System.out.println(x); // 출력 : 10
        System.out.println("x" + x); // 출력 : x10
        System.out.println("x : " + x); // 출력 : x : 10
        System.out.println("x : " + x * 10); // 출력 : x : 100
        System.out.println("x : " + x + 10); // 출력 : x : 1010
        System.out.println("x : " + (x + 10)); // 출력 : x : 20
    }
}
