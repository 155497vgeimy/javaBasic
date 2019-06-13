package com.neuedu.test6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.System.*;

public class RandomNumber {
    public static void main(String[] args) {
        /*产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。*/
        List<Integer> list = new ArrayList();
        Random random = new Random();
        int arr[] = new int[10];
        for (int a=0;a<=10;a++){
            arr[a]=random.nextInt(100)+1;
            if (arr[a]>=10){
                list.add(arr[a]);
            }
            System.out.println(list);
        }

    }
}
