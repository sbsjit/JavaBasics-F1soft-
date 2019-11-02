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
public class UpperBoundWildcardExample {
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for (Number n : list)
        s += n.doubleValue();
        return s;       
    }
    
    public static void main(String[] args) {
        List<Integer> integer = Arrays.asList(1, 2 , 3 , 5);
        
        List<Double> doubles = Arrays.asList(1.0,2.5,3.8,4.1);
        
        System.out.println("Sum of integers are: " + sumOfList(integer));
        
        System.out.println("Sum of doubles are: " + sumOfList(doubles));
        
    }
    
}
