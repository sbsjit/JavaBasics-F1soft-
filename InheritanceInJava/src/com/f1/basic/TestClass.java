/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basic;

/**
 *
 * @author Shreejit
 */
public class TestClass {
    
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();
        superObj.i = 10;
        superObj.j= 20;
        System.out.println("Contents of Suber Object: ");
        System.out.println("==============");
        superObj.show();
        subObj.i = 2 ;
        subObj.j= 3;
        subObj.k = 4;
        System.out.println("Contents of subobj: ");
        subObj.showk();
        subObj.sumijk();
        subObj.show();
        System.out.println("===============");
        
    }
    
}
