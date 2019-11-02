/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics;

/**
 *
 * @author Shreejit
 * @param <T>
 */
public class GenericClass<T> {
    private T type;

    /**
     * @return the type
     */
    public T getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(T type) {
        this.type = type;
    }
    
    

}
