package org.example;
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* 1`까지 출력해주세요.

class Main {
    public static void main(String[] args) {
        int dan = 8;

        int i = 1000;

        while(i >= 1)
        {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i--;
        }
        // 출력
    /*
    8 * 1000 = 8000
    ...
    8 * -500 = -4000
    */
    }
}
