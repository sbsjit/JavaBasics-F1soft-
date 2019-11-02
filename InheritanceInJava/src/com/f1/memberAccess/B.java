/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.memberAccess;

/**
 *
 * @author Shreejit
 */
/*Sub Class --> The Class A's j is not accessible here*/
public class B extends A{
    int total;
    
    void sum()
    {
        total = i + j;//j is not accessible here
    }
}
