package com.practice;

public class StringEg {
    public static void main(String[] args) {
        // String
        String str = "Java";
        str += " Programming";  // new object created
        System.out.println("String: " + str);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming"); // same object modified
        System.out.println("StringBuilder: " + sb);

        // StringBuffer
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println("StringBuffer: " + sbf);
    }
}
