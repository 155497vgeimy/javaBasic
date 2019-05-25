package com.neuedu.test;

public class Fifth {
    public static void main(String[] args) {
//        分别计算1-100之间的奇数和 和偶数和
        int a=0;
        int i=a;
        int o=a;
        for (;a>=0&&a<=100;a++){
            if (a%2==0){
                i=i+a;
//                System.out.println("偶数和为"+i);

            }else if (a%2==1){
                o=o+a;
//                System.out.println("奇数和为"+o);
            }
        }
        System.out.println("偶数和为"+i);
        System.out.println("奇数和为"+o);
    }
}
