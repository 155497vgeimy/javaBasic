package com.neuedu.test5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Workerclass {
    public static void main(String[] args) {
        List<Worker> lists=new ArrayList<>();
        lists.add(new Worker("张三",18,3000));
        lists.add(new Worker("李四",25  ,3500));
        lists.add(new Worker("王五 ",22 ,3200 ));
        lists.add(1,new Worker("赵六",24,3300));
        lists.remove(3);
        for (int i = 0;i<lists.size();i++){
            if (lists.get(i).getName().equals("李四")){
//                lists.add(i.new Worker());

            }
        }

    }
}
