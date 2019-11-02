/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basics;

/**
 *
 * @author Shreejit
 */

//Generic Class with type T.
public class GenericClassTest {
    	
    public static void main(String args[]){
        GenericClass<String> type = new GenericClass<>();
	type.setType("Shreejit"); //valid
	GenericClass type1 = new GenericClass(); //raw type
//	type1.setType("Bhattarai"); //valid
	type1.setType(10); //valid and autoboxing support
        System.out.println("First Name: " + type.getType());
        System.out.println("Last Name: " + type1.getType());
    }
}
