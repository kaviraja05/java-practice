package com.oop.oop2;

public class Human {
    int age;
    String name;
    int salary;
    boolean marital;
    static long population;

    Human(int age, String name, int salary, boolean marital){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marital = marital;
        Human.population += 1;
    }
}
