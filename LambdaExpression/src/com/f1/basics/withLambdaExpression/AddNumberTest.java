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
public class AddNumberTest {
    public static void main(String[] args) {
        
        /* Lambda Expression with multiple parameters*/
        AddNumber addNumber = (a, b)->(a+b);    /*Without the return keyword*/
//        AddNumber addNumber = (a, b)->(a/b);
        System.out.println(addNumber.toAddNumbers(20, 40));
        
        /* Multiple parameters with data types specified*/
        AddNumber addNumber1 = (int c, int d) -> {
            return (c+d); /*with return keyword*/
        };
        System.out.println(addNumber.toAddNumbers(35, 25));
    }
}
