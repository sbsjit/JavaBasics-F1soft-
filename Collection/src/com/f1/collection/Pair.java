/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

/**
 *
 * @author Shreejit
 * @param <T>
 */
public class Pair<T> {

    private T first;
    private T second;
    public Pair() { 
        first = null; second = null; 
    }   
    public Pair(T first, T second) {
        this.first = first; this.second = second;
    }  
    public T getFirst() { return first; }   
    public T getSecond() { return second; }   
    public void setFirst(T newValue) { first = newValue; }  
    public void setSecond(T newValue) { second = newValue; }
}

