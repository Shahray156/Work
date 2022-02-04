package com.company;

import java.util.Objects;

public class Employee {

    private static Employee[] employess;
    private final String name;
    private final String name1;
    private final String name2;
    public float getSalary;
    private int salary;
    private int departament;
    private int id;
    private static Integer counter = 1;

    public Employee(String name, String name1, String name2, int salary, int departament, int id) {
        this.name = name;
        this.name1 = name1;
        this.name2 = name2;
        this.salary = salary;
        this.departament = departament;
        this.id = counter++;
    }


    @Override
    public String toString() {
        return id + "Фамилия: " + name + ". " + "Имя: " + name1 + ". " + "Отчество: " + name2 + ". " + "Отдел: " + departament + ". " + "Зарплата: " + salary;
    }

    public static int getId() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(float v) {
        this.salary = salary;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament() {
        this.departament = departament;
    }

}