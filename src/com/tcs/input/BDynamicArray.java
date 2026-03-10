package com.tcs.input;
import java.util.*;
public class BDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)+ " ");
        }

//        for(int elt : list){
//            System.out.println(elt+ " ");
//        }
    }
}
