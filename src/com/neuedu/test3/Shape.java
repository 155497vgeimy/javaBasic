package com.neuedu.test3;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        System.out.println("请输入矩形的边长");
        Scanner side = new Scanner(System.in);
        Square square = new Square();
        square.setSide(side.nextDouble());
        square.girth();
        System.out.println();

        System.out.println("请输入三角形的边长");
        Scanner side1 = new Scanner(System.in);
         Shape5 shape5 = new Shape5();
//        Shape5.setSide(side.nextDouble());
//        Shape5.girth();

    }

}
