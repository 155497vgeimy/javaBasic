package com.neuedu.test;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
//        一个整数的各位数字之和能被 9 整  除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
//        Scanner input =new Scanner(System.in);
//        int a = input.nextInt();
//            int b = a / 10000;
//            int c = a % 10000 / 1000;
//            int d = a % 1000 / 100;
//            int e = a % 100 / 10;
//            int f = a % 10;
//            if (a>0&&b+c+d+e+f%9==0&&a%9==0);System.out.println("是");
//        for (a>0&&a%10)
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = 0;
        if (a>=0){
            b+= a%10;
            a = a/10;
        }
        b+=a;
        if (b%9==0){
            System.out.println("能被9整除");
        }else {
            System.out.println("不能被9整除");
        }

    }
}
