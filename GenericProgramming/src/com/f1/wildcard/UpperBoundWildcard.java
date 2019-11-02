/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.wildcard;

import java.util.ArrayList;

/**
 *
 * @author Shreejit
 */
public class UpperBoundWildcard {
     
    private static Double add(ArrayList<? extends Number> num) {  
      
        double sum=0.0;  
          
        for(Number n:num)  
        {  
            sum = sum + n.doubleValue();  
        }  
          
        return sum;  
    }  
  
    public static void main(String[] args) {  
          
        ArrayList<Integer> l1=new ArrayList<>();  
        l1.add(10);  
        l1.add(20);  
        System.out.println("displaying the sum= "+add(l1));  
          
        ArrayList<Double> l2=new ArrayList<>();  
        l2.add(30.4);  
        l2.add(40.0);  
        System.out.println("displaying the sum= "+add(l2));   
    }  
      
}
