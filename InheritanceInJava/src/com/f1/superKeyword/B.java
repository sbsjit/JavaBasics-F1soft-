/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.superKeyword;

/**
 *
 * @author Shreejit
 */
public class B extends A{
    
    private int i;
    public B(int a , int b){
        super.i = a;
        i=b;
    }
    public void show(){
        System.out.println("Value of i of Sub-Class : " + super.i);
        System.out.println("Value of i of Super-Class : " + i);
    }
    
}
