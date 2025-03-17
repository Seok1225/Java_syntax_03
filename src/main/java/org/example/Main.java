package org.example;

import java.util.Scanner; // 스캐너 클래스 호출

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.printf(s + "??!\n");
    }
}