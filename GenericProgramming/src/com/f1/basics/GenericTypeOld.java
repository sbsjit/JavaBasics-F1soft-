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

//Type Casting is required
public class GenericTypeOld {

    private Object obj;

   
    public static void main(String args[]){
	GenericTypeOld type = new GenericTypeOld();
	type.setObj("Shreejit"); 
	String str = (String) type.getObj(); //type casting, error prone and can 
                                            //cause ClassCastException
	}

    /**
     * @return the obj
     */
    public Object getObj() {
        return obj;
    }

    
    public void setObj(Object o) {
        this.obj = o;
    }
}
