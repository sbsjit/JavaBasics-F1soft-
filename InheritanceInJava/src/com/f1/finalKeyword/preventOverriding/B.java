/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.finalKeyword.preventOverriding;

/**
 *
 * @author Shreejit
 */

public class B extends A{
    void method(){//Can't override the method() of Super class A as method() is 
        //declared final
        System.out.println("Illegal");
    }
}
