//Input :10  -> Integer
//Output :5    -> result- Integer
//Explanation: Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

package com.tcs.practices;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = "";
        while(n != 0){
            bin = (n & 1) + bin;
            n = n >> 1;
        }
        bin = bin.replaceAll("1", "2");
        bin = bin.replaceAll("0", "1");
        bin = bin.replaceAll("2", "0");
        int result = Integer.parseInt(bin, 2);
        System.out.println(result);
    }
}
