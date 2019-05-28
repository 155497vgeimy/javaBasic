package com.neuedu.tess;

public class Round {
    private int radiu;
    public void c(int radius){
        double i = 3.131415926;
        if (radius>0){
            radiu=radius;
        }else {
            System.out.println("将半径输入为正数");
        }
        System.out.println("圆的周长为:"+2*i*radiu);
        System.out.println("圆的面积为:"+i*radiu*radiu);
    }
    public double zhouchang(){
        return  2*Math.PI*radiu;
    }
    public double area(){
        return Math.PI*radiu;
    }

}
