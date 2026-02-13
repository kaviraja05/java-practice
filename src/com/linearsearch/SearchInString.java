package com.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Arjun";
        char target = 'n';
        boolean ans = linearSearch(name, target);
        System.out.println(ans);
    }
    static boolean linearSearch(String nums, char target){
        if(nums.length() == 0){
            return false;
        }
//        for (int i = 0; i < nums.length(); i++) {
//            if(nums.charAt(i) == target){
//                return true;
//            }
//        }
//        return false;
// enhanced way
        for(char ch : nums.toCharArray()) if (ch == target) return true;
        return false;
    }
}
