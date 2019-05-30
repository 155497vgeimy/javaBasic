package com.neuedu.test1;

import com.neuedu.test2.Monkey;
import com.neuedu.test2.People;

public class ZuoyeClass3 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("丫丫");
        monkey.speek();
        People people = new People();
        people.speek();
        people.think();
    }
}
