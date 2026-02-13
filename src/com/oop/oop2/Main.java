package com.oop.oop2;

public class Main {
    public static void main(String[] args) {

        Human kavi = new Human(20, "Kavitha", 90000, true);
        Human arjun = new Human(22, "Arjun", 100000, true);
        Human pavi = new Human(22, "Pavithra", 80000, false);
        System.out.println(kavi.name);
        System.out.println(pavi.salary);
        System.out.println(arjun.marital);
        System.out.println(Human.population);
        System.out.println(pavi.population);
    }
}
