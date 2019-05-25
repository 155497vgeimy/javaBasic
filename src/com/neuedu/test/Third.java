package com.neuedu.test;

//import java.util.Random;

public class Third {
    public static void main(String[] args) {
        //    题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
//        Random random = new Random();
//        int result = random.nextInt(1000);
//        System.out.println(result);
//        int a=result;
        int a=100;
//        int b = a / 100;
//        int c = a % 100 / 10;
//        int d = a % 10;
        int i=1;
        for (; (a > 0) && (a < 1000); a++) {
            int b = a / 100;
            int c = a % 100 / 10;
            int d = a % 10;
            //            System.out.println(a);
            if (b<=4&&b>0&&c<=4&&c>0&&d<=4&&d>0&&b!=c&&c!=d&&b!=d) {
                System.out.println(b*100+c*10+d);
                i++;
                System.out.println(i);
            }
        }
    }
}
