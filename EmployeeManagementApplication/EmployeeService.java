// Remove the package line if not using folder structure
// package com.sj.empmanagmentapplication;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    
    HashSet<Employee> empSet = new HashSet<>();
    
    // Create some dummy data for testing
    public EmployeeService() {
        empSet.add(new Employee(101, "Shital", "IT", 25000));
        empSet.add(new Employee(102, "Meena", "HR", 20000));
    }

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    double salary;

    // 1. Add Employee
    public void addEmp() {
        System.out.println("Enter ID:");
        id = sc.nextInt();
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter Department:");
        department = sc.next();
        System.out.println("Enter Salary:");
        salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);
        empSet.add(emp);
        System.out.println("Employee added successfully");
    }

    // 2. View All Employees
    public void viewAllEmps() {
        for (Employee emp : empSet) {
            System.out.println(emp);
        }
    }

    // 3. View Single Employee
    public void viewEmp() {
        System.out.println("Enter id: ");
        id = sc.nextInt();
        boolean found = false;
        for (Employee emp : empSet) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
                break; // Stop looking once found
            }
        }
        if (!found) {
            System.out.println("Employee with this id is not present");
        }
    }

    // 4. Update Employee
    public void updateEmployee() {
        System.out.println("Enter id: ");
        id = sc.nextInt();
        boolean found = false;
        for (Employee emp : empSet) {
            if (emp.getId() == id) {
                System.out.println("Enter new name: ");
                name = sc.next();
                System.out.println("Enter new salary: ");
                salary = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("Updated Details of employee are: ");
                System.out.println(emp);
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        }
    }

    // 5. Delete Employee
    public void deleteEmp() {
        System.out.println("Enter id: ");
        id = sc.nextInt();
        boolean found = false;
        Employee empToDelete = null;
        for (Employee emp : empSet) {
            if (emp.getId() == id) {
                empToDelete = emp;
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            empSet.remove(empToDelete);
            System.out.println("Employee deleted successfully!!");
        }
    }
}