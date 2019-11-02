/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.officeApplication.model;

/**
 * @author Shreejit
 */
public abstract class Employee {
    
    private int employeeId;
    
    private String employeeName;
    
    private String employeeDesignation;
    
    private double employeeSalary;
    
    public Employee(int id, String name, String designation, double salary){
        this.employeeId = id;
        this.employeeName = name;
        this.employeeDesignation = designation;
        this.employeeSalary = salary;
    }
    
    public abstract void showDetails();
    

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeDesignation
     */
    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    /**
     * @param employeeDesignation the employeeDesignation to set
     */
    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    /**
     * @return the employeeSalary
     */
    public double getEmployeeSalary() {
        return employeeSalary;
    }

}

