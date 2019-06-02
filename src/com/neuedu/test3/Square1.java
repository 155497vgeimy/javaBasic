package com.neuedu.test3;

public class Square1 extends Shape2 {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void girth() {
        double g=4*side;
        System.out.println("正方形周长"+g);
    }
}
