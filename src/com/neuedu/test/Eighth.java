package com.neuedu.test;

import java.rmi.server.ExportException;
import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) throws Exception {
//        编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。

        char a = (char)System.in.read();
         if (a>='a'&&a<='z'){
              a-=32 ;
              System.out.println(a);
          }else {
             System.out.println(a);
            }

    }
}
