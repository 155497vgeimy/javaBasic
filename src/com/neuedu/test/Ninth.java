package com.neuedu.test;

public class Ninth {
    public static void main(String[] args) {
//        用 while 循环，计算 1~200 之间所有 3 的倍数之和。
        int a=1;
        int b=0;
        while (a>0&&a<200){
            a++;
            if (a%3==0){
                b=b+a;
            }
        }
        System.out.println("所有3的倍数和为"+b);
    }
}
