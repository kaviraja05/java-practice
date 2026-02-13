package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax: ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(88);
        list.add(21);
        System.out.println(list);
        System.out.println(list.contains(64));
        list.set(0, 84);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        //for loop
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            list.get(i);
        }
        System.out.println(list);
    }
}
