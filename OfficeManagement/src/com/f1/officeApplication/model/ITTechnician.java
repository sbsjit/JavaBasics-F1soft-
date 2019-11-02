/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.officeApplication.model;

/**
 *
 * @author Shreejit
 */
public class ITTechnician extends Employee{
    
    private String subDepartment;
    
    private String specializedTechnology;
    
//    private double technicianBonus;
    
    
    public ITTechnician(int id, String name, String designation, double salary,
            String subDepartment, String specializedTechnology) {
        super(id, name, designation, salary);
//        this.technicianBonus = bonus;
        this.subDepartment = subDepartment;
        this.specializedTechnology = specializedTechnology;
        
    }

    /**
     * @return the department
     */
    public String getSubDepartment() {
        return subDepartment;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.subDepartment = department;
    }

    /**
     * @return the specializedIn
     */
    public String getSpecializedTechnology() {
        return specializedTechnology;
    }

    
    public void setSpecializedTechnology(String specializedTechnology) {
        this.specializedTechnology = specializedTechnology;
    }

    @Override
    public void showDetails() {
        System.out.println("IT developer");
    }

    @Override
    public double getEmployeeSalary(){
        double baseSalary = super.getEmployeeSalary();
        return baseSalary + baseSalary * 10/100;        
    }
    
    @Override
    public String toString(){
        return "Name: " + super.getEmployeeName() 
                + ", Total Monthly Salary: " + getEmployeeSalary();
    }

    
}
