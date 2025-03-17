package org.example;

import java.util.Scanner; // 스캐너 클래스 호출

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        int a,b; // 정수만 담을수있는 변수 ab생성
        a = sc.nextInt(); //a변수에 정수형 입력 및 리턴
        b = sc.nextInt(); //b변수에 정수형 입력 및 리턴 
        System.out.println(a * b); //값을 뺌
    }
}