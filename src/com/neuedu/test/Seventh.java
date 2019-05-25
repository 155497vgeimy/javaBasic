package com.neuedu.test;

import java.util.Scanner;

public class Seventh {
//    判断一个年份是平年还是闰年
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resylt = input.nextInt();
        if (resylt%4==0&&resylt%400==0||resylt%100==0){
            System.out.println("平年");
        }else {
            System.out.println("闰年");
        }

    }
}
