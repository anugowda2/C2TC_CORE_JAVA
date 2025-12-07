package com.anushree.assignment;

import com.anushree.assignment.employees.*;
import com.anushree.assignment.utilities.*;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Anushree", 1001, 75000, "HR");
        Developer developer = new Developer("Ravi", 1002, 65000, "Java");

        EmployeeUtilities utils = new EmployeeUtilities();
        utils.printEmployeeDetails(manager);
        utils.printEmployeeDetails(developer);

        utils.increaseSalary(manager, 10);
        utils.increaseSalary(developer, 15);
    }
}