package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialization
        for (int i = 0; i < 6; i++) { //without this for loop, error occurs, because list.get(i) search for an arraylist, but there is no array list oocurs
            list.add(new ArrayList<>());
        }

        //add elements3
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
