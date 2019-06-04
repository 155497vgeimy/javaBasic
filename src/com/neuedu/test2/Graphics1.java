package com.neuedu.test2;

import java.util.Scanner;

public class Graphics1 extends Graphics {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Circular circular = new Circular();
        Square square = new Square();
        System.out.println(circular);
        System.out.println(square);
    }
}
