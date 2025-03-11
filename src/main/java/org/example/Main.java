package org.example;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String msg = greet("Jin");
        System.out.println(msg);

        Point point = createPoint(5, 10);
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");

        int[] evens = firstNEvenNumbers(5);//
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static Point createPoint(int x, int y) {
        return new Point(x, y);
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];

        for (int i = 0, num = 2; i < n; i++, num += 2) {
            evenNumbers[i] = num;
        }
        return evenNumbers;
    }
}