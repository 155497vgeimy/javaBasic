package com.neuedu.test1;

public class Bijiben {
    private char color;
    private int cpu;
    //无参
    public Bijiben(){
        color='黑';
        cpu=002;
    }
    //有参
    public Bijiben(char    color, int   cpu){
        this.color=color;
        this.cpu=cpu;

//    public void setColor(){
//        this.color=color;
//    }
//    public char getColor(){
//        return color;
//    }
//    public void setCpu(){
//        this.cpu=cpu;
//    }
//    public int getCpu(){
//        return cpu;
    }
    public String toString() {
        return "颜色为："+color+"  "+"cpu型号为："+cpu;
    }

}
