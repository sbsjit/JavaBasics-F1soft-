/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.employee;

/**
 *
 * @author Shreejit
 */
public class Staff {
    
    private String name;
    
    private double salary;
    
    public Staff(String n, double s){
        name=n;
        salary=s;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

        
}
