package com.neuedu.test;

import java.util.Random;

public class Third {
    public static void main(String[] args) {
        //    题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
        Random random = new Random();
        int result = random.nextInt(10000);
        System.out.println(result);
        int a=result;
        for (;a>1&&a<= 9999;a++) {
            System.out.println(a);
        }
    }
}
