package org.example;
public class Student {
        private final String name;
        private final String major;
        public int id;
        public double gpa;

        public Student(String name, String major, int id, double gpa){
            this.name = name;
            this.major = major;
            this.id = id;
            this.gpa = gpa;

        }

        //methods
        public void displayInfo(){
            System.out.println("Student name: " + name);
            System.out.println("Student surname: " + major);
            System.out.println("Student id: "+ id);
            System.out.println("Student gpa: "+ gpa);
        }


        public String toString(){
            return "Name: " + this.name + ", Major: "+ this.major + ", Id: "+this.id + ", GPA: "+ this.gpa ;
        }


}
