package Managment;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNumber, int salary, String depName) {
        super(name, niNumber, salary);
        this.deptName = depName;
    }

    public String getDeptName() {
        return deptName;
    }
}
