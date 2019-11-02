/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics;

import java.util.ArrayList;
import java.util.List;

/**
 *s
 * @author Shreejit
 */
public class TypeErasureExampleTest {
    public static void main(String[] args) {
       List<Integer> li = new ArrayList<>();
       List<Float> lf = new ArrayList<>();
       if (li.getClass() == lf.getClass()) { // evaluates to true
           System.out.println("Equal");
       }
        
    }
}
