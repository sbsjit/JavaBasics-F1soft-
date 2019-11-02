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
public class DisplayNameTest {
    public static void main(String[] args) {
        
        //Lambda expression with single expression
        DisplayName displayName = (name)->{
            return "Name: " + name;
        };
        System.out.println(displayName.displayNameMethod("Shreejit"));

        //we can omit the funtional parenthesis
        DisplayName displayName2 = name->{
            return "Name: " + name;
        };
        System.out.println(displayName.displayNameMethod("Bhattarai"));

    }
}
