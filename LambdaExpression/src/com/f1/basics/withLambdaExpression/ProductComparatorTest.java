/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics.withLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Shreejit
 */
public class ProductComparatorTest {
    public static void main(String[] args) {
        List<ProductComparator> list = new ArrayList<>();
        list.add(new ProductComparator(1,"Pen",20.0));
        list.add(new ProductComparator(2,"Pencil",10.0));
        list.add(new ProductComparator(3,"Copy",40.0));
        
        System.out.println("Sorting on the basis of name: ");
        
        //Implementing Lambda Expression
        Collections.sort(list, (p1,p2) ->{
            return p1.getName().compareTo(p2.getName());  
        });
        for(ProductComparator p:list){  
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());  
        }  
    }
}
