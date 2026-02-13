package com.practice;
//reverse the string without spaces

public class practice4 {
    public static void main(String[] args) {
        String str = "Hello Arjun!";
        String reversed = reversedstring(str);
        System.out.println( "Reversed String:" +reversed);
    }
    public static String reversedstring(String str){
       // StringBuilder sb = new StringBuilder(str);
        //return sb.reverse().toString();


        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {   // skip spaces
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

}
