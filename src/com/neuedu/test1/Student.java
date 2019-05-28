package com.neuedu.test1;

import java.util.Scanner;

public class Student {
    private int sno;
    private String sname;
    private int yw;
    private int sx;
    private int yy;
    public void setSno(int sno){
        this.sno=sno;
    }
    public int getSno(){
        return sno;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public String getSname(){
        return sname;
    }
    public void setYw(int b1){
        this.yw=yw;
    }
    public int getYw(){
        return yw;
    }
    public void setSx(int sx){
        this.sx=sx;
    }
    public int getSx(){
        return sx;
    }
    public void setYy(int b3){
        this.yy=yy;
    }
    public int getYy(){
        return yy;
    }
    public String toString() {
        return "学号为："+getSno()+"姓名为："+getSname()+"成绩1为："+getYw()+"成绩2为："+getSx()+"成绩3为："+getYy()+"平均成绩为："+((getYw()+getSx()+getYy())/3);
    }


}
