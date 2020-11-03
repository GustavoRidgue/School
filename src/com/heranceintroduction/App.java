package com.heranceintroduction;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Professor professor = new Professor();
        Employee employee = new Employee();

        person.setName("School of Rock");
        student.setName("Gustavo Ridgue");
        professor.setName("Walter Martins");
        employee.setName("Roberta Campos");

        person.setAge(35);
        student.setAge(15);
        professor.setAge(48);
        employee.setAge(50);

        student.setCourse("Programming");
        professor.setSpeciality("Back-end");
        employee.setSector("Coordinator");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(professor.toString());
        System.out.println(employee.toString());
    }
}
