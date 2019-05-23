package com.neuedu.test;

public class Test {
    public static void main(String[] args) {
        int a=153;
        int b=0;
        while (a !=0) {
            b=a%10;
            System.out.print(b);
            a=a/10;
        }

    }
}
