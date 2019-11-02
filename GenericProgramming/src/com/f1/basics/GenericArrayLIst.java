/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Shreejit
 */
public class GenericArrayLIst {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Shreejit");
        list.add("Bhattarai");
        //list.add(2076);     - - - - -   Results in compile time error
        String name = list.get(0);   // - - - - No type casting required
        System.out.println("Name : " + name);
                 
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
