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

public class Manager extends Staff{
    
    private double bonus;
    
    public Manager(String n, double s){
        super(n,s);
        bonus = 0;
    }

    /*Overrides the getSalary() of the Super Class and then uses super keyword to 
      call the method getSalary of the superclass*/
    @Override
    public double getSalary(){
        double baseSalary= super.getSalary();
        return baseSalary + bonus; 
    }
    
    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
