package com.tcs.input;
//If the array size is not given, it understand by using Comma and space separation

import java.util.ArrayList;
import java.util.Scanner;

public class CArraySizNotGiven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String nums[] = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();

        for (String num : nums) {
            list.add(Integer.parseInt(num));
        }

        for(int elt : list){
            System.out.println(elt+ " ");
        }
    }

}
