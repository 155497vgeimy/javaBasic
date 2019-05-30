package com.neuedu.test1;

import com.neuedu.test2.*;

public class ZuoyeClass {
    public static void main(String[] args) {
        Circular circular = new Circular();
        circular.setRadius(6);
        circular.per();
        circular.area();
        Square square = new Square();
        square.setRadius(6);
        square.ar();
        square.p();
    }
}
