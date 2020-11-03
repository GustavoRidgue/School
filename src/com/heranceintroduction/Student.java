package com.heranceintroduction;

public class Student extends Person {
    private int registration;
    private String course;

    public void cancelRegistration() {
        System.out.println("Registration canceled successfully");
    }

    public void reopenRegistration() {
        System.out.println("Registration reopened successfully");
    }

    public void payMonthlyFee() {
        //this.money -= 50;
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
