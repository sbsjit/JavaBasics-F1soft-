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
public class Admin extends Employee{
    
    private double adminStaffBonus;
    
    private final String adminStaffDesignation;
    
    public Admin(int id, String name, String designation, double salary) {
        super(id, name, designation, salary);
        this.adminStaffDesignation = designation;
    }

    /**
     * @return the adminStaffBonus
     */
    public double getAdminStaffBonus() {
        return adminStaffBonus;
    }

    /**
     * @param adminStaffBonus the adminStaffBonus to set
     */
    public void setAdminStaffBonus(double adminStaffBonus) {
        this.adminStaffBonus = adminStaffBonus;
    }
    
    @Override
    public double getEmployeeSalary(){
        double baseSalary = super.getEmployeeSalary();
        return baseSalary + baseSalary * 15/100 ;        
    }

    @Override
    public void showDetails() {
       //System.out.println(adminStaffDesignation);
       if(adminStaffDesignation.equals("Manager") == true){
           System.out.println("Admistration Department Head");
       }
       if(adminStaffDesignation.equals("Assistant Manager") == true){
           System.out.println("Administration Department Deputy Head");
       }
    }
   
    @Override
    public String toString(){
        return "Name: " + super.getEmployeeName()
                + ", Total Monthly Salary: " + getEmployeeSalary();
    }  
}
