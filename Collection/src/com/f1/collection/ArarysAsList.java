/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Shreejit
 */

/*ArrayList initialized with another collection*/
public class ArarysAsList {
    public static void main(String[] args) {
       String[] names = {"Ram", "Hari", "Alice", "Malice"};
       List<String> list = new ArrayList<>(Arrays.asList(names));
       list.add("Denish");
       list.add("Joseph");
       list.set(2, "Alex");
       Iterator<String> it = list.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       } 
    }
}
