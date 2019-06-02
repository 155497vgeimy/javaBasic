package com.neuedu.test3;

public class Shape5 extends Shape2{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void girth() {
        double g=3*side;
        System.out.println("三角形周长"+g);
    }


}
