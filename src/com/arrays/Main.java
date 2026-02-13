package com.arrays;

import java.util.Arrays;

//Arrays: Array is the collection of datatypes whether it could be primitives, complex datatypes, objects or whatever you want to store
public class Main {
    public static void main(String[] args) {
        //Syntax: datatype[] var_name = new datatype[size]

        //Store 5 Roll Numbers
        int[] rnos = new int[5];
        System.out.println(rnos[4]);   // out: 0
        System.out.println(Arrays.toString(rnos));
        //By default, all the array elements are [0,0,0,0,0]

        //or directly
        int[] rno = {1,23,4,5,3 };
        System.out.println(rno[4]);

        //In string
        String[] arr = new String[3];
        System.out.println(arr[1]);   //out: Null . it is a literal. it doesnot really have nothing

       // String str = null; //is okay
       // int num = null; //it shows an error
        //bcoz, null cannot be assigned into any primitives, it can only be assign into non primitives
    }
}
