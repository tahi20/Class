package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student students1 = new Student("Tahira", "Abdurazakova", 568439,78.42 );
        Student students2 = new Student("Elza", "Asanova", 239877,98.5);
        Student students3 = new Student("Asel", "Danieva", 287293,65.6);
        Student students4 = new Student("Fati", "Ismailova", 287645,87.9);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(students1);
        students.add(students2);
        System.out.println(students);
        System.out.println(students);
        students.add(students3);
        students.add(students4);

        for(Student c: students){
            System.out.println(c);
        }

        students.clear();

    }
}