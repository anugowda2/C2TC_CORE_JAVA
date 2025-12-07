package com.anushree.assignment.employees;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    //Default constructor
    public Employee() {
    }

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Display employee details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }
}