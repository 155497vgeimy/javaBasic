package com.neuedu.test3;

import java.util.Scanner;

public class M {
    public int getGcd(int m ,int n ){
        while (n>0) {
            int temp = n;
            m = m%n;
            n = temp;
        }
        return m ;
    }

}
