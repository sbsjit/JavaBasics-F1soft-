/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics.withAnnonymousClass;

/**
 *
 * @author Shreejit
 */
public class DrawShapeTest {
    public static void main(String[] args) {
        int width = 10;
        Drawable drawableObject = new Drawable(){
            public void draw(){
                System.out.println("Drawing " + width );
            }
        };
        drawableObject.draw();
    }
}
