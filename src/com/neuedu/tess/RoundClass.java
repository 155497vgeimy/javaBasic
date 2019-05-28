package com.neuedu.tess;

import java.util.Scanner;

public class RoundClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入半径");
        int a=input.nextInt();
        Round test=new Round();
        test.c(a);
    }


}
