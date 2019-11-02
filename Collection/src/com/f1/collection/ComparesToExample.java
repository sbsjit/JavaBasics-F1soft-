/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

/**
 *
 * @author ShreejitW
 */
public class ComparesToExample {
    public static Pair<String> minmax(String[] a) 
    { 
        if (a == null || a.length == 0) 
            return null;
        String min = a[0]; 
        String max = a[0];
        for (int i = 1; i < a.length; i++) 
        { 
            if (min.compareTo(a[i]) > 0) 
                min = a[i];
            System.out.println(min);
            if (max.compareTo(a[i]) < 0) 
                max = a[i];
            System.out.println(max);
        }
    return new Pair<>(min, max);   
    } 
}
