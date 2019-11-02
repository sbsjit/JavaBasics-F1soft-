/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.memberAccess;

/**
 *
 * @author Shreejit
 */
//SuperClass
public class A {
    int i; //public content of class A by default
    private int j; //It's private to the Class A
    
    void setij(int a, int b){
        i=a;
        j=b;
    }
}
