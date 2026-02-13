package com.kavi;

public class Basics {
    public static void main(String[] args) {
        //if condition
        if(true){
            System.out.println("Hello");
        }

        //when you donot know howmany times the loop will run, then while loop will be used
        //when you know howmany times the loop will run, then for loop will be used
        //while loop
        int count=1;
        while(count!=6){
            System.out.println(count);
            count++;
        }

        //for loop
        for(int count1=1; count1!=6; count1++ ){
            System.out.println(count1);
        }
    }
}
