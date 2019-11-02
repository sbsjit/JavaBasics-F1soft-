/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Shreejit
 */
public class SetExample2 {  
      public static void main(String[] args) {
          
        Set<Object> hashset = new HashSet<>();

        hashset.add(2);

        hashset.add("quora");

        hashset.add("in");

        hashset.add("quora"); // duplicate elements

        hashset.add("anyforum"); // duplicate elements

        System.out.println("Set is "+hashset);
    }
}
