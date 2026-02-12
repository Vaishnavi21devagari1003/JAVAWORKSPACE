package com.example.test.EmployeeApplication;

public class Employee {
    int id;
    String name;
    double salary;
    String designation;
    int leavesTaken;

    static final int TOTAL_LEAVES = 32;

    public Employee(int id, String name,double salary,String designation,int leavesTaken){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.designation=designation;
        this.leavesTaken=leavesTaken;
    }

    public void calculateSalary() {

        // Increase based on designation
        if (designation.equalsIgnoreCase("programmer")) {
            salary = salary + (salary * 0.10);
        }
        else if (designation.equalsIgnoreCase("designer")) {
            salary = salary + (salary * 0.20);
        }

        // Deduction for extra leaves
        if (leavesTaken > TOTAL_LEAVES) {
            int extraLeaves = leavesTaken - TOTAL_LEAVES;

            double perDaySalary = salary / 30;
            salary = salary - (perDaySalary * extraLeaves);
        }
    }
    public double getSalary() {
        return salary;
    }
}
