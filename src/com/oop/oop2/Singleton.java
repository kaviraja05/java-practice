package com.oop.oop2;

public class Singleton {
    private Singleton(){
        //private runs only in this class
    }
    private static Singleton instance;

    public static Singleton getInstance(){
        //check whether only one obj is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
