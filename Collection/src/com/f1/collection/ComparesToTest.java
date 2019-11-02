/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

/**
 *
 * @author Shreejit
 */
public class ComparesToTest {
    public static void main(String[] args) {
         String[] words = { "Mary", "had", "a", "little", "lamb" };    
         Pair<String> mm = ComparesToExample.minmax(words);       
         System.out.println("min = " + mm.getFirst());     
         System.out.println("max = " + mm.getSecond()); 
    }
}
