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
public abstract class Person {
    
    private String name;
    
    //Abstract method
    public abstract String getDescription();
    
    public Person(String n){
        name = n;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}
