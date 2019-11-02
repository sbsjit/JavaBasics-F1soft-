/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Shreejit
 */
public class ArrayListExample {
           
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hey");
        list.add("!");
        list.add("What's Up");
        list.add("?");
        
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }
        System.out.println(iter.hasNext());
        do{
            System.out.println(iter.next());
         
        }while(iter.hasNext());
        
    }
    
}
