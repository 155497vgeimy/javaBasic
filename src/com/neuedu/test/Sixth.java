package com.neuedu.test;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
//        一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
//        System.out.println(result);
//        int a=result;
//        int b = a / 10000;
//        int i = a / 1000;
//        int c = a % 10 / 10;
//        int d = a % 10;
        int a=result;
        if (a>9999&&a<100000){
            int b = a / 10000;
            int i = a % 10000 / 1000;
            int c = a % 100 / 10;
            int d = a % 10;
//            System.out.println(b+i+c+d);
            if (b==d && i==c){
                System.out.println("它是回文数");
            }else {
                System.out.println("它不是回文数");
            }
        }
    }
}
