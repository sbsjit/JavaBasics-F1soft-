/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.inheritanceHeirarchy;

/**
 *
 * @author Shreejit
 */
public class B extends A{
    public B(){
        System.out.println("o/p from B subclass");
    }
    public B(int a, int b){
        int sum = a + b;
        System.out.println("The sum is : " + sum);
    }
}
