package com.neuedu.test2;

public class Square extends Graphics{
    public void p(){ System.out.println("长方形的周长是:"+this.getRadius()*4);
    }
    public void ar(){
        System.out.println("长方形的面积是"+this.getRadius()*this.getRadius());
    }
}
