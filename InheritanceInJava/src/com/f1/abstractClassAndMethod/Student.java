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
public class Student extends Person{
    
    private String majorSubject;
    
    public Student(String n, String m){
        super(n);
        majorSubject = m;
    }
    
    @Override
    public String getDescription() {
      return majorSubject;  
    }
    
    
}
