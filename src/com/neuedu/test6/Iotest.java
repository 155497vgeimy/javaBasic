package com.neuedu.test6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Iotest {
    public static void main(String[] args) {

        FileInputStream i = null;

        FileOutputStream o = null;

        File file = new File("...");
        try {
            file.createNewFile();
            i = new FileInputStream(file);

            o = new FileOutputStream("...");

            byte[] words = new byte[10240];
            while ((i.read(words)) != -1) {
                o.write(words, 0, words.length);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (i != null) {

                try {
                    i.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (o != null) {

                try {
                    o.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }

}
