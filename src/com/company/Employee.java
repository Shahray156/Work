package com.company;

public class Employee {

   private final String famile;
    private final String firstName;
    private final String lastName;
    private double salary;
    private int departament;
    private static int id;
    static Integer counter;

    public Employee(String famile, String firstName, String lastName, double salary, int departament, int id) {
        this.famile = famile;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departament = departament;
        this.id = counter++;
    }
@Override
public String toString() {
        return id + "" + famile + firstName + lastName;
}
public static int getId() {
        return id;
}
}
