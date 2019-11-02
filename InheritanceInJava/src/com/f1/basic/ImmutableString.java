/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.basic;

/**
 *
 * @author Shreejit
 */
public class ImmutableString {
    public static void main(String[] args) {
        String s = "Hari";
        s.concat(" Ram");//Ram wont gets appended to s because string are immutable
        System.out.println(s);
        
        //But if we explicitely assign it to the reference variable, it will refer to "Hari Ram" object
        s = s.concat(" Ram");
        System.out.println(s);
        //In such case, s points to the "Hari Ram". Please notice that still hari object is not modified.
    }
}
