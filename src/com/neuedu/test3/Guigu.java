package com.neuedu.test3;

import java.util.Scanner;

public class Guigu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = input.nextInt();
        Gui gui = new Gui();
        gui.setNnum(num);
        gui.guigu();
    }

}

