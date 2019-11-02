/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics.withLambdaExpression;

/**
 *
 * @author Shreejit
 */
public class DrawShapeTest {
    
    public static void main(String[] args) {
        
        int width = 20;
        
        //With no argument
        Drawable drawCircle = ()->{  
            System.out.println("Drawing " +width);  
        };  
        drawCircle.draw();  
        
    }
}
