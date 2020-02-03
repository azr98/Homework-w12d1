package Managment;

import Staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String niNumber, int salary, double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return super.getSalary()*0.02;
    }

}
