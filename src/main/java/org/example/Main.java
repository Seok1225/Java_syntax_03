package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = (a * 60) + b;
        min = min + c;
        int h = min / 60;
        int m = min % 60;

        if (h >= 24) {
            System.out.println(h % 24 + "" + m);
        } else {
            System.out.println(h + " " + m);
        }
    }
}