package com.heranceintroduction.student;

public class ScholarshipStudent extends Student {
    protected float purse;

    public void renewPurse() {
        System.out.println("Successfully renewed scholarship");
    }

    @Override
    public void payMonthlyFee() {
        this.money -= 50;
        System.out.println("Scholarship monthly payment successfully");
    }

    public float getPurse() {
        return purse;
    }
    public void setPurse(float purse) {
        this.purse = purse;
    }
}
