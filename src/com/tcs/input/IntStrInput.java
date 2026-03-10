package com.tcs.input;

import java.util.Scanner;

public class IntStrInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(n + " " + str);
    }
}
