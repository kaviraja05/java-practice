package com.kavi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {           //shortcut: psvm
        System.out.println("Hello");                       //shortcut: sout
        Scanner inp = new Scanner(System.in);
       // System.out.println(inp.next());
        System.out.println(inp.nextLine());
      //  System.out.println("My name is Kavi");


        String name=inp.next();
        System.out.println(name);

        float mark=inp.nextFloat();
        System.out.println(mark);
    }
}
