package assignment3;

import java.util.ArrayList;

public class Employee extends Person {
    private double salary;
 public Employee(){}
    public Employee(int id, String name, double salary) {
        super(id,name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Employee id: "+getId()+" name: "+getName()+" salary "+salary+"\n";
    }
}
