/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shreejit
 */
public class ShapeTest {
    
    //Creating a method that only accepts child class of Shape
    public static void drawShapes(List<? extends Shape> lists) 
    {
        for(Shape s:lists){  
            s.draw();//calling method of Shape class by child class instance  
        }  
    }
    public static void main(String[] args) {
        List<Rectangle> list1=new ArrayList<>();  
        list1.add(new Rectangle());  
  
        List<Circle> list2=new ArrayList<>();  
        list2.add(new Circle());  
        list2.add(new Circle());  
        
        
  
        drawShapes(list1);  
        drawShapes(list2);  
    }
}
