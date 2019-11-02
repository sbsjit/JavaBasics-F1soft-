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
//Creating the subcclass by extending the SuperClass A
public class B extends A{
  int k;
  void showk(){
      System.out.println("K = " + k);
  }
  
  void sumijk(){
      int sum = i+j+k;
      System.out.println("Sum = " + sum);    
  }
}
    