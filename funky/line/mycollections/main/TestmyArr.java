package com.funky.line.mycollections.main;

import com.funky.line.mycollections.realisation.*;

/**
 * Created by Rudniev Oleksandr on 10.11.2016.
 */
public class TestmyArr {
    public static void main(String[] args) {
        ArrList<String> test = new ArrList<>();
        test.add("Ноль");
        test.add(1, "Один");
        System.out.println(test.size());
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        System.out.println(test.size());
        for (int i = 0; i < 33; i++) {
            test.add("ddd");
        }
        System.out.println(test.size());
        test.remove(20);
        System.out.println(test.size());

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));

        }
        System.out.println(test);
        System.out.println(test.get(22));
        System.out.println(test.contains("Ноль"));
        test.clear();
        System.out.println(test.isEmpty());
        System.out.println(test.size());
        LinkList<String> aa = new LinkList<>();
        System.out.println(aa);

    }
}