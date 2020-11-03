package com.heranceintroduction.worker;

import com.heranceintroduction.progenitor.Person;

public class Employee extends Person {
    private String sector;
    private float salary;
    private boolean working;

    public void changeSector() {
        this.working = !this.working;
    }

    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
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
