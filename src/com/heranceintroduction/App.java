package com.heranceintroduction;

import com.heranceintroduction.student.ScholarshipStudent;
import com.heranceintroduction.student.Student;
import com.heranceintroduction.worker.Employee;
import com.heranceintroduction.worker.Professor;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent();
        Professor professor = new Professor();
        Employee employee = new Employee();

        student.setName("Gustavo Ridgue");
        scholarshipStudent.setName("Gabriel Barbosa");
        professor.setName("Walter Martins");
        employee.setName("Roberta Campos");

        student.setAge(15);
        scholarshipStudent.setAge(21);
        professor.setAge(48);
        employee.setAge(50);

        student.setCourse("Programming");
        scholarshipStudent.setCourse("Engineer");
        professor.setSpeciality("Back-end");
        employee.setSector("Coordinator");

        System.out.println(student.toString());
        System.out.println(scholarshipStudent.toString());
        System.out.println(professor.toString());
        System.out.println(employee.toString());

        scholarshipStudent.payMonthlyFee();
        student.payMonthlyFee();
        System.out.println(scholarshipStudent.toString());

    }
}
