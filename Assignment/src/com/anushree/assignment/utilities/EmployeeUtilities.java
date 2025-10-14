package com.anushree.assignment.utilities;

import com.anushree.assignment.employees.Employee;

public class EmployeeUtilities {

    public void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + "'s new salary after " + percentage + "% raise: " + newSalary);
    }

    public void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Details:");
        emp.displayDetails();
    }
}