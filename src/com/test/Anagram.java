package com.test;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String str1 = new String(sc.next());
        System.out.println("Enter String2");
        String str2 = new String(sc.next());

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not an Anagram");
        }
        else{

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)) System.out.println("Anagram");
            else System.out.println("Not Anagram");
        }

    }
}
