package com.heranceintroduction;

public class Professor extends Person {
    private String speciality;
    private float salary;
    private boolean working;

    public void receiveRaise(float increase) {
        if (this.working) {
            this.salary += increase;
            System.out.println("Salary increased successfully");
        } else {
            System.out.println("You aren't working to receive salary increase");
        }
    }

    public void receiveSalary() {
        if (this.working) {
            //this.money += salary;
            System.out.println("Salary received successfully");
        } else {
            System.out.println("You aren't working to receive salary increase");
        }
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isWorking() {
        return working;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }
}
