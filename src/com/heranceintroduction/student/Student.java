package com.heranceintroduction.student;

import com.heranceintroduction.progenitor.Person;

public class Student extends Person {
    private int registration;
    private String course;

    public void cancelRegistration() {
        System.out.println("Registration canceled successfully");
        this.setRegistration(0);
    }

    public void reopenRegistration(int registration) {
        System.out.println("Registration reopened successfully");
        this.setRegistration(registration);
    }

    public void payMonthlyFee() {
        this.money -= 150;
        System.out.println("Student tuition payment successfully paid");
    }

    public int getRegistration() {
        return registration;
    }
    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}
