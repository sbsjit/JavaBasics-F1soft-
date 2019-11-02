/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Shreejit
 */
public class LinkedList {
    public static void main(String[] args) {
        
        List<String> staff = new java.util.LinkedList<>();
        staff.add("Bob");
        staff.add("Alice");
        staff.add("Harry");
        staff.add(3,"Malice");
        staff.add(4, "Ronal");
        ListIterator<String> iter = staff.listIterator();
        iter.next();//skip first element
        iter.add("Malice");
        iter.next();
        iter.remove();
        Collections.sort(staff);
//      for(String a : staff){
//          System.out.println(a);
//      }
        System.out.println(staff);
        Collections.sort(staff, Collections.reverseOrder());
        System.out.println(staff);
    }
}
