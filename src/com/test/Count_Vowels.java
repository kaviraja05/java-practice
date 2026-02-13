package com.test;

public class Count_Vowels {
    public static void main(String[] args) {
        String str = "education";
        char[] arr = str.toCharArray();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
