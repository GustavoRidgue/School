package com.heranceintroduction.progenitor;

public abstract class Person {
    protected String name;
    protected int age;
    protected char sex;
    protected int cpf;
    protected float money;

    public void makeBirthday() {
        this.age++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", cpf=" + cpf +
                ", money=" + money +
                '}';
    }
}
