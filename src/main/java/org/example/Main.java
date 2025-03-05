package org.example;
// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

class Main {
    public static void main(String[] args) {

        int i , j;

        i = 1;
        while(i <= 10) {
            j = 1;
            while(j < 4) {
                System.out.println(j);
                j++;
            }
            System.out.println("---" + i+"번째");
            i++;
        }
    }
}