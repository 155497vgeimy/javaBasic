package com.neuedu.test1;

import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        Scanner inupt = new Scanner(System.in);
        System.out.println("请输入姓名");
        String str = inupt.next();
        System.out.println("请输入学号");
        int a = inupt.nextInt();
        System.out.println("请输入成绩一");
        int b1 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int b2 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int b3 = inupt.nextInt();

        Student student1 = new Student();
        student1.setSname(str);
        student1.setSno(a);
        student1.setYw(b1);
        student1.setSx(b2);
        student1.setYy(b3);
        System.out.println(student1.toString());

        System.out.println("请输入姓名");
        String str1 = inupt.next();
        System.out.println("请输入学号");
        int a1 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int b4 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int b5 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int b6 = inupt.nextInt();

        Student student2 = new Student();
        student2.setSname(str1);
        student2.setSno(a1);
        student2.setYw(b4);
        student2.setSx(b5);
        student2.setYy(b6);
        System.out.println(student2.toString());

        System.out.println("请输入姓名");
        String str2 = inupt.next();
        System.out.println("请输入学号");
        int a2 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int b7 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int b8 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int b9 = inupt.nextInt();
        Student student3 = new Student();
        student3.setSname(str2);
        student3.setSno(a2);
        student3.setYw(b7);
        student3.setSx(b8);
        student3.setYy(b9);
        System.out.println(student3.toString());

        System.out.println("请输入姓名");
        String str3 = inupt.next();
        System.out.println("请输入学号");
        int a3 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int b11 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int b12 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int b13 = inupt.nextInt();
        Student student4 = new Student();
        student4.setSname(str3);
        student4.setSno(a3);
        student4.setYw(b11);
        student4.setSx(b12);
        student4.setYy(b13);
        System.out.println(student4.toString());

        System.out.println("请输入姓名");
        String str4 = inupt.next();
        System.out.println("请输入学号");
        int a4 = inupt.nextInt();
        System.out.println("请输入成绩一");
        int b14 = inupt.nextInt();
        System.out.println("请输入成绩二");
        int b15 = inupt.nextInt();
        System.out.println("请输入成绩三");
        int b16 = inupt.nextInt();
        Student student5 = new Student();
        student5.setSname(str4);
        student5.setSno(a4);
        student5.setYw(b14);
        student5.setSx(b15);
        student5.setYy(b16);
        System.out.println(student5.toString());

//        int s1 = a.nextInt();
//        Student student1 = new Student();
//        student1.setSname(s1);
//        student1.setSno(student1);
//        student1.setYw(s);
//        student1.setSx(s);
//        student1.setYy(s);
//        System.out.println(student1.toString());


    }
}
