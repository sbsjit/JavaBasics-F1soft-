/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.wildcard;


import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Shreejit
 */

/*  <? super T>  */
public class LowerBoundWildcardExample {
    
     public static void addNumbers(List<? super Integer> list) {  
  
        for(Object n:list)  
        {  
              System.out.println(n);  
        }   
    }  
public static void main(String[] args) {  
      
    List<Integer> l1=Arrays.asList(1,2,3);  
      System.out.println("displaying the Integer values");  
    addNumbers(l1);  
      
    List<Number> l2=Arrays.asList(1.0,2.0,3.0);  
      System.out.println("displaying the Number values");  
    addNumbers(l2);  
}  
        
        /* Sub Typing using Generic Wildcards*/
//        List<? extends Integer> intList = new ArrayList<>();
//        List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>

}
