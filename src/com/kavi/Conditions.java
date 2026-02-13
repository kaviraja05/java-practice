package com.kavi;

public class Conditions {
    public static void main(String[] args) {
        /*
        Syntax of if statement:
        if (boolean  expression T or F){
            //body
         }
         else{
            do this
         }
         if or else -any one will be executed
         */
        int salary = 25400;
        if(salary > 10000){
            salary = salary + 2000;
        }

        else{
            salary = salary + 1000;
        }
        System.out.println(salary);

    }
}
