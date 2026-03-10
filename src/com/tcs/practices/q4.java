//str1 = "abcd"
//str2 = "cdab"
//rotation or not

package com.tcs.practices;

public class q4 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        rotation(str1, str2);
    }
    static void rotation(String string1, String string2){
        if(string1.length() == string2.length()) {
            String str3 = string1 + string1;
            if(str3.contains(string2)){
                System.out.println("Rotation String");
            }
            else{
                System.out.println("Not a Rotation");
            }
        }
        else{
            System.out.println("Not a Rotation");
        }
    }
}
