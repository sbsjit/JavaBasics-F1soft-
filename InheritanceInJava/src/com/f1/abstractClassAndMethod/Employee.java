/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.abstractClassAndMethod;

/**
 *
 * @author Shreejit
 */
public class Employee extends Person{
    
    private double salary;
    
    public Employee(String n, double s){
    super(n);
    salary = s;
    }

    @Override
    public String getDescription() {
        return ("The salary is : " + getSalary());
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    
}
