package com.neuedu.test;

public class First {
    public static void main(String[] args) {
        /**
         * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
         * 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
         */
        int a = 111;
        for ( ;a<=999;a++) {
            int b = a / 100;
            int c = a % 10 / 10;
            int d = a % 10;
            if (a == b * b * b + c * c * c + d * d * d) {
                System.out.println(a);
            } else if (a != b*b*b+c*c*c+d*d*d) {
                continue;
            }
        }
    }

}
