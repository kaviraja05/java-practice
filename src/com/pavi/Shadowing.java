package com.pavi;
// shadowing means using the two variables in the same name.
public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
      //  int x = 40;
        x = 40;
        System.out.println(x);// the variable with the higher level scope is hidden. when you access it again, this is going to print 40, not 90
        // so this is shadowed at line 9.
        fun();
        System.out.println(x);
    }
    static void fun(){
//        int x = 50;
//        System.out.println(x);// it prints 50
          System.out.println(x);// it will print 90 because Scope will begin when the value is initialized.
    }

}
