package com.neuedu.test4;
import  java.util.Scanner;
public class Test {
        public static void main(String[] args) {
            //披萨
            Scanner input = new Scanner(System.in);
            System.out.print("请输选择要制作的披萨:1.培根披萨   2.海鲜披萨");
            int num = input.nextInt();
            Pizza p = PizzaStore.getPizza(num);
            System.out.println(p.show());
        }
    }
