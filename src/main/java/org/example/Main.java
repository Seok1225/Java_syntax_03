package org.example;
// 문제 : 아래와 같이 출력해주세요.
// 문제 : -100부터 25까지의 합을 출력해주세요.

class Main {
    public static void main(String[] args) {

        int i = -100;
        int sum = 0;

        while(i <= 25)
        {
            sum += i;
            i++;
        }
        System.out.println("-100부터 25까지의 합은 = " + sum + " 입니다 ");
    }
}