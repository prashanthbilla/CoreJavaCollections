package com.javapractice;

public class Billa {
    public static void main(String[] args) {
        Student student=null;
        student.abc();
        //Student id,name and city
        // 100 -> sort by city
        // fetch list of students whose id > 100
    }

}

class Student{
    private int id;
    final private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        name="Prashant";
    }
    static void abc(){
        System.out.println("Hi");
    }
}
