package com.neuedu.test1;

import com.neuedu.test2.*;

public class ZuoyeClass {
    public static void main(String[] args) {
//        1.
//        Circular circular = new Circular();
//        circular.setRadius(6);
//        circular.per();
//        circular.area();
//        Square square = new Square();
//        square.setRadius(6);
//        square.ar();
//        square.p();

//        2.
        Instrument instrument;
        Brass2 Brass2 = new Brass2();
        Brass brass = new Brass();
        instrument = Brass2;
        instrument.play();
        instrument = brass;
        instrument.play();

//        3.
//        Monkey monkey = new Monkey("丫丫");
//        monkey.speek();
//        People people = new People();
//        people.speek();
//        people.think();

    }
}
