package org.example;
// 1부터 n까지 소수의 (갯수)를 출력하는 함수 만들기
class Main {
    public static void main(String[] args) {
        int n = 100; // 예시로 10까지의 소수를 구합니다.
        int primeCount = Primes.countPrimes(n);
        System.out.println("1부터 " + n + "까지의 소수의 갯수: " + primeCount);
    }
}

class Primes { // 1부터 n까지의 소수의 갯수를 세는 메소드
    static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
        return count;
    }

    static boolean isPrimeNumber(int num) { // 주어진 숫자가 소수인지 판별하는 메소드
        if (num < 2) return false; // 2보다 작은 수는 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) { // 제곱근까지만 확인
            if (num % i == 0) {
                return false; // 약수가 있으면 소수가 아님
            }
        }
        return true; // 소수임
    }
}
