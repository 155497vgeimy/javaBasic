package com.neuedu.test1;

import com.neuedu.test2.Brass;
import com.neuedu.test2.Brass2;
import com.neuedu.test2.Instrument;

public class ZuoyeClass2 {
    public static void main(String[] args) {
        Instrument instrument;
        Brass2 Brass2 = new Brass2();
        Brass brass = new Brass();
        instrument = Brass2;
        instrument.play();
        instrument = brass;
        instrument.play();
    }
}
