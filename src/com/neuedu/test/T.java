package com.neuedu.test;

public class T {
    public static void main(String[] args) {
        int a=123456;
        int b=0;
        while (a !=0){
            b=a%10;
            System.out.println(b);
            a=a/10;
        }
    }
}
