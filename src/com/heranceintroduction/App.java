package com.heranceintroduction;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        Professor professor = new Professor();
        Employee employee = new Employee();

        student.setName("Gustavo Ridgue");
        professor.setName("Walter Martins");
        employee.setName("Roberta Campos");

        student.setAge(15);
        professor.setAge(48);
        employee.setAge(50);

        student.setCourse("Programming");
        professor.setSpeciality("Back-end");
        employee.setSector("Coordinator");

        System.out.println(student.toString());
        System.out.println(professor.toString());
        System.out.println(employee.toString());
    }
}
