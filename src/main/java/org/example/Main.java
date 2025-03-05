package org.example;
// 문제 : 아래와 같이 출력해주세요.
// 문제 : 1부터 5까지의 합을 출력해주세요.

class Main {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while(i <= 5)
        {
            sum += i;
            i++;
        }
        System.out.println("1부터 5까지의 합은 = " + sum + " 입니다 ");
    }
}