package com.neuedu.test3;

import java.util.Scanner;

public class Mn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入m:");
        int m = scanner.nextInt();
        System.out.println("请输入b:");
        int n = scanner.nextInt();
        System.out.println("最大公约数：" + new M().getGcd(m,n));
    }
}
