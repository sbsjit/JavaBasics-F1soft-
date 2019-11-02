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
public class FinanceDepartmentStaff extends Employee{
    
    private String educationLevel;
    
    private String citizenshipNumber;
    
    
    public FinanceDepartmentStaff(int id, String name, String designation, double salary,
        String educationLevel, String citizenshipNumber) {
        super(id, name, designation, salary);
        this.educationLevel = educationLevel;
        this.citizenshipNumber = citizenshipNumber;
    }

    /**
     * @return the educationLevel
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * @param educationLevel the educationLevel to set
     */
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * @return the citizenshipNumber
     */
    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    /**
     * @param citizenshipNumber the citizenshipNumber to set
     */
    public void setCitizenshipNumber(String citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    @Override
    public void showDetails() {
        System.out.println("Finance Staff");
    }
   
    @Override
    public String toString(){
        return "Name: " + super.getEmployeeName() + ", Designation: " + 
                getEmployeeDesignation() + ", Total Monthly Salary: " 
                + getEmployeeSalary();
    }

}
