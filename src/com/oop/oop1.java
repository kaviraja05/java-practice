package com.oop;

import java.util.Arrays;
import java.lang.Object;

public class oop1 {
    public static void main(String[] args) {
        //store 5 roll nos
         int[] rollno = new int[5];
//        //store 5 names
         String[] names = new String[5];
         float[] marks = new float[5];
//
        Student[] stu1 = new Student[5];

        //just declaring
        Student kavi;
        //creating an obj
        kavi = new Student();
        kavi.name = "kavitha";
        kavi.rollno = 04;
        kavi.marks = 99;

        Student arjun = new Student(11, "Arjun", 98);

        System.out.println(kavi.name);
        System.out.println(arjun.name);

        Student random = new Student(arjun);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);


        Student one = new Student();
        Student two = one;

        one.name = "Something";
        System.out.println(two.name);
        
        kavi.greeting();
    //    System.out.println(kavi);
   //     System.out.println(Arrays.toString(stu1));
        
        final A kavii = new A("kavitha");
        kavii.name = "Other name";
        //error: when a non primitive is in final, you cannot reassign it.but you can change the value
        //kavii = new A("new object");


//        A obj;
//        for (int i = 0; i < 10000; i++) {
//            obj =new A("Random Name");
//        }
    }
}
    class Student{
        int rollno ;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello! My Name Is " + this.name);
        }

        Student(){

            //this is how you call a constructor from another constructor
            this(22, "Aishu", 95);
        }
        //creating a constructor
//        Student(){
//            this.rollno = 13;
//            this.name = "Arjun";
//            this.marks = 87;
//        }

        Student(Student other){
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
        }

        Student(int rollno, String name, float marks){
//            rollno = roll;
//            name = nam;
//            marks = mark;
//this is also used for when you are using the same name for left and right
            //it usually means what object you are referring
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;

        }

    }
    class A{
        final int num = 10;
        String name;
            
        public A(String name){
            this.name = name;
        }

//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("OBj is destroyed");
//        }
    }
