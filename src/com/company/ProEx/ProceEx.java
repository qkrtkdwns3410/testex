package com.company.ProEx;

public class ProceEx {
    public static void main(String[] args) {
        int Sum = 0;
        for (int i = 0; i <= 10; i++) {
            Sum += i;
        }
        System.out.println("1부터 10까지의 정수의 합은 " + Sum + "입니다.");
    
        if (Sum % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}
